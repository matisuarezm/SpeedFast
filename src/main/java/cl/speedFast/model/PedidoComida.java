package main.java.cl.speedFast.model;

public class PedidoComida extends Pedido{

    public PedidoComida(String idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("\n[Pedido de Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Verificando mochila térmica... OK");
        System.out.println("-> Pedido asignado");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();
        System.out.println("-> Pedido en camino - entregado por: " + nombreRepartidor);
    }

}
