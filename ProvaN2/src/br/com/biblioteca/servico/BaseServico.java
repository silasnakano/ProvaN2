package br.com.biblioteca.servico;

import br.com.biblioteca.repositorio.BaseRepositorio;

public abstract class BaseServico<TDado> implements IBaseServico<TDado> {

    protected BaseRepositorio<TDado> repositorio;

    public BaseServico() {

    }

}
