package gui.builder.exemplo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaProduto {

    public static ArrayList<Produto> lista = new ArrayList<Produto>();

    public static boolean adicionar(Produto p) {
        // Tratamento de Exceções
        try {
            // Ser tudo certo:
            // Validações
            if (p.getNome().isBlank() || p.getNome().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O valor de nome não pode estar em branco!");
            } else if (p.getNome().length() <= 10) {
                JOptionPane.showMessageDialog(null, "O valor de nome precisa ter pelo menos 10 caracteres!");
            } else if (p.getEstado().isBlank() || p.getEstado().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecione o estado do produto!");
            } else if (p.getCategoria().isBlank() || p.getCategoria().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O valor de categoria não pode estar em branco!");
            } else if (p.getPreco() <= 0) {
                JOptionPane.showMessageDialog(null, "O preço precisa ser um valor maior que 0! Valores em branco também não são aceitos.");
            } else if (p.getQuantidade() <= 0) {
                JOptionPane.showMessageDialog(null, "A quantidade precisa ser um valor maior que 0! Valores em branco também não são aceitos.");
            } else {
                
                if (lista.size() == 0) {
                    p.setId(1);
                } else if (lista.size() > 0) {
                    p.setId( lista.get(lista.size() -1 ).getId() + 1 )  ;
                }
                
                lista.add(p);
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                return true;
            }
        } catch (Exception e) {
            // Se der tudo errado:
            System.out.print("Ocorreu um erro ao adicionar a lista");
        }
        return false;
    }

    public static ArrayList<Produto> Listar() {
        return lista;
    }

    public static boolean excluir(int id) {
        try {
            if (id <= 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item para excluir.");
            } else {
                lista.remove(id);
                return true;
            }
        } catch(Exception e) {
            System.out.println("Ocorreu um erro ao excluir da lista");
        }
        
        return false;
    }

}
