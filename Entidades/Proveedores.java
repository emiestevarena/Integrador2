package Entidades;

public class Proveedores {

    private Integer telefono, NIT, cantidad;
    private String direccion, producto, nProovedor;

    public Proveedores(){

    }

    public Proveedores(Integer telefono, Integer NIT, Integer cantidad, String direccion, String producto, String nProovedor) {
        this.telefono = telefono;
        this.NIT = NIT;
        this.cantidad = cantidad;
        this.direccion = direccion;
        this.producto = producto;
        this.nProovedor = nProovedor;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getNIT() {
        return NIT;
    }

    public void setNIT(Integer NIT) {
        this.NIT = NIT;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getnProovedor() {
        return nProovedor;
    }

    public void setnProovedor(String nProovedor) {
        this.nProovedor = nProovedor;
    }

    public void ventaDirecta() {

    }

    public void pedidosEspeciales() {

    }

}
