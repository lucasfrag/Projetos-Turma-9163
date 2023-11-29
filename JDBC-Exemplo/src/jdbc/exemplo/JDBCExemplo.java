package jdbc.exemplo;

import jdbc.exemplo.model.ConexaoJDBC;
import jdbc.exemplo.model.Produto;
import jdbc.exemplo.model.ProdutoDAO;
import jdbc.exemplo.view.ProdutoCadastro;
import jdbc.exemplo.view.ProdutoListagem;

public class JDBCExemplo {

    public static void main(String[] args) {
        
        ProdutoListagem tela = new ProdutoListagem();
        tela.setVisible(true);
        
        // Teste do cadastro de produto
        // Produto p = new Produto(0, "Teste Java", 650.93, 2, "Novo", "Software", false, "", "2023-11-28");
        // ProdutoDAO.cadastrar(p);
    }
    
}
