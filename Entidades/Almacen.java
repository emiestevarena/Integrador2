package Entidades;

public class Almacen {

    private String nombreEmpresa, direccion;

    public Almacen() {

    }

    public Almacen(String nombreEmpresa, String direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
    }


    public void setNombreEmpresa(String n){
        this.nombreEmpresa=n;
    }

    public String getNombreEmpresa(){
        return nombreEmpresa;
    }

    public void setDireccion(String d){
        this.direccion=d;
    }

    public String getDireccion(){
        return direccion;
    }

    public void recibirPedido() {



    }

    public void registroPedido() {



    }

}
