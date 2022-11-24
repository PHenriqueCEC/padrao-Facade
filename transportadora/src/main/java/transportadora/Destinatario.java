package transportadora;

public class Destinatario {
    public boolean realizacaoDoPedido() {

        return DestinatarioFacade.finalizarPedido(this);
    }
}