package BancoLeais.repository;

import BancoLeais.model.Conta;
import BancoLeais.model.Usuario;
import BancoLeais.util.ValidarUserNoBanco;

import java.util.*;

public class BancoDados {
    static HashSet<String> cpfs = new HashSet<>();
    static HashMap<String, Conta> contas = new HashMap<>();

    public static boolean validarCpf(String cpf) {
        if (cpfs.contains(cpf)){
            return true;
        }
        return false;
    }

    public static void cadastrarConta(Conta conta){
        contas.put(conta.numeroDaConta, conta);
        cpfs.add(conta.user.cpf);
    }

    public static void listarContas(){

    }
}
