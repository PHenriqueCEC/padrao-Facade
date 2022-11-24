package transportadora;

public class DestinatarioFacade {
    public static boolean finalizarPedido(Destinatario destinatario){

        if(PreparandoPedido.getInstancia().verificarPedido(destinatario)){
            return false;
        }

        if(PedidoSaiuParaEntrega.getInstancia().verificarPedido(destinatario)){
            return false;
        }

        if(PedidoEntregue.getInstancia().verificarPedido(destinatario)){
            return false;
        }

        return true;
    }
}