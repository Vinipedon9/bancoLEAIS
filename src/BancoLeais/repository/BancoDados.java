package BancoLeais.repository;

import BancoLeais.model.Usuario;
import java.util.ArrayList;

public class BancoDados {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    static public void cadastrar(Usuario user) {
        usuarios.add(user);
    }

    static public boolean validarNovaConta(String cpf) {

        if (usuarios.isEmpty()) {
            return true;
        } else {
            for (Usuario usuario : usuarios) {
                if (cpf.equals(usuario.cpf)) {

                    System.out.println("Usuario invalido!");
                    for (int i = 0; i < 29; i++) {
                        System.out.println("=");
                    }

                    return false;
                }
            }
        }
        return true;
    }

}
