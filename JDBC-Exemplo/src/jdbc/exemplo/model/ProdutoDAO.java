package jdbc.exemplo.model;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    // TO DO: CRUD e filtro de produtos
    
    // Cadastro no banco de dados
    public static boolean cadastrar(Produto p) {
        try {
            // Conexão com o banco de dados
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();
            
            // Instrução SQL que será executada
            String sql = "INSERT INTO produto (nome, preco, quantidade, estado, categoria, vendido, numeroNotaFiscal, dataDaCompra) VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1, p.getNome());
            consulta.setDouble(2, p.getPreco());
            consulta.setInt(3, p.getQuantidade());
            consulta.setString(4, p.getEstado());
            consulta.setString(5, p.getCategoria());
            consulta.setBoolean(6, p.isVendido());
            consulta.setString(7, p.getNumeroNotaFiscal());
            consulta.setString(8, p.getDataDaCompra());
            
            // Executa a instrução SQL
            consulta.execute();
            
            // Desconectar do banco de dados
            conexao.desconectar();  
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar regitro no banco de dados");
            return false;
        }
    }
    
    public static List<Produto> listarTodos() {
        // Declaração da variável lista que será retornada
        List<Produto> lista = new ArrayList<Produto>();
        
        try {
            // Conexão com o banco de dados
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();
            
            // Instrução SQL que será executada
            String sql = "SELECT * FROM produto";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            
            // Executar a instrução SQL e pegar os resultados
            ResultSet resposta = consulta.executeQuery();
            
            while(resposta.next()) {
                Produto p = new Produto();
                
                p.setId(resposta.getInt("id"));
                p.setNome(resposta.getString("nome"));
                p.setPreco(resposta.getDouble("preco"));
                p.setQuantidade(resposta.getInt("quantidade"));
                p.setEstado(resposta.getString("estado"));
                p.setCategoria(resposta.getString("categoria"));
                p.setVendido(resposta.getBoolean("vendido"));
                p.setNumeroNotaFiscal(resposta.getString("numeroNotaFiscal"));
                p.setDataDaCompra(resposta.getString("dataDaCompra"));
                
                lista.add(p);
            }
            
            // Desconectar do banco de dados
            conexao.desconectar();  
        } catch (SQLException e) {
            System.out.println("Erro ao listar os regitros do banco de dados");
        }    
        
        return lista;
    }
    
}
