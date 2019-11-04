package Model;

public class Funcionario {
    private String nomeFuncionario;
    private String sobrenome;
    private String dataNascimento;
    private Double rg;
    private Double cpf;
    private String endereco;
    private Double cep;
    private Double telefone;
    private String cargo;
    private String login;
    private String senha;

    public Funcionario(String nomeFuncionario, String sobrenome, String dataNascimento, Double rg, Double cpf, String endereco, Double cep, Double telefone, String cargo, String login, String senha) {
        this.nomeFuncionario = nomeFuncionario;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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

    public Double getTelefone() {
        return telefone;
    }

    public void setTelefone(Double telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nomeFuncionario='" + nomeFuncionario + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", rg=" + rg +
                ", cpf=" + cpf +
                ", endereco='" + endereco + '\'' +
                ", cep=" + cep +
                ", telefone=" + telefone +
                ", cargo='" + cargo + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

