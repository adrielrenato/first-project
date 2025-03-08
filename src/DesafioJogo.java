import java.util.Random;
import java.util.Scanner;

public class DesafioJogo {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int numeroEscolhido;
        int tentativas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Escolha um número de 0 a 100");
            numeroEscolhido = leitura.nextInt();
            tentativas++;

            if (numeroEscolhido == numeroAleatorio) {
                System.out.println("Você venceu!");
                break;
            } else {
                if (numeroAleatorio > numeroEscolhido) {
                    System.out.println("O número " + numeroEscolhido + " é menor que o número aleatorio");
                } else {
                    System.out.println("O número " + numeroEscolhido + " é maior que o número aleatorio");
                }
            }
        }

        System.out.println("Vocë teve " + tentativas + " Tentativas");
        System.out.println("O número escolhido pela máquina era " + numeroAleatorio);
    }
}
