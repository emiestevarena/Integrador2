package Classes;

public class Cliente implements Comparable<Cliente> {
    private String nombre;
    private String apellido;
    private int documento;
    private String mail;
    private String telefono;
    
    public Cliente(){
        this.nombre=null;
        this.apellido=null;
        this.documento=0;
        this.mail=null;
        this.telefono=null;
    }
    
    public void setNombre(String a){
        this.nombre=a;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setApellido(String a){
        this.apellido=a;
    }

    public String getApellido(){
        return apellido;
    }
    
    public void setDocumento(int a){
        this.documento=a;
    }

    public int getDocumento(){
        return documento;
    }

    public void setMail(String a){
        this.mail=a;
    }

    public String getMail(){
        return mail;
    }

    public void setTelefono(String a){
        this.telefono=a;
    }

    public String getTelefono(){
        return telefono;
    }

    @Override
    public int compareTo(Cliente other) {
       return apellido.compareTo(other.apellido);
   }

}
