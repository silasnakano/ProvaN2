package br.com.biblioteca.dominio;

public class Cliente extends Pessoa {

    private String cpf;
    private String rg;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Cliente() {

    }

    public Cliente(int codigo, String nome, String telefone, String endereco, String cpf, String rg) {
        super(codigo, nome, telefone, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", rg=" + rg + "]";
    }

}
