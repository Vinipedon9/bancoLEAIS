package BancoLeais.service;

import BancoLeais.model.Conta;
import BancoLeais.model.Usuario;

import java.util.Random;
import java.util.Scanner;

public class CriadorDeContas {
    static Random random = new Random();
    static Scanner leia = new Scanner(System.in);

    public static String criarNumeroDaConta() {
        String numero = "";
        for (int i = 0; i < 8; i++) {
            if (i != 6) {
                numero += random.nextInt(9);
            } else{
                numero += "-";
            }
        }

        return numero;
    }

    public static Conta criarConta(Usuario user) {
        var numeroDaConta = criarNumeroDaConta();

        System.out.println("Deseja criar a conta com saldo inicial? [S/N] ");
        System.out.print(">>> ");
        var escolhaDeSaldo = leia.nextLine().toLowerCase();
        while (!escolhaDeSaldo.equals("s") && !escolhaDeSaldo.equals("n")){
            System.out.println("ERRO! DIGITE APENAS S OU N");
            System.out.println("Deseja criar a conta com saldo inicial? [S/N] ");
            System.out.print(">>> ");
            escolhaDeSaldo = leia.nextLine().toLowerCase();
        }
        double saldo;
        if (escolhaDeSaldo.equals("n")){
            saldo = 0;
        }
        else {
            System.out.print("Digite o valor de abertura: ");
            saldo = Double.parseDouble(leia.nextLine());
        }


        return new Conta(numeroDaConta, saldo, user);
    }
}
