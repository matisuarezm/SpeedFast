package main.java.cl.speedFast.model;

public class PedidoComida extends Pedido{

    public PedidoComida(String idPedido, String direccionEntrega, String tipoPedido, Double distanciaKm) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKm);
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

    @Override
    public void calcularTiempoEntrega() {
        int tiempoBase = 15;
        int tiempoDistancia = 0;
        if (getDistanciaKm() > 1){
            tiempoDistancia = (int) Math.round(getDistanciaKm()) * 2;
        }
        int tiempoEntrega = tiempoBase + tiempoDistancia;
        System.out.println("Tiempo estimado de entrega: " + tiempoEntrega + " minutos");
    }
}
