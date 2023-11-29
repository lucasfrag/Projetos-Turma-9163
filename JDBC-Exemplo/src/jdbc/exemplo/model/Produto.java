
package jdbc.exemplo.model;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private String estado;
    private String categoria;
    private boolean vendido;
    private String numeroNotaFiscal;
    private String dataDaCompra;

    public Produto() {
        
    }

    public Produto(int id, String nome, double preco, int quantidade, String estado, String categoria, boolean vendido, String numeroNotaFiscal, String dataDaCompra) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.estado = estado;
        this.categoria = categoria;
        this.vendido = vendido;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.dataDaCompra = dataDaCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }
    
    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }    
    
    // Exemplo: 28/11/2023 para 2023-11-28
    public static String converterParaSQL(String dataAntiga) {
        String[] partesData = dataAntiga.split("/");
        String dataNova = partesData[2] + "-" + partesData[1] + "-" + partesData[0];
        return dataNova;
    }
    
    // Exemplo: 2023-11-28 para 28/11/2023
    public static String converterParaJava(String dataAntiga) {
        String[] partesData = dataAntiga.split("-");
        String dataNova = partesData[2] + "/" + partesData[1] + "/" + partesData[0];
        return dataNova;        
    }
    
    
}
