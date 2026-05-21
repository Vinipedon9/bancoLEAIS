package BancoLeais.util;

import java.util.ArrayList;
import java.util.List;

public class ValidadorDeFormatos {


    public boolean validarCPF(String cpf){

        ArrayList<String> numeros = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));


        if (cpf.length() < 13 || cpf.length() > 14){
            return false;
        }

        for (int i = 0; i < cpf.length(); i++) {
            var caractere = String.valueOf(cpf.charAt(i));
            if (i == 0 || i == 1 || i == 2 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 10 || i == 12){
                if (!numeros.contains(caractere)){
                    return false;
                }
            }

            if (i == 3 || i == 7){
                if (!caractere.equals(".")){
                    System.out.println("Não ha um ponto");
                    return false;
                }
            }

            if (i == 11){
                if (!caractere.equals("-")){
                    return false;
                }
            }

            if (cpf.length() > 13) {
                if (i == 13){
                   if (!numeros.contains(caractere)){
                        return false;
                   }
                }
            }
        }
        return true;
    }

    public boolean validarCelular(String numero){
        ArrayList<String> numeros = new ArrayList<>();
        ArrayList<String> ddd = new ArrayList<>();
        ArrayList<String> parenteses = new ArrayList<>();
        int traco = 0;

        for (int i = 0; i < numero.length(); i++) {
            var caractere = String.valueOf(numero.charAt(i));

            if (i == 0 && !caractere.equals("(")){
                return false;
            }
            if (i == 3 && !caractere.equals(")")){
                return false;
            }
            if (caractere.equals("-") && numeros.size() != 7) {
                return false;
            }
            if (i == 14 && numeros.size() != 11){
                return false;
            }

            if (!caractere.equals("(") && !caractere.equals(")") && !caractere.equals("-")) {
                numeros.add(caractere);
            }
            if (caractere.equals("(") || caractere.equals(")")) {
                parenteses.add(caractere);
            }
            if (caractere.equals("-")){
                traco += 1;
            }

        }
        if (traco == 0) {
            return false;
        }
        return true;
    }

    public boolean validarEmail(String email) {
        char primeiroCaractere = email.charAt(0);
        if (primeiroCaractere == '@') {
            return false;
        }
        if (!email.contains("@")) {
            return false;
        }

        return true;
    }

    public boolean validarSenha(String senha) {

        String maiusculas = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String minusculas = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String simbolos = "! @ # $ % ^ & * ( ) _ + - = { } [ ] \\\\ | ; : ' \" < > , . ? /";
        String numeros = "0 1 2 3 4 5 6 7 8 9";

        if (senha.length() < 8) {
            System.out.println("Senha invalida! a senha deve conter mais de 8 caracteres.");
            return false;
        }

        var contagemMaiusculas = 0;
        var contagemMinusculas = 0;
        var contagemNumeros = 0;
        var contagemSimbolos = 0;

        for (int i = 0; i < senha.length(); i++) {
            String caractere = String.valueOf(senha.charAt(i));

            if (maiusculas.contains(caractere)) {
                contagemMaiusculas += 1;
            }
            else if (minusculas.contains(caractere)) {
                contagemMinusculas += 1;
            }
            else if (simbolos.contains(caractere)) {
                contagemSimbolos += 1;
            }
            else if (numeros.contains(caractere)) {
                contagemNumeros += 1;
            }
        }

        if (contagemMaiusculas == 0 || contagemMinusculas == 0 || contagemNumeros == 0 || contagemSimbolos == 0) {
            System.out.println(contagemMaiusculas);
            System.out.println(contagemMinusculas);
            System.out.println(contagemNumeros);
            System.out.println(contagemSimbolos);
            System.out.println("Senha invalida! A senha deve conter letras maiusculas, letras minusculas, simbolos " +
                    "e numeros.");
            return false;
        }
        return true;
    }
}
