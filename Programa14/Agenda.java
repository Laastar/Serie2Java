import java.util.Scanner;
import java.util.ArrayList;

public class Agenda 
{
    Scanner teclado = new Scanner(System.in);

    String nombrePers, nombreMasc;
    int telefono;
    
    ArrayList<Persona> directorio = new ArrayList<Persona>();
    
    public void opciones() 
    {
        System.out.println("Elija cualquier opcion");
        System.out.println("1) Agregar Persona");
        System.out.println("2) Buscar Persona");
        System.out.println("3) Eliminar persona");
        System.out.println("4) Vaciar Directorio");
        System.out.println("5) Ver Directorio");
        System.out.println("6) Salir");
        
        try{
            int opcion = Integer.valueOf(teclado.nextLine());
            switch(opcion){
                case 1:
                    aggregate();
                    break;
                case 2:
                    searchParty();
                    break;
                case 3:
                    delOne();
                    break;
                case 4:
                    delAll(); 
                    break;
                case 5:
                    seeAll();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Ingrese una opcion valida"); 
                break;
            }
        } catch(Exception e){}       
    }

    public void aggregate() 
    {
        System.out.println("Ingrese nombre de la persona");
        nombrePers = teclado.nextLine();
        System.out.println("Ingrese el numero de telefono");
        telefono = Integer.valueOf(teclado.nextLine());
        System.out.println("Ingrese el nombre de su mascota");
        nombreMasc = teclado.nextLine();
        Persona per = new Persona(nombrePers, nombreMasc, telefono);
        directorio.add(per);
    }

    public void searchParty() 
    {
        System.out.println("Ingrese el nombre de la persona que desea buscar");
        nombrePers=teclado.nextLine();
        for (int  i = 0; i < directorio.size(); i++)
        {

            if(nombrePers.equals(directorio.get(i).getNombre()))
            {
                System.out.println("Nombre: " + directorio.get(i).getNombre());
                System.out.println("Numero: " + directorio.get(i).getNumero());
                System.out.println("Mascota: " + directorio.get(i).getMascota());
                return;
            }
        }
        System.out.println("Persona no registrada");
    }

    public void delOne() 
    {
        System.out.println("Ingrese el nombre de la persona que desea eliminar");
        nombrePers = teclado.nextLine();
        for (int  i = 0; i < directorio.size(); i++)
        {
            if(nombrePers.equals(directorio.get(i).getNombre())) 
            {
                directorio.remove(i);
                System.out.println("Persona eliminada");  
                return;
            }
            System.out.println("Persona no registrada");
        }
    }

    public void delAll() 
    {
        directorio.clear();
        System.out.println("Directorio vaciado");
    }

    public void seeAll() 
    {
        for (int  i = 0; i < directorio.size(); i++) 
        {
            System.out.println("Nombre: " + directorio.get(i).getNombre());
            System.out.println("Numero: " + directorio.get(i).getNumero());
            System.out.println("Mascota: " + directorio.get(i).getMascota());
            System.out.println();
            System.out.println();
        }
    }
}