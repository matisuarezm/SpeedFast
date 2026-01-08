package main.java.cl.speedFast.model;

public class PedidoEncomienda extends Pedido{

    public PedidoEncomienda(String idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("\n[Pedido de Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Validando peso y embalaje... OK");
        System.out.println("-> Pedido asignado");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();
        System.out.println("-> Pedido en camino - entregado por: " + nombreRepartidor);
    }

}
