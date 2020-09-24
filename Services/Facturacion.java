package Services;
import Classes.*;
import java.util.*;

public class Facturacion {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");

    public void crearCuota(Cuotas cc,Polizas pp){
        System.out.println("Ingrese número de póliza");
        int a=inputPoliza();
        if(polizaOK(pp, a)) this.cuotaNueva(cc, pp, a);
        else System.out.println("Poliza inexistente");
    }

    private int inputPoliza(){
        int a=0;
        try{
            a=inputPolizaOK(leer.nextInt());
        }catch(Exception e){
            System.out.println("Hubo un error");
        }
        return a;
    }

    private int inputPolizaOK(int a) throws MyException{
        if(a<1) throw new MyException("Número negativo");
        else return a;
    }

    private boolean polizaOK(Polizas pp,int a){
        return pp.getPolizas().containsKey(a);
    }

    private void cuotaNueva(Cuotas cc, Polizas pp,int a){
        Poliza p= pp.getPolizas().get(a);
        Cuota c = new Cuota();
        this.numeroFactura(cc, c);
        this.numeroPoliza(c,p);
        this.numeroDeCuota(c);
        this.monto(c);
        this.pagada(c);
        this.vencimiento(c);
        this.formaDePago(c,p);
        cc.getCuotas().add(c);
        c=null;
        p=null;
    }

    private void numeroFactura(Cuotas cc,Cuota c){
        if(cc.getCuotas().isEmpty())c.setNumeroFactura(0);
        else{
            int a= cc.getCuotas().size()-1;
            c.setNumeroFactura(cc.getCuotas().get(a).getNumeroPoliza()+1);
        }
    }

    private void numeroPoliza(Cuota c,Poliza p){
        c.setNumeroPoliza(p.getNumeroPoliza());
    }

    private void numeroDeCuota(Cuota c){
        int a=inputNumeroCuota();
        while(a==0){a=inputNumeroCuota();}
        c.setNumeroCuota(a);
    }

    private int inputNumeroCuota(){
        int a=0;
        System.out.println("Ingrese número de cuota");
        try{
            a=this.numeroCuotaOK(leer.nextInt());
        }catch(Exception e){
            System.out.println("Hubo un error");
        }
        return a;
    }

    private int numeroCuotaOK(int a) throws MyException{
        if(a<1) throw new MyException("Número negativo");
        else return a;
    }

    private void monto(Cuota c){
        double a=inputMonto();
        while(a==0){a=inputMonto();}
        c.setMonto(a);
    }

    private double inputMonto(){
        double a=0;
        System.out.println("Ingrese monto:");
        try{
            a=montoOK(leer.nextDouble());
        }catch(Exception e){
            System.out.println("Hubo un error");
        }
        return a;
    }

    private double montoOK(double a) throws MyException{
        if(a<=0) throw new MyException("Número negativo");
        else return a;        
    }

    private void pagada(Cuota c){
        int a=inputPagada();
        if(a==1) c.setPagada(true);
        else c.setPagada(false);
    }

    private int inputPagada(){
        int a=0;
        System.out.println("Ingrese 1 para indicar si la cuota fue pagada");
        try{
            a=leer.nextInt();
        }catch(Exception e){
            System.out.println("Hubo un error");
        }
        return a;
    }

    private void vencimiento(Cuota c){
        int y=inputYear();
        while(y==0){y=inputYear();}
        int m=inputMonth();
        while(m==0){m=inputMonth();}
        GregorianCalendar g = new GregorianCalendar(y,m,10);
        c.setVencimiento(g);
    }    

    private int inputYear(){
        int a=0;
        try{
            System.out.println("Ingrese año");
            a=añoOK(leer.nextInt());
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        return a;
    }

    private int añoOK(int a) throws MyException{
        if(a<1900) throw new MyException("Año anterior a 1900");
        else return a;
    }

    private int inputMonth(){
        int a=0;
        try{
            System.out.println("Ingrese numero");
            a=mesOK(leer.nextInt());
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        return a;
    }

    private int mesOK(int a) throws MyException{
        if(a>12 || a<1) throw new MyException("Mes fuera de rango");
        else return a;
    }

    private void formaDePago(Cuota c,Poliza p){
        c.setFormaDePago(p.getFormaDePago());
    }
}
