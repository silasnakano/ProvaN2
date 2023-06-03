package br.com.biblioteca.fakeDB;

import br.com.biblioteca.dominio.Funcionario;

public class FuncionarioFakeDB extends BaseFakeDB<Funcionario> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Funcionario(1, "Func01", "34560789", "Endereco01", "Matricula01"));
        this.tabela.add(new Funcionario(2, "Func02", "32456546", "Endereco02", "Matricula02"));
        this.tabela.add(new Funcionario(3, "Func03", "31425643", "Endereco03", "Matricula03"));
    }

}
