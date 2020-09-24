package Classes;
import Enums.*;

public class Vehiculo implements Comparable<Vehiculo> {
    private String patente;
    private String marca;
    private String modelo;
    private int año;
    private int numeroMotor;
    private String chasis;
    private String color;
    private Enum<TipoVehiculo> tipo;

    public Vehiculo(){
        this.patente=null;
        this.marca=null;
        this.modelo=null;
        this.año=0;
        this.numeroMotor=0;
        this.chasis=null;
        this.color=null;
        this.tipo=null;
    }

    public void setPatente(String a){
        this.patente=a;
    }

    public String getPatente(){
        return patente;
    }

    public void setMarca(String a){
        this.marca=a;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String a){
        this.modelo=a;
    }

    public String getModelo(){
        return modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño(){
        return año;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getChasis(){
        return chasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setTipo(int a) {
        this.tipo = TipoVehiculo.values()[a];
    }
    
    public Enum<TipoVehiculo> getTipo(){
        return tipo;
    }
    
    @Override
    public int compareTo(Vehiculo other) {
       return patente.compareTo(other.patente);
   }
}
