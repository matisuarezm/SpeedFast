package main.java.cl.speedFast.model;

public class PedidoEncomienda extends Pedido{

    public PedidoEncomienda(String idPedido, String direccionEntrega, String tipoPedido, Double distanciaKm) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKm);
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

    @Override
    public void calcularTiempoEntrega() {
        int tiempoBase = 20;
        int tiempoDistancia = 0;
        if (getDistanciaKm() > 1){
            tiempoDistancia = (int) Math.round(getDistanciaKm() * 1.5) ;
        }
        int tiempoEntrega = tiempoBase + tiempoDistancia;
        System.out.println("Tiempo estimado de entrega: " + tiempoEntrega + " minutos");
    }
}
