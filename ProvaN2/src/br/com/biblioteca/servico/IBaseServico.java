package br.com.biblioteca.servico;

import java.util.List;

public interface IBaseServico<TDado> {

    TDado Criar(TDado obj);

    TDado Ler(int chave);

    List<TDado> Ler();

    TDado Atualizar(TDado obj);

    TDado Deletar(int chave);

}
