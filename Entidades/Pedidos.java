package Entidades;

public class Pedidos {

    private String producto;
    private Integer cantidad, numDeSolicitud;

    public Pedidos() {
    }

    public Pedidos(String producto, Integer cantidad, Integer numDeSolicitud) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.numDeSolicitud = numDeSolicitud;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getNumDeSolicitud() {
        return numDeSolicitud;
    }

    public void setNumDeSolicitud(Integer numDeSolicitud) {
        this.numDeSolicitud = numDeSolicitud;
    }

    public void recibirPedido() {



    }

    public void registroPedido() {



    }

}
