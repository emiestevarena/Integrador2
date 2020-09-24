package Classes;
import Enums.*;
import java.util.GregorianCalendar;

public class Cuota {
    private int numeroFactura;
    private int numeroPoliza;
    private int numeroCuota;
    private double monto;
    private boolean pagada;
    private GregorianCalendar vencimiento;
    private Enum<FormaDePago> formaDePago;

    public Cuota(){
        numeroFactura=0;
        numeroPoliza=0;
        pagada=false;
        vencimiento = new GregorianCalendar();
        formaDePago = null;
    }
    
    public void setNumeroCuota(int a){
        this.numeroCuota=a;
    }

    public int getNumeroCuota(){
        return numeroCuota;
    }

    public void setVencimiento(GregorianCalendar g){
        this.vencimiento=g;
    }

    public GregorianCalendar getVencimiento(){
        return vencimiento;
    }

    public void setPagada(boolean b){
        this.pagada=b;
    }

    public boolean getPagada(){
        return pagada;
    }

    public void setNumeroPoliza(int a){
        this.numeroPoliza=a;
    }

    public int getNumeroPoliza(){
        return numeroPoliza;
    }

    public void setNumeroFactura(int a){
        this.numeroFactura=a;
    }

    public int getNumeroFactura(){
        return numeroFactura;
    }

    public void setMonto(double a){
        this.monto=a;
    }

    public double getMonto(){
        return monto;
    }

    public void setFormaDePago(Enum<FormaDePago> a){
        this.formaDePago=a;
    }

    public Enum<FormaDePago> getFormaDePago(){
        return formaDePago;
    }
}
