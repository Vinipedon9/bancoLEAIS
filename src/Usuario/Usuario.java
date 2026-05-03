package Usuario;
import java.util.Random;

public class Usuario {
    public String nome;
    public String cpf;
    public String celular;
    public String email;
    public String conta;
    public String senha;

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
