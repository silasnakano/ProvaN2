package br.com.biblioteca.fakeDB;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFakeDB<T> {

    protected List<T> tabela;

    public List<T> getTabela() {

        if (this.tabela == null) {
            this.tabela = new ArrayList<T>();
            this.AutoFill();
        }

        return this.tabela;

    }

    public abstract void AutoFill();

}
