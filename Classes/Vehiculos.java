package Classes;
import java.util.*;

public class Vehiculos {
    private HashMap<String,Vehiculo> vehiculos;

    public Vehiculos(){
        vehiculos = new HashMap<>();
    }

    public HashMap<String,Vehiculo> getVehiculos(){
        return vehiculos;
    }
}
