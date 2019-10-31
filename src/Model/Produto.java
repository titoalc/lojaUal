package Model;

public class Produto {

    private String nomeProduto;
    private String marca;
    private Double precoDeVenda;
    private Double precoDeCusto;
    private String fornecedor;
    private Double quantidadeDeProduto;
    private String categoria;
    private String codigo;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public Double getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(Double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Double getQuantidadeDeProduto() {
        return quantidadeDeProduto;
    }

    public void setQuantidadeDeProduto(Double quantidadeDeProduto) {
        this.quantidadeDeProduto = quantidadeDeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", marca='" + marca + '\'' +
                ", precoDeVenda=" + precoDeVenda +
                ", precoDeCusto=" + precoDeCusto +
                ", fornecedor='" + fornecedor + '\'' +
                ", quantidadeDeProduto=" + quantidadeDeProduto +
                ", categoria='" + categoria + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    public Produto(String nomeProduto, String marca, Double precoDeVenda, Double precoDeCusto, String fornecedor, Double quantidadeDeProduto, String categoria, String codigo) {
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.precoDeVenda = precoDeVenda;
        this.precoDeCusto = precoDeCusto;
        this.fornecedor = fornecedor;
        this.quantidadeDeProduto = quantidadeDeProduto;
        this.categoria = categoria;
        this.codigo = codigo;





    }
}
