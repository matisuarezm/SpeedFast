package main.java.cl.speedFast.model;

public class PedidoExpress extends Pedido{

    public PedidoExpress(String idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("\n[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> El repartidor más cercano con disponibilidad inmediata encontrado.");
        System.out.println("-> Pedido asignado");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();
        System.out.println("-> Pedido en camino - entregado por: " + nombreRepartidor);
    }


}
