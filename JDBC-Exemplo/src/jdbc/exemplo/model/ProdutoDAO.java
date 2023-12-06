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
            String sql = "INSERT INTO produto (nome, preco, quantidade, estado, categoria, vendido, numeroNotaFiscal, dataDaCompra, ativo) VALUES (?,?,?,?,?,?,?,?,?);";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1, p.getNome());
            consulta.setDouble(2, p.getPreco());
            consulta.setInt(3, p.getQuantidade());
            consulta.setString(4, p.getEstado());
            consulta.setString(5, p.getCategoria());
            consulta.setBoolean(6, p.isVendido());
            consulta.setString(7, p.getNumeroNotaFiscal());
            consulta.setString(8, p.getDataDaCompra());
            consulta.setBoolean(9, true);

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
            String sql = "SELECT * FROM produto WHERE ativo = 1";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            // Executar a instrução SQL e pegar os resultados
            ResultSet resposta = consulta.executeQuery();

            while (resposta.next()) {
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

    public static Produto buscarPorId(int id) {
        // Declaração da variável lista que será retornada
        Produto p = new Produto();

        try {
            // Conexão com o banco de dados
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL que será executada
            String sql = "SELECT * FROM produto WHERE id=? AND ativo = 1";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setInt(1, id);

            // Executar a instrução SQL e pegar os resultados
            ResultSet resposta = consulta.executeQuery();

            if (resposta.next()) {
                p.setId(resposta.getInt("id"));
                p.setNome(resposta.getString("nome"));
                p.setPreco(resposta.getDouble("preco"));
                p.setQuantidade(resposta.getInt("quantidade"));
                p.setEstado(resposta.getString("estado"));
                p.setCategoria(resposta.getString("categoria"));
                p.setVendido(resposta.getBoolean("vendido"));
                p.setNumeroNotaFiscal(resposta.getString("numeroNotaFiscal"));
                p.setDataDaCompra(resposta.getString("dataDaCompra"));
            }

            // Desconectar do banco de dados
            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o regitro " + id + " do banco de dados");
        }

        return p;
    }

    public static boolean atualizar(Produto p) {
        try {
            // Conexão com o banco de dados
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL que será executada
            String sql = "UPDATE produto SET nome=?, preco=?, quantidade=?, estado=?, categoria=?, vendido=?, numeroNotaFiscal=?, dataDaCompra=? WHERE id=? AND ativo=1;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            // Passar informações do objeto para a consulta
            consulta.setString(1, p.getNome());
            consulta.setDouble(2, p.getPreco());
            consulta.setInt(3, p.getQuantidade());
            consulta.setString(4, p.getEstado());
            consulta.setString(5, p.getCategoria());
            consulta.setBoolean(6, p.isVendido());
            consulta.setString(7, p.getNumeroNotaFiscal());
            consulta.setString(8, p.getDataDaCompra());
            consulta.setInt(9, p.getId());

            // Executa a instrução SQL
            consulta.execute();

            // Desconectar do banco de dados
            conexao.desconectar();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar regitro no banco de dados");
            return false;
        }
    }

    public static boolean excluir(int id) {
        try {
            // Conexão com o banco de dados
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // NÃO RECOMENDADO
            //String sql = "DELETE FROM produto WHERE id=?;";
            String sql = "UPDATE produto SET ativo = 0 WHERE id=?;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            // Passar informações do objeto para a consulta
            consulta.setInt(1, id);

            // Executa a instrução SQL
            consulta.execute();

            // Desconectar do banco de dados
            conexao.desconectar();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar regitro no banco de dados");
            return false;
        }
    }

    public static boolean recuperar(int id) {
        try {
            // Conexão com o banco de dados
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // NÃO RECOMENDADO
            //String sql = "DELETE FROM produto WHERE id=?;";
            String sql = "UPDATE produto SET ativo = 1 WHERE id=?;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            // Passar informações do objeto para a consulta
            consulta.setInt(1, id);

            // Executa a instrução SQL
            consulta.execute();

            // Desconectar do banco de dados
            conexao.desconectar();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar regitro no banco de dados");
            return false;
        }
    }

    public static List<Produto> filtrarPorNome(String textoPesquisa) {

        // Declaração da variável lista que será retornada
        List<Produto> lista = new ArrayList<Produto>();

        try {
            // Conexão com o banco de dados
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL que será executada
            String sql = "SELECT * FROM produto WHERE ativo = 1 AND nome LIKE ?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1, "%" + textoPesquisa + "%");
            // Executar a instrução SQL e pegar os resultados
            ResultSet resposta = consulta.executeQuery();

            while (resposta.next()) {
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
