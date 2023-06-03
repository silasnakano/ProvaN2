package br.com.biblioteca.fakeDB;

import br.com.biblioteca.dominio.Cliente;

public class ClienteFakeDB extends BaseFakeDB<Cliente> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Cliente(1, "Nome01", "35212345", "Endereco01", "23454323401", "1234563"));
        this.tabela.add(new Cliente(2, "Nome02", "32145324", "Endereco02", "54322345463", "2341532"));
        this.tabela.add(new Cliente(3, "Nome03", "31352342", "Endereco03", "14346345243", "7452465"));
    }

}
