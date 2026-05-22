package BancoLeais.model;

public class Usuario {
    public String nome;
    public String cpf;
    public String celular;
    public String email;
    public String senha;

    public Usuario (String nomeC,String cpfC, String numeroDeContatoC, String emailC, String senhaC){
        nome = nomeC;
        cpf = cpfC;
        celular = numeroDeContatoC;
        email = emailC;
        senha = senhaC;
    }

}
