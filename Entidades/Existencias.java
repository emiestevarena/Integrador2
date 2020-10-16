package Entidades;

import Entidades.Producto;

public class Existencias {

    private Producto producto;
    private Integer precio, cantidad;

    public void Existencias() {

    }

    public Existencias(Integer precio, Integer cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void registroDeVenta() {



    }

    public void existencias() {



    }

}
