package br.edu.testeSistemas;

import lombok.*;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private double valorTotal;

    public void adicionarItem(double valor){
        if(valor <= 0)
            throw new IllegalArgumentException("O valor do item deve ser maior que zero.");

        valorTotal += valor;
    }

}
