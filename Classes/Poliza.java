package Classes;
import Enums.*;
import java.util.GregorianCalendar;

public class Poliza {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int numeroPoliza;
    private GregorianCalendar inicioPoliza;
    private GregorianCalendar finPoliza;
    private int cantidadCuotas;
    private Enum<FormaDePago> formaDePago;
    private int montoTotalAsegurado;
    private boolean coberturaGranizo;
    private Enum<TipoCobertura> tipoCobertura;

    public Poliza(){
        cliente=new Cliente();
        vehiculo=new Vehiculo();
        numeroPoliza=0;
        inicioPoliza = new GregorianCalendar();
        finPoliza  = new GregorianCalendar();
        cantidadCuotas=0;
        formaDePago=null;
        montoTotalAsegurado=0;
        coberturaGranizo=false;
        tipoCobertura=null;
    }

    public void setCliente(Cliente c){
        this.cliente=c;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setVehiculo(Vehiculo v){
        this.vehiculo=v;
    }

    public Vehiculo getVehiculo(){
        return vehiculo;
    }

    public void setNumeroPoliza(int a){
        this.numeroPoliza=a;
    }

    public int getNumeroPoliza(){
        return numeroPoliza;
    }

    public void setInicioPoliza(GregorianCalendar g){
        this.inicioPoliza=g;
    }

    public GregorianCalendar getInicioPoliza(){
        return inicioPoliza;
    }

    public void setFinPoliza(GregorianCalendar g){
        this.finPoliza=g;
    }

    public GregorianCalendar getFinPoliza(){
        return finPoliza;
    }

    public void setCantidadCuotas(int a){
        this.cantidadCuotas = a;
    }

    public int getCantidadCuotas(){
        return cantidadCuotas;
    }
    
    public void setFormaDePago(int a){
        this.formaDePago=FormaDePago.values()[a];
    }

    public Enum<FormaDePago> getFormaDePago(){
        return formaDePago;
    }

    public void setMontoTotalAsegurado(int a){
        this.montoTotalAsegurado=a;
    }

    public int getMontoTotalAsegurado(){
        return montoTotalAsegurado;
    }
    
    public void setCoberturaGranizo(boolean g){
        this.coberturaGranizo=g;
    }

    public boolean getCoberturaGranizo(){
        return coberturaGranizo;
    }

    public void setTipoCobertura(int a){
        this.tipoCobertura=TipoCobertura.values()[a];
    }

    public Enum<TipoCobertura> getTipoCobertura(){
        return tipoCobertura;
    }
    
}
