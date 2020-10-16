package Entidades;

public class Inventario {
    private int numeroDeSolicitud;

    public Inventario(){}

    public Inventario(int n){
        this.numeroDeSolicitud=n;
    }

    public void setNumeroDeSolicitud(int n){
        this.numeroDeSolicitud=n;
    }

    public int getNumeroDeSolicitud(){
        return numeroDeSolicitud;
    }

    public void registroPedido(){}

    public void existencias(){}
}
