package transportadora;

public class PedidoEntregue extends StatusPedido {
    private static PedidoEntregue pedidoEntregue = new PedidoEntregue();

    private PedidoEntregue(){};

    public static PedidoEntregue getInstancia(){
        return pedidoEntregue;
    }
}