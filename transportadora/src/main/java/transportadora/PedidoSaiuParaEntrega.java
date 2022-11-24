package transportadora;

public class PedidoSaiuParaEntrega extends StatusPedido {
    private static PedidoSaiuParaEntrega entregarPedido = new PedidoSaiuParaEntrega();

    private PedidoSaiuParaEntrega(){};

    public static PedidoSaiuParaEntrega getInstancia() {
        return entregarPedido;
    }
}