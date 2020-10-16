package Entidades

public class Venta{

private Producto producto;
private int cantidad;
private long precio;

public void definir(int cantidad, long precio){
this.cantidad = cantidad;
this.precio = precio;
}

public String getProducto() {
        return producto;
    }

public void setProducto(String producto) {
        this.producto = producto;
    }

public int getCantidad() {
        return cantidad;
    }

public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
public long getPrecio() {
        return precio;
    }

public void setPrecio(long precio) {
        this.precio = precio;
    }

public void Venta(){

}

public void registroVenta(){

}
}
