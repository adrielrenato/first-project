public class Conversor {
    public static void main(String[] args) {
        double temperaturaCelsius = 30;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        String texto = """
                Temperatura em celsius %.2f
                Temperatura em Fahrenheit %.2f
                """;
        System.out.println(String.format(texto, temperaturaCelsius, temperaturaFahrenheit));
    }
}
