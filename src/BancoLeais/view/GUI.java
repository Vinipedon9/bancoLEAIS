package BancoLeais.view;

import java.util.Scanner;

public class GUI {
    static Scanner leia = new Scanner(System.in);

    public static void cabecalho() {
        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("        Banco Leais");
        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static int menu() {
        System.out.println("1. Criar conta");
        System.out.println("5. Fechar sistema");
        System.out.print(">>> ");
        var OpComando = Integer.parseInt(leia.nextLine());

        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();

        return OpComando;
    }
}
