package br.com.biblioteca.repositorio;

import br.com.biblioteca.dominio.Cliente;
import br.com.biblioteca.fakeDB.ClienteFakeDB;

public class ClienteRepositorio extends BaseRepositorio<Cliente> {

    public ClienteRepositorio() {
        super();
        this.tabela = new ClienteFakeDB().getTabela();
    }

    @Override
    public Cliente Create(Cliente obj) {

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
    public Cliente Read(int chave) {

        Cliente res = new Cliente();

        for (Cliente tupla : this.tabela) {

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
    public Cliente Update(Cliente obj) {

        Cliente alteracao = this.Read(obj.getCodigo());

        if (alteracao != null) {
            alteracao.setNome(obj.getNome());
        }

        return alteracao;

    }

}
