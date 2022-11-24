package transportadora;

import java.util.ArrayList;
import java.util.List;

public abstract class StatusPedido {
    private List<Destinatario> pedido = new ArrayList<Destinatario>();

    public void adicionarPedido(Destinatario destinatario){
        this.pedido.add(destinatario);
    }
    public boolean verificarPedido(Destinatario destinatario){
        return this.pedido.contains(destinatario);
    }
}