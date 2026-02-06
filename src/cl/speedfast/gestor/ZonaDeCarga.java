package cl.speedfast.gestor;

import cl.speedfast.model.Pedido;

import java.util.LinkedList;
import java.util.List;

public class ZonaDeCarga {

    private List<Pedido> pedidosEnCarga;

    public ZonaDeCarga(){
        this.pedidosEnCarga = new LinkedList<>();
        System.out.println("=== Zona de carga en marcha ===");
    }

    public synchronized void agregarPedido(Pedido p){
        pedidosEnCarga.add(p);
        System.out.println("Pedido #" + p.getIdPedido() +
                " agregado a zona de carga. Destino: " + p.getDireccionEntrega());
    }

    public synchronized Pedido retirarPedido(){
        if (pedidosEnCarga.isEmpty()){
            System.out.println("--> No hay más pedidos para retirar.");
            return null;
        }

        Pedido p = pedidosEnCarga.remove(0);
        System.out.println("Pedido #" + p.getIdPedido() + " retirado de la zona de carga con éxito.");
        return p;
    }

    public synchronized boolean estaVacia(){
        return pedidosEnCarga.isEmpty();
    }

}
