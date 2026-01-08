package main.java.cl.speedFast.ui;

import main.java.cl.speedFast.model.Pedido;
import main.java.cl.speedFast.model.PedidoComida;
import main.java.cl.speedFast.model.PedidoEncomienda;
import main.java.cl.speedFast.model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        Pedido[] pedidos = {
                new PedidoComida("PC001","Avenida Concepción 1234","Comida"),
                new PedidoEncomienda("PE002", "Los Alamos 186", "Encomienda"),
                new PedidoExpress("PX003", "Pasaje San Ambrosio 291", "Express")
        };

        System.out.println("======......SOBRE ESCRITURA DE MÉTODOS......======");
        for (Pedido p : pedidos){
            p.asignarRepartidor();
        }

        System.out.println("\n======......SOBRECARGA DE MÉTODOS......======");
        String [] repartidores = {"Matias Suarez", "Felipe Galvez", "Gustavo Guerra"};
        for (int i = 0; i < pedidos.length; i++){
            pedidos[i].asignarRepartidor(repartidores[i]);
        }

        System.out.println("\n======......DETALLES DE PEDIDOS......======\n");
        for (Pedido p : pedidos){
            System.out.println(p.getIdPedido() + ": " + p.getTipoPedido() + " a "+ p.getDireccionEntrega());
        }

    }
}