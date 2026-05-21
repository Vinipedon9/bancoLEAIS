package BancoLeais.service;

import BancoLeais.util.ValidadorDeFormatos;
import java.util.Scanner;

public class CadastrarDadosPessoais {
    static Scanner leia = new Scanner(System.in);
    static ValidadorDeFormatos validador = new ValidadorDeFormatos();

    public static String getNome(){
        String nomeCompleto;
        System.out.print("Nome completo: ");
        nomeCompleto = leia.nextLine();

        return nomeCompleto;
    }

    public static String getCpf() {
        String cpf;
        System.out.print("CPF (siga o formato: XXX.XXX.XXX-XX): ");
        cpf = leia.nextLine();

        var validarCPF = validador.validarCPF(cpf);

        while (!validarCPF) {
            System.out.println("Formato invalido!");
            System.out.print("CPF (siga o formato: XXX.XXX.XXX-XX): ");
            cpf = leia.nextLine();
            validarCPF = validador.validarCPF(cpf);
        }

        return cpf;
    }

    public static String getNumero() {
        String numero;
        System.out.print("Numero de contato (siga o formato: (xx)xxxxx-xxxx): ");
        numero = leia.nextLine();

        var validarCelular = validador.validarCelular(numero);

        while (!validarCelular) {
            System.out.println("Invalido!");
            System.out.print("Numero de contato (siga o formato: (xx)xxxxx-xxxx): ");
            numero = leia.nextLine();
            validarCelular = validador.validarCelular(numero);
        }

        return numero;
    }

    public static String getEmail(){
        String email;
        System.out.print("Email: ");
        email = leia.nextLine();
        var validarEmail = validador.validarEmail(email);
        while (!validarEmail){
            System.out.println("Email invalido!");
            System.out.print("Email: ");
            email = leia.nextLine();
            validarEmail = validador.validarEmail(email);
        }
        return email;
    }
}
