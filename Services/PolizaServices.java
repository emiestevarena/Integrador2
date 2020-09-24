package Services;
import Classes.*;

import java.util.*;

public class PolizaServices{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPoliza(Polizas pp, Clientes cc, Vehiculos vv){
        Poliza p = new Poliza();
        this.poliza(pp,p);
        this.clientes(p,cc);
        this.vehiculo(p,vv);
        this.inicioPoliza(p);
        this.finPoliza(p);
        this.cantidadCuotas(p);
        this.formaDePago(p);
        this.montoTotalAsegurado(p);
        pp.getPolizas().put(p.getNumeroPoliza(),p);
    }

    private void poliza(Polizas pp, Poliza p){
        if(pp.getPolizas().isEmpty())p.setNumeroPoliza(1);
        else{
            int np = 1;
            while(pp.getPolizas().containsKey(np)){np++;}
            p.setNumeroPoliza(np);
        } 
    }

    private void clientes(Poliza p,Clientes cc){
        int dni=this.inputDNI();
        while(dni==0){dni=inputDNI();}
        if(cc.getClientes().containsKey(dni)){
            p.setCliente(cc.getClientes().get(dni));
            System.out.println("Cliente ingresado");
        }else{
            System.out.println("Se ingresará un nuevo cliente");
            ClienteServices cs = new ClienteServices();
            cs.crearCliente(cc);
            cs=null;
            this.clientes(p, cc);
        }
    }

    private int inputDNI(){
        int dni=0;
        System.out.println("Ingrese DNI");
        try{
            dni=dniOK(leer.nextInt());
        }catch(MyException me){
            System.out.println("Ha ocurrido un error");
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        return dni;
    }

    private int dniOK(int a) throws MyException{
        if(a<0 || a>99999999){ throw new MyException("Número inválido");}
        else{return a;}
    }

    private void vehiculo(Poliza p, Vehiculos vv){
        System.out.println("Ingrese patente");
        String patente = leer.next();
        if(patenteOK(vv, patente)){ 
            p.setVehiculo(vv.getVehiculos().get(patente));
            System.out.println("Vehículo agregado");
        }else{
            System.out.println("Deberá crear un nuevo vehículo");
            VehiculoServices vs = new VehiculoServices();
            vs.crearVehiculo(vv);
            vs=null;
            this.vehiculo(p, vv);
        }       
    }

    private boolean patenteOK(Vehiculos vv,String patente){
        return vv.getVehiculos().containsKey(patente);
    }

    private void inicioPoliza(Poliza p){
        int y=inputYear();
        while(y==0){y=inputYear();}
        int m=inputMonth();
        while(m==0){m=inputMonth();}
        GregorianCalendar g = new GregorianCalendar(y,m,1);
        p.setInicioPoliza(g);
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

    private void finPoliza(Poliza p){
        int y=inputYear();
        while(y==0){y=inputYear();}
        int m=inputMonth();
        while(m==0){m=inputMonth();}
        GregorianCalendar g = new GregorianCalendar(y,m,1);
        if(g.get(Calendar.YEAR)>p.getInicioPoliza().get(Calendar.YEAR)){
            p.setFinPoliza(g);    
        }else if(g.get(Calendar.MONTH)>p.getInicioPoliza().get(Calendar.MONTH)){
            p.setFinPoliza(g);
        }else if(g.get(Calendar.DAY_OF_MONTH)>p.getInicioPoliza().get(Calendar.DAY_OF_MONTH)){
            p.setFinPoliza(g);
        }else{
            System.out.println("Fecha inválida, vuelva a ingresar fecha");
            this.finPoliza(p);
        }
    }
    
    private void cantidadCuotas(Poliza p){
        int cc= ingresarCuotas();
        while(cc==0){cc=ingresarCuotas();}
        p.setCantidadCuotas(cc);      
    }

    private int ingresarCuotas(){
        int a=0;
        System.out.println("Ingrese cantidad de cuotas");
        try{
            a=cuotasOK(leer.nextInt());
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        return a;
    }

    private int cuotasOK(int a)throws MyException{
        if(a<1) throw new MyException("Número negativo");
        else return a;
    }

    private void formaDePago(Poliza p){
        this.listaFormaDePago();       
        int a=ingresarForma();
        while(a==0){a=ingresarForma();}
        p.setFormaDePago(a);
    }

    private void listaFormaDePago(){
        System.out.println("1. Cheque");
        System.out.println("2. Debito Automático");
        System.out.println("3. Efectivo");
        System.out.println("4. Transferencia");       
    }

    private int ingresarForma(){
        int a=0;
        System.out.println("Ingrese cantidad de cuotas");
        try{
            a=formaOK(leer.nextInt());
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        return a;
    }

    private int formaOK(int a)throws MyException{
        if(a<1 || a>4) throw new MyException("Número fuera de rango");
        else return a;
    }
    
    private void montoTotalAsegurado(Poliza p){
        int a=ingresarMonto();
        while(a==0){a=ingresarMonto();}
        p.setMontoTotalAsegurado(a);       
    }

    private int ingresarMonto(){
        int a=0;
        System.out.println("Ingrese cantidad de cuotas");
        try{
            a=cuotasOK(leer.nextInt());
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        return a;
    }
}