package Classes;
import java.util.*;

public class Clientes {
    private HashMap<Integer,Cliente> clientes;

    public Clientes(){
        clientes = new HashMap<>();
    }

    public HashMap<Integer,Cliente> getClientes(){
        return clientes;
    }

}
