package br.com.biblioteca.servico;

import java.util.List;

import br.com.biblioteca.dominio.Cliente;
import br.com.biblioteca.repositorio.ClienteRepositorio;

public class ClienteServico extends BaseServico<Cliente> {

    public ClienteServico() {
        super();
        this.repositorio = new ClienteRepositorio();
    }

    @Override
    public Cliente Criar(Cliente obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Cliente Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Cliente> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Cliente Atualizar(Cliente obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Cliente Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}
