package BancoLeais.service;

import BancoLeais.model.Usuario;
public class CriarUsuario {


    public static Usuario criarUser(){

        var nome = CadastrarDadosPessoais.getNome();
        var cpf = CadastrarDadosPessoais.getCpf();
        var numero = CadastrarDadosPessoais.getNumero();
        var email = CadastrarDadosPessoais.getEmail();
        var senha = CriarSenha.criarSenha();

        return new Usuario(nome, cpf, numero, email, senha);
    }
}
