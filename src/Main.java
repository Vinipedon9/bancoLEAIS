import BancoLeais.model.Usuario;
import BancoLeais.service.CriarUsuario;
import BancoLeais.view.GUI;

import java.util.Scanner;


public class Main{

    public static void main(String[] args) {

        GUI.cabecalho();

        //Entrada do sistema
        while (true) {

            int OpComando = GUI.menu();

            if (OpComando == 1) {
                Usuario user = CriarUsuario.criarUser();
            }
            else if (OpComando == 5) {
                break;
            }
        }
    }
}