package Services;
import Classes.*;
import java.util.*;

public class PolizaServices{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPoliza(Polizas pp){
        Poliza p = new Poliza();
        this.clientes(p,pp);
        pp.getPolizas().put(p.getNumeroPoliza(),p);
    }

    private void clientes(Poliza p,Polizas pp){
        
    }
}