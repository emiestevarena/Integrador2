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
}
