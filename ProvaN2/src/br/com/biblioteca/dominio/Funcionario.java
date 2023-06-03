package br.com.biblioteca.dominio;

public class Funcionario extends Pessoa {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario() {

    }

    public Funcionario(int codigo, String nome, String telefone, String endereco, String matricula) {
        super(codigo, nome, telefone, endereco);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario [matricula=" + matricula + "]";
    }

}
