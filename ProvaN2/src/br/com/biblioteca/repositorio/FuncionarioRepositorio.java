package br.com.biblioteca.repositorio;

import br.com.biblioteca.dominio.Funcionario;
import br.com.biblioteca.fakeDB.FuncionarioFakeDB;

public class FuncionarioRepositorio extends BaseRepositorio<Funcionario> {

    public FuncionarioRepositorio() {
        super();
        this.tabela = new FuncionarioFakeDB().getTabela();
    }

    @Override
    public Funcionario Create(Funcionario obj) {

        int chave = 0;

        if (this.tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.tabela.size();
            chave = this.tabela.get(tamanho - 1).getCodigo() + 1;
        }

        obj.setCodigo(chave);
        this.tabela.add(obj);

        return obj;

    }

    @Override
    public Funcionario Read(int chave) {

        Funcionario res = new Funcionario();

        for (Funcionario tupla : this.tabela) {

            if (tupla.getCodigo() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }

        }

        return res;

    }

    @Override
    public Funcionario Update(Funcionario obj) {

        Funcionario alteracao = this.Read(obj.getCodigo());

        if (alteracao != null) {
            alteracao.setNome(obj.getNome());
        }

        return alteracao;

    }

}
