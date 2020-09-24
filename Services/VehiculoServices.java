package Services;
import Classes.*;
import java.util.*;
import java.time.*;

public class VehiculoServices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearVehiculo(Vehiculos vv){
        Vehiculo v = new Vehiculo();
        this.patente(vv,v);
        this.marca(v);
        this.modelo(v);
        this.año(v);
        this.numeroMotor(v);
        this.chasis(v);
        this.color(v);
        this.tipo(v);
        vv.getVehiculos().put(v.getPatente(),v);
        v=null;
    }

    public void modificarVehiculo(Vehiculos vv){
        System.out.println("ingrese patente");
        String patente = leer.next();
        if(this.patenteOK(vv,patente)) this.modificacion(vv, patente);
        else System.out.println("Patente inexistente");
    }

    private void modificacion(Vehiculos vv,String patente){}
    
    private void patente(Vehiculos vv, Vehiculo v){
        System.out.println("ingrese patente");
        String patente = leer.next();
        if(patenteOK(vv, patente)){
            System.out.println("Patente existente. Deberá reingresar la patente");
            this.patente(vv, v);
        }else{
            v.setPatente(patente);
            System.out.println("Patente registrada");
        }
    }

    private boolean patenteOK(Vehiculos vv,String patente){
        return vv.getVehiculos().containsKey(patente);
    }
    
    private void marca(Vehiculo v){
        System.out.println("Ingrese marca");
        v.setMarca(leer.next());
    }

    private void modelo(Vehiculo v){
        System.out.println("Ingrese modelo");
        v.setModelo(leer.next());
    }

    private void año(Vehiculo v){
        int año=this.inputAño();
        while(año==0){año=this.inputAño();}
        v.setAño(año);        
    }

    private int inputAño(){
        int año=0;
        try{
            System.out.println("Ingrese año");
            año=this.checkAño(leer.nextInt());
        }catch(MyException me){
            System.out.println("Deberá reingresar el año");
        }catch(Exception e){
            System.out.println("Deberá reingresar el año");
        }  
        return año;
    }

    private int checkAño(int año) throws MyException{
        LocalDate today = LocalDate.now();
        if(año<1900 || año> today.getYear()) throw new MyException("Año fuera de rango");
        else return año;
    }

    private void numeroMotor(Vehiculo v){
        int num=inputMotor();
        while(num==0){num=inputMotor();}
        v.setNumeroMotor(num);       
    }

    private int inputMotor(){
        int num=0;
        System.out.println("Ingrese numero de motor");
        try{
            num=motorOK(leer.nextInt());
        }catch(MyException me){
            System.out.println("Ha ocurrido un error");
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        return num;
    }

    private int motorOK(int num) throws MyException{
        if(num>0) return num;
        else throw new MyException("Numero fuera de rango");
    }

    private void chasis(Vehiculo v){
        System.out.println("Ingrese chasis");
        v.setChasis(leer.next());
    }

    private void color(Vehiculo v){
        System.out.println("Ingrese color");
        v.setColor(leer.next());
    }

    private void tipo(Vehiculo v){
        System.out.println("1. auto");
        System.out.println("2. camión");
        System.out.println("3. camioneta");
        System.out.println("4. moto");
        int op = this.inputTipo();
        while(op==0){op = this.inputTipo();}
        switch (op){
            case 1: v.setTipo(0);break;
            case 2: v.setTipo(1);break;
            case 3: v.setTipo(2);break;
            case 4: v.setTipo(3);break;
        }
    }

    private int inputTipo(){
        int op=0;
        try{
            System.out.println("Ingrese opción");
            op=this.tipoOK(leer.nextInt());
        }catch(MyException me){
            System.out.println("Ha ocurrido un error");
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        } 
        return op;
    }

    private int tipoOK(int op) throws MyException{
        if(op<1 || op >4) throw new MyException("Numero fuera de rango");
        else return op;
    }

}
