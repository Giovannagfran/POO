package encomendas;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    Double calcularFrete(){
        Double valorFrete = 0.0;

        if (tamanho.equals("P")){
            valorFrete += (valorEncomenda * 0.01);
            if (distancia <= 50){
                valorFrete += 3.0;
            } else if(distancia < 200){
                valorFrete += 5.0;
            } else {
                valorFrete += 7.0;
            }
        }

        if (tamanho.equals("M")){
            valorFrete += (valorEncomenda * 0.03);
            if (distancia <= 50){
                valorFrete += 3.0;
            } else if(distancia < 200){
                valorFrete += 5.0;
            } else {
                valorFrete += 7.0;
            }
        }

        if (tamanho.equals("G")){
            valorFrete += (valorEncomenda * 0.05);
            if (distancia <= 50){
                valorFrete += 3.0;
            } else if(distancia < 200){
                valorFrete += 5.0;
            } else {
                valorFrete += 7.0;
            }
        }
        return valorFrete;
    }


    void emitirEtiqueta(){
        Double frete = calcularFrete();
        System.out.println("""
                ***** ETIQUETA PARA ENVIO *****
                Endereço do remetente: %s
                Endereço do destinatário: %s
                Tamanho: %s
                --------------------------------------------------
                Valor encomenda: R$ %.2f
                Valor frete: R$ %.2f 
                --------------------------------------------------
                Valor total: R$ %.2f""".formatted(enderecoRemetente, enderecoDestinatario,
                tamanho, valorEncomenda, frete, (valorEncomenda + frete)));

    }
}
