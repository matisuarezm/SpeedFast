package main.java.cl.speedFast.model;

public class Pedido {

    private String idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    public Pedido(String idPedido, String direccionEntrega, String tipoPedido){
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public void asignarRepartidor(){
        System.out.println("El pedido fue asignado exitosamente a un repartido");
    }

    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("El pedido fue asignado exitosamente al repartido: " + nombreRepartidor);
    }

    public String getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("ID Pedido: ").append(getIdPedido()).append('\n');
        sb.append("Tipo Pedido: ").append(getTipoPedido()).append('\n');
        sb.append("Dirección: ").append(getDireccionEntrega());

        return sb.toString();
    }

}
