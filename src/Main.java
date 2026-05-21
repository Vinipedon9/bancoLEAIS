import BancoLeais.model.Conta;
import BancoLeais.model.Usuario;
import BancoLeais.service.CriadorDeContas;
import BancoLeais.service.CriarUsuario;
import BancoLeais.view.GUI;

import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        //Entrada do sistema
        while (true) {
            GUI.cabecalho();
            int OpComando = GUI.menu();

            if (OpComando == 1) {
                Usuario user = CriarUsuario.criarUser();
                Conta conta = CriadorDeContas.criarConta(user);
            }
            else if (OpComando == 5) {
                break;
            }
        }
    }
}