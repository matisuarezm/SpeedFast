package main.java.cl.speedFast.model;

public class PedidoExpress extends Pedido{

    public PedidoExpress(String idPedido, String direccionEntrega, String tipoPedido, Double distanciaKm) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKm);
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

    @Override
    public void calcularTiempoEntrega() {
        int tiempoEntrega = 10;
        if (getDistanciaKm() > 5){
            tiempoEntrega += 5;
        }
        System.out.println("Tiempo estimado de entrega: " + tiempoEntrega + " minutos");
    }
}
