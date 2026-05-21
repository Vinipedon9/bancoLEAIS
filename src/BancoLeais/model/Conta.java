package BancoLeais.model;

import BancoLeais.model.Usuario;

public class Conta {
    String numeroDaConta;
    double saldo;
    Usuario user;

    public Conta(String numeroDaConta, double saldo, Usuario user){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.user = user;
    }
}
