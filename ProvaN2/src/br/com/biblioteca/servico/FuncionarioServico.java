package br.com.biblioteca.servico;

import java.util.List;

import br.com.biblioteca.dominio.Funcionario;
import br.com.biblioteca.repositorio.FuncionarioRepositorio;

public class FuncionarioServico extends BaseServico<Funcionario> {

    public FuncionarioServico() {
        super();
        this.repositorio = new FuncionarioRepositorio();
    }

    @Override
    public Funcionario Criar(Funcionario obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Funcionario Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Funcionario> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Funcionario Atualizar(Funcionario obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Funcionario Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}
