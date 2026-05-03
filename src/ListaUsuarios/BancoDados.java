package ListaUsuarios;
import Usuario.Usuario;

import java.util.ArrayList;

public class BancoDados {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    static public void cadastrar(Usuario user) {
        usuarios.add(user);
    }

}
