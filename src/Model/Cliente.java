package Model;

import java.util.Date;

public class Cliente {

    private String nomeCliente;
    private String sobreNome;
    private Date dataNascimento;
    private Double rg;
    private Double cpf;
    private String endereco;
    private Double cep;

    public Cliente(String nomeCliente, String sobreNome, Date dataNascimento, Double rg, Double cpf, String endereco, Double cep) {
        this.nomeCliente = nomeCliente;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getRg() {
        return rg;
    }

    public void setRg(Double rg) {
        this.rg = rg;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getCep() {
        return cep;
    }

    public void setCep(Double cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", rg=" + rg +
                ", cpf=" + cpf +
                ", endereco='" + endereco + '\'' +
                ", cep=" + cep +
                '}';
    }
}

