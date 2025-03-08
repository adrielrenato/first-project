import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double numeroDigitado;

        System.out.println("Digite um número");
        numeroDigitado = leitura.nextDouble();

        if (numeroDigitado >= 0) {
            System.out.println("O número " + numeroDigitado + " é positivo");
        } else {
            System.out.println("O número " + numeroDigitado + " é negativo");
        }

        double numero1, numero2;
        System.out.println("Digite o primeiro numero");
        numero1 = leitura.nextDouble();

        System.out.println("Digite o segundo numero");
        numero2 = leitura.nextDouble();

        if (numero1 == numero2) {
            System.out.println("Os números digitados são iguais");
        } else {
            if (numero1 > numero2) {
                System.out.println("O número " + numero1 + " é maior que o número " + numero2);
            } else {
                System.out.println("O número " + numero2 + " é maior que o número " + numero1);
            }
        }

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Escolha a opção que deseja \n 1 - Calcular área do quadrado \n 2 - Calcular área do circulo \n 3 - Sair");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (opcao == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (opcao == 3) {
                System.out.println("Sistema finalizado!");
            } else {
                System.out.println("Opção Inválida!");
            }
        }

        System.out.println("Escolha um número para ser feita a tabuada de 1 a 10");
        int tabuadaEscolhida = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuadaEscolhida + " x " + i + " = " + tabuadaEscolhida * i);
        }

        System.out.println("Digite um número");
        int numeroDigitadoParImpar = leitura.nextInt();

        if (numeroDigitadoParImpar % 2 == 0) {
            System.out.println("O número " + numeroDigitadoParImpar + " é par");
        } else {
            System.out.println("O número " + numeroDigitadoParImpar + " é impar");
        }

        System.out.println("Digite um número");
        int numeroDigitadoFatorial = leitura.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroDigitadoFatorial; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroDigitadoFatorial + " é: " + fatorial);
    }
}
