package termometro;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void aumentaTemperatura(Double novaTemperatura){
        if (novaTemperatura > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        } else {
            temperaturaAtual = novaTemperatura;
        }
    }

    void diminuiTemperatura(Double novaTemperatura){
        if (novaTemperatura < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual = novaTemperatura;
        }
    }

    void exibeFahreinheit(){
        System.out.println("Temperatura em fahreinheit: "
                + (9 * temperaturaAtual / 5 + 32));
    }
}
