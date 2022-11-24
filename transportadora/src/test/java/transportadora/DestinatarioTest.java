package transportadora;

import org.junit.jupiter.api.Test;

import java.beans.DesignMode;

import static org.junit.jupiter.api.Assertions.*;


public class DestinatarioTest {

    @Test
    void deveRetornarPedidoEmPreparo(){
        Destinatario destinatario = new Destinatario();
        PreparandoPedido.getInstancia().adicionarPedido(destinatario);
        assertEquals(false, destinatario.realizacaoDoPedido());
    }

    @Test
    void deveRetornarSaiuParaEntrega(){
        Destinatario destinatario = new Destinatario();
        PedidoSaiuParaEntrega.getInstancia().adicionarPedido(destinatario);
        assertEquals(false, destinatario.realizacaoDoPedido());
    }

    @Test
    void deveRetornarPedidoEntregue(){
        Destinatario destinatario = new Destinatario();
        PedidoEntregue.getInstancia().adicionarPedido(destinatario);
        assertEquals(false, destinatario.realizacaoDoPedido());
    }

    @Test
    void deveVericarPedidoFinalizado(){
        Destinatario destinatario = new Destinatario();
        assertEquals(true, destinatario.realizacaoDoPedido());
    }
}
