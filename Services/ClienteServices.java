package Services;
import java.util.*;
import Classes.*;

public class ClienteServices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearCliente(Clientes cc){
        Cliente c = new Cliente();
        this.ingresarDNI(c, cc);
        this.ingresarNombre(c);
        this.ingresarApellido(c);
        this.ingresarMail(c);
        this.ingresarTelefono(c);
        cc.getClientes().put(c.getDocumento(),c);
        c=null;
    }

    public void modificarCliente(Clientes cc){
        int dni= inputDNI();
        while(dni==0){dni=inputDNI();}
        boolean OK = checkDNI(cc,dni);
        if(OK){this.modificaciones(cc,dni);} 
    }

    public void eliminarCliente(Clientes cc){
        int dni= inputDNI();
        while(dni==0){dni=inputDNI();}
        boolean OK = checkDNI(cc,dni);
        if(OK){cc.getClientes().remove(dni);System.out.println("Remoción exitosa");}
    }

    public void consultarCliente(Clientes cc){
        int dni= inputDNI();
        while(dni==0){dni=inputDNI();}
        boolean OK = checkDNI(cc,dni);
        if(OK){}
    }

    private boolean checkDNI(Clientes cc,int dni){
        if(cc.getClientes().containsKey(dni)){
            return true;
        }else{
            System.out.println("Cliente inexistente");
            return false;
        }
    }

    private void modificaciones(Clientes cc,int dni){
        System.out.println("1. Modificar nombre");
        System.out.println("2. Modificar apellido");
        System.out.println("3. Modificar mail");
        System.out.println("4. Modificar telefono");
        int a = this.checkOption();
        this.inputOptions(a,cc,dni);
    }

    private void inputOptions(int a, Clientes cc,int dni){
        Cliente c = cc.getClientes().get(dni);
        switch(a){
            case 1: this.ingresarNombre(c); cc.getClientes().put(dni,c); break;
            case 2: this.ingresarApellido(c); cc.getClientes().put(dni,c); break;
            case 3: this.ingresarMail(c); cc.getClientes().put(dni,c); break;
            case 4: this.ingresarTelefono(c); cc.getClientes().put(dni,c); break;
            default: System.out.println("Opción inválida"); break;
        }
        c=null;
    }

    private int checkOption(){
        int a=0;
        try{
            a=leer.nextInt();
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        return a;
    }

    private void ingresarDNI(Cliente c, Clientes cc){
        int dni=this.inputDNI();
        while(dni==0){dni=inputDNI();}
        if(cc.getClientes().containsKey(dni)){
            System.out.println("Cliente existente, ingrese DNI nuevo");
            this.ingresarDNI(c, cc);
        }else{
            c.setDocumento(dni);
            System.out.println("DNI ingresado");
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

    private void ingresarNombre(Cliente c){
        System.out.println("Ingrese nombre");
        c.setNombre(leer.next());
    }

    private void ingresarApellido(Cliente c){
        System.out.println("Ingrese apellido");
        c.setApellido(leer.next());
    }

    private void ingresarMail(Cliente c){
        System.out.println("Ingrese mail");
        c.setMail(leer.next());
    }

    private void ingresarTelefono(Cliente c){
    System.out.println("Ingrese telefono");
        c.setApellido(leer.next());
    }
}
