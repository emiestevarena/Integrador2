package Services;
import Classes.*;

import java.util.*;

public class PolizaServices{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPoliza(Polizas pp, Clientes cc, Vehiculos vv){
        Poliza p = new Poliza();
        this.clientes(p,cc);
        pp.getPolizas().put(p.getNumeroPoliza(),p);
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

}