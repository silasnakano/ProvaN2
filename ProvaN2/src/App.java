import br.com.biblioteca.teste.ClienteTeste;
import br.com.biblioteca.teste.FuncionarioTeste;

public class App {
    public static void main(String[] args) throws Exception {

        FuncionarioTeste teste1 = new FuncionarioTeste();
        teste1.Executar();

        System.out.println();

        ClienteTeste teste2 = new ClienteTeste();
        teste2.Executar();

    }
}
