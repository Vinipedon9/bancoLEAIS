package BancoLeais.service;

import BancoLeais.model.Usuario;
import BancoLeais.repository.BancoDados;

public class CriarUsuario {


    public static Usuario criarUser(){

        var nome = CadastrarDadosPessoais.getNome();
        var cpf = CadastrarDadosPessoais.getCpf();
        var numero = CadastrarDadosPessoais.getNumero();
        var email = CadastrarDadosPessoais.getEmail();
        var senha = CriarSenha.criarSenha();

        var cpfInvalido = BancoDados.validarCpf(cpf);
        if (cpfInvalido) {
            return null;
        }
        return new Usuario(nome, cpf, numero, email, senha);
    }
}
