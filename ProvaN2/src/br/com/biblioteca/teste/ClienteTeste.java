package br.com.biblioteca.teste;

import java.util.List;

import br.com.biblioteca.dominio.Cliente;
import br.com.biblioteca.servico.ClienteServico;

public class ClienteTeste extends BaseTeste<Cliente> {

    public ClienteTeste() {
        super();
        this.servico = new ClienteServico();
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();

        this.TestarAtualizacao(valorChave);
        this.TestarDeletar(valorChave);
        // this.TestarLeitura();
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando Create: ");

        Cliente cat = new Cliente(1, "Nome01", "35212345", "Endereco01", "23454323401", "1234563");
        Cliente novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Cliente cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Cliente> lista = this.servico.Ler();

        for (Cliente cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        Cliente antigo = this.servico.Ler(chave);

        antigo.setNome("Outro Nome");

        Cliente alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        Cliente alvo = this.servico.Ler(chave);

        Cliente excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }

}
