package BancoLeais.service;

import java.util.Random;

public class CriadorDeContas {

    static public String criarConta(){
        Random aleatorio = new Random();
        String conta = "";
        for (int i = 0; i < 5; i++) {
            var valorAleatorio = aleatorio.nextInt(9);
            conta += valorAleatorio;
        }
        return conta;
    }

    static public String criarDigito(){
        Random aleatorio = new Random();
        var numeroDigito = aleatorio.nextInt(9);

        return String.valueOf(numeroDigito);
    }

}
