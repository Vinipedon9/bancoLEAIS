import ListaUsuarios.BancoDados;
import Usuario.Usuario;
import java.util.Scanner;

public class Main{

    static void cabecalho() {
        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("        Banco Leais");
        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ValidadorDeFormatos validador = new ValidadorDeFormatos();

        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("        Banco Leais");
        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();

        //Entrada do sistema
        while (true) {
            int OpComando;

            System.out.println("1. Criar conta");
            System.out.println("5. Fechar sistema");
            System.out.print(">>> ");
            OpComando = Integer.parseInt(leia.nextLine());

            for (int i = 0; i < 29; i++) {
                System.out.print("-");
            }
            System.out.println();

            if (OpComando == 1) {
                String nomeCompleto;
                System.out.print("Nome completo: ");
                nomeCompleto = leia.nextLine();

                String cpf;
                System.out.print("CPF (siga o formato: XXX.XXX.XXX-XX): ");
                cpf = leia.nextLine();

                var validarCPF = validador.validarCPF(cpf);
                if (!validarCPF) {
                    System.out.println("Formato invalido!");
                }
                while (!validarCPF) {
                    System.out.print("CPF (siga o formato: XXX.XXX.XXX-XX): ");
                    cpf = leia.nextLine();
                    validarCPF = validador.validarCPF(cpf);
                    if (!validarCPF) {
                        System.out.println("Formato invalido!");
                    }
                }

                String numero;
                System.out.print("Numero de contato (siga o formato: (xx)xxxxx-xxxx): ");
                numero = leia.nextLine();
                var validarCelular = validador.validarCelular(numero);
                while (!validarCelular) {
                    System.out.println("Invalido!");
                    System.out.print("Numero de contato (siga o formato: (xx)xxxxx-xxxx): ");
                    numero = leia.nextLine();
                    validarCelular = validador.validarCelular(numero);
                }

                String email;
                System.out.print("Email: ");
                email = leia.nextLine();
                var validarEmail = validador.validarEmail(email);
                while (!validarEmail){
                    System.out.println("Email invalido!");
                    System.out.print("Email: ");
                    email = leia.nextLine();
                    validarEmail = validador.validarEmail(email);
                }

                String senha;
                System.out.print("Senha: ");
                senha = leia.nextLine();
                var validarSenha = validador.validarSenha(senha);
                while (!validarSenha) {
                    System.out.print("Senha: ");
                    senha = leia.nextLine();
                    validarSenha = validador.validarSenha(senha);
                }

                String senhaDeConfirmacao;
                senhaDeConfirmacao = "";

                int contador;
                contador = 0;
                while (!senha.equals(senhaDeConfirmacao)) {
                    if (contador == 0) {
                        System.out.print("Digite a senha novamente: ");
                        senhaDeConfirmacao = leia.nextLine();
                    }
                    else {
                        System.out.println("ERRO! as senhas digitadas não são correspondentes.");
                        System.out.print("Digite a senha novamente: ");
                        senhaDeConfirmacao = leia.nextLine();
                    }
                    contador++;
                }

                var conta = CriadorDeContas.criarConta();
                var digito = CriadorDeContas.criarDigito();

                Usuario user = new Usuario(nomeCompleto, cpf, numero, email, senha);
                user.getConta(conta, digito);
                BancoDados.cadastrar(user);
            }
            else if (OpComando == 5) {
                break;
            }
        }
        leia.close();
    }
}