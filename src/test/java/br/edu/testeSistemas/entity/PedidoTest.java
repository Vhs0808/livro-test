package br.edu.testeSistemas.entity;

import br.edu.testeSistemas.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    private Pedido pedido;

    @BeforeEach
    void configurarTeste(){
        pedido = new Pedido();
    }

    @Test
    void pedidoDeveNascerComValorZero(){
        assertEquals(0.0, pedido.getValorTotal());
    }

    @Test
    void adicionarItemDeveSomarValorAoTotal(){
        pedido.adicionarItem(50.0);
        pedido.adicionarItem(30.0);
        assertEquals(80.0, pedido.getValorTotal());
    }
}
