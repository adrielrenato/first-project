import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Adriel";
        String tipoConta = "Corrente";
        double saldo = 2500;

        System.out.println("******************************");
        System.out.println("Nome:           " + nome);
        System.out.println("Tipo Conta:     " + tipoConta);
        System.out.println("Saldo:          R$ " + saldo);
        System.out.println("******************************");

        int menu = 0;

        while (menu != 4) {
            System.out.println("Operações");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Sacar valor");
            System.out.println("4 - Sair");
            menu = leitura.nextInt();

            if (menu == 1) {
                System.out.println("O Saldo atual é R$ " + saldo);
            } else if (menu == 2) {
                System.out.println("Informe o valor do deposito");
                double deposito = leitura.nextDouble();

                while (deposito < 0) {
                    System.out.println("Valor do deposito inválido");
                    System.out.println("Informe o valor do deposito");
                    deposito = leitura.nextDouble();
                }

                saldo += deposito;
                System.out.println("O Saldo atual é R$ " + saldo);
            } else if (menu == 3) {
                System.out.println("Informe o valor do saque");
                double saque = leitura.nextDouble();

                while (saque < 0) {
                    System.out.println("Valor do saque inválido");
                    System.out.println("Informe o valor do saque");
                    saque = leitura.nextDouble();

                    while (saque > saldo) {
                        System.out.println("Valor do saque não pode ser maior que o saldo de R$ " + saldo);
                        System.out.println("Informe o valor do saque");
                        saque = leitura.nextDouble();
                    }
                }

                saldo -= saque;
                System.out.println("O Saldo atual é R$ " + saldo);
            } else if (menu == 4) {
                System.out.println("Sistema finalizado");
            } else {
                System.out.println("Operação inválida");
            }
        }
    }
}
