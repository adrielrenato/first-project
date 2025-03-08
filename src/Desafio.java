public class Desafio {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 7.7;
        double media = (nota1 + nota2) / 2;

        System.out.println(media);

        double valor = 12.5;
        int novoValor = (int) valor;
        System.out.println(novoValor);

        String nome = "driel";
        char letra = 'A';

        String mensagem = letra + nome;
        System.out.println(mensagem);

        double precoProduto = 12.50;
        int quantidade = 10;
        double valorTotal = precoProduto * quantidade;
        System.out.println(valorTotal);

        double valorEmDolares = 10;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.println(valorEmReais);

        double precoOriginal = 53.49;
        double percentualDeDesconto = 10;
        double precoComDesconto = precoOriginal - ((precoOriginal * percentualDeDesconto) / 100);
        System.out.println(precoComDesconto);
    }
}
