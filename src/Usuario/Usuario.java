package Usuario;
import java.util.Random;

public class Usuario {
    String nome;
    String cpf;
    String celular;
    String email;
    String conta;
    String senha;

    public Usuario (String nomeC,String cpfC, String numeroDeContatoC, String emailC, String senhaC){
        nome = nomeC;
        cpf = cpfC;
        celular = numeroDeContatoC;
        email = emailC;
        senha = senhaC;
    }

    public void getConta(String contaParametro, String digitoParametro) {
        conta = contaParametro;

        conta = conta + "-" + digitoParametro;
    }
}
