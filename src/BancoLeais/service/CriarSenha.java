package BancoLeais.service;

import BancoLeais.util.ValidadorDeFormatos;
import java.util.Scanner;

public class CriarSenha {
    static ValidadorDeFormatos validador = new ValidadorDeFormatos();
    static Scanner leia = new Scanner(System.in);

    public static String criarSenha(){

        System.out.print("Senha: ");
        var senha = leia.nextLine();
        var validarSenha = validador.validarSenha(senha);
        while (!validarSenha) {
            System.out.print("Senha: ");
            senha = leia.nextLine();
            validarSenha = validador.validarSenha(senha);
        }

        System.out.print("Digite a senha novamente: ");
        var senhaDeConfirmacao = leia.nextLine();


        while (!senha.equals(senhaDeConfirmacao)) {
            System.out.println("ERRO! as senhas digitadas não são correspondentes.");
            System.out.print("Digite a senha novamente: ");
            senhaDeConfirmacao = leia.nextLine();
        }
        return senha;
    }
}
