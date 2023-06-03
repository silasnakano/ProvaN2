package br.com.biblioteca.dominio;

public abstract class Pessoa extends BaseAtributos {

    protected String nome;
    protected String telefone;
    protected String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pessoa() {

    }

    public Pessoa(int codigo, String nome, String telefone, String endereco) {
        super(codigo);
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

}
