package termometro;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro temperatura = new Termometro();

        temperatura.temperaturaAtual = 25.0;
        temperatura.temperaturaMin = 16.0;
        temperatura.temperaturaMax = 40.0;

        temperatura.aumentaTemperatura(41.0);
        temperatura.diminuiTemperatura(15.0);

        System.out.println("""
                Temperatura atual: %.0f C
                Temperatura mínima: %.0f C
                Temperatura máxima: %.0f C""".formatted(temperatura.temperaturaAtual,
                temperatura.temperaturaMin, temperatura.temperaturaMax));
        temperatura.exibeFahreinheit();
    }
}
