package gui.builder.exemplo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ProdutoCSV {
        // Caminho do arquivo
        private static String nomeArquivo = "./dados/Produtos.csv";
    
        // Método para adicionar um filme ao arquivo CSV
        public static boolean AdicionarProduto(Produto p) {
            try {
                // Verificar se o arquivo já existe
                boolean arquivoExiste = new File(nomeArquivo).exists();
                
                
                // Abre o escritor para adicionar dados ao arquivo
                FileWriter escritor = new FileWriter(nomeArquivo, StandardCharsets.ISO_8859_1, true);
                if (!arquivoExiste) {
                    escritor.write("ID;Nome;Preço;Quantidade;Estado;Categoria\n");
                }
                
                // Escrever os dados do filme no formato apropriado
                escritor.write(p.getId() + ";" + p.getNome() + ";" + p.getPreco() + ";" + p.getQuantidade() + ";" + p.getEstado() + ";" + p.getCategoria() + "\n");
                
                // Escrever todos os dados do buffer no arquivo imediatamente
                escritor.flush();
                
                // Fecha o recurso de escrita
                escritor.close();
                return true;
                
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        
        // Método para listar os filmes do arquivo CSV
        public static ArrayList<Produto> ListarProduto() {
            ArrayList<Produto> lista = new ArrayList<>();
            
            try {
                // Abrir o leitor para ler o arquivo
                BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
                String linha;
                boolean primeiraLinha = true;
                
                while ( (linha = leitor.readLine()) != null ) {
                    // Ignora a primeira linha 
                    if (primeiraLinha) {
                        primeiraLinha = false;
                        continue;
                    }
                    
                    // Dividir a linha em partes usando o ponto e vírgula como separador
                    String[] partes = linha.split(";");
                    
                    
                    // Criar o objeto filme
                    Produto p = new Produto();
                    p.setId(Integer.parseInt(partes[0]));
                    p.setNome(partes[1]);
                    p.setPreco(Double.parseDouble(partes[2]));
                    p.setQuantidade(Integer.parseInt(partes[3]));
                    p.setEstado(partes[4]);
                    p.setCategoria(partes[5]);
                    
                    // Adiciona na lista
                    lista.add(p);
                    
                    // Imprimir informações do filme
                    System.out.println(p.getId() + " - " + p.getNome());
                }
                
                leitor.close();
                
            } catch(IOException e) {
                e.printStackTrace();
            }
            
            return lista;
        }
}