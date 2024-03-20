package encomendas;

public class Main {
    public static void main(String[] args) {
        Encomenda encomenda01 = new Encomenda();

        encomenda01.tamanho = "M";
        encomenda01.enderecoRemetente = "Rua Santos da Glória, 18";
        encomenda01.enderecoDestinatario = " Av Dr. Pedro, 255";
        encomenda01.distancia = 42.2;
        encomenda01.valorEncomenda = 100.0;

        encomenda01.emitirEtiqueta();

    }
}
