package br.com.biblioteca.dominio;

public abstract class BaseAtributos {

    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BaseAtributos() {
    }

    public BaseAtributos(int codigo) {
        this.codigo = codigo;
    }

}
