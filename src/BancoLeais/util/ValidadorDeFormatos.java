package BancoLeais.util;

import java.util.ArrayList;

public class ValidadorDeFormatos {


    public boolean validarCPF(String cpf){
        ArrayList<String> numerosDoCpf = new ArrayList<>();
        ArrayList<String> pontos = new ArrayList<>();
        int traco = 0;

        if (cpf.length() < 13 || cpf.length() > 14) {
            return false;
        }

        for (int i = 0; i < cpf.length(); i++) {
            String caractere = String.valueOf(cpf.charAt(i));

            if (i == 4) {
                if (numerosDoCpf.size() != 3 || pontos.size() != 1) {
                    return false;
                }
            }
            if (i == 8) {
                if (numerosDoCpf.size() != 6 || pontos.size() != 2) {
                    return false;
                }
            }
            if (i == 12) {
                if (numerosDoCpf.size() != 9 || pontos.size() != 2 || traco != 1) {
                    return false;
                }
            }
            if (numerosDoCpf.size() == 9 || numerosDoCpf.size() > 12) {
                return false;
            }


            if (!caractere.equals(".") && !caractere.equals("-")) {
                numerosDoCpf.add(caractere);
            }
            if (caractere.equals(".")) {
                pontos.add(caractere);
            }
            if (caractere.equals("-")) {
                traco = 1;
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
        if (email.contains("@") == false) {
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
