package br.com.biblioteca.repositorio;

import java.util.List;

public abstract class BaseRepositorio<TTipo> implements IBaseRepositorio<TTipo> {

    protected List<TTipo> tabela;

    @Override
    public List<TTipo> Read() {
        return this.tabela;
    }

    @Override
    public TTipo Delete(int chave) {

        TTipo original = this.Read(chave);

        if (original != null) {
            this.tabela.remove(original);
        }

        return original;

    }

}
