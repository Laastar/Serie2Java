import java.util.HashSet;
import java.util.Set;

public class Persona {

    private String nombrePers;
    private int telefono;
    private Mascota macota;
    
    Persona(String nombrePers,String nombreMasc,int telefono)
    {
        this.nombrePers = nombrePers;
        this.telefono = telefono;
        macota = new Mascota(nombreMasc);
    }

    public String getNombre() 
    {
        return nombrePers;
    }

    public int getNumero() 
    {
        return telefono;
    }

    public String getMascota() 
    {
        return macota.getNombre();
    }
}