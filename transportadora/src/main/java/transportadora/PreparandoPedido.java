package transportadora;

public class PreparandoPedido extends StatusPedido{
    private static PreparandoPedido preparandoPedido = new PreparandoPedido();

    private PreparandoPedido(){};

    public static PreparandoPedido getInstancia(){
        return preparandoPedido;
    }
}