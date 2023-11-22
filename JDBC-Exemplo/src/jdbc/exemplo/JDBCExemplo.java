package jdbc.exemplo;

import jdbc.exemplo.model.ConexaoJDBC;

public class JDBCExemplo {

    public static void main(String[] args) {
        ConexaoJDBC jdbc = new ConexaoJDBC();
        jdbc.conectar();
        jdbc.desconectar();
    }
    
}
