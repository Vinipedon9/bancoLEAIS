import BancoLeais.model.Conta;
import BancoLeais.model.Usuario;
import BancoLeais.repository.BancoDados;
import BancoLeais.service.CriadorDeContas;
import BancoLeais.service.CriarUsuario;
import BancoLeais.view.GUI;

import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        //Entrada do sistema
        while (true) {
            GUI.cabecalho();
            int opComando = GUI.menu();

            if (opComando == 1) {
                Usuario user = CriarUsuario.criarUser();
                Conta conta = CriadorDeContas.criarConta(user);
                if (user != null) {
                    BancoDados.cadastrarConta(conta);
                } else {
                    System.out.println("Usuário Já cadastrado");
                }
            }
            if (opComando == 2) {
                BancoDados.listarContas();
            }
            if (opComando == 5) {
                break;
            }
        }
    }
}