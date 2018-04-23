import java.util.Scanner;
import java.util.ArrayList;

public class Enigma {

	private static Scanner teclado = new Scanner(System.in);
	private static ArrayList<Character> chars = new ArrayList<Character>();
	private static int opcion;

	public static void main(String[] args) 
	{
		while(true)
		{
			Enigma.opciones();
		}
	}

	public static  void cia()
	{
		System.out.println("Ingresa la cadena a cifrar: "); 
		String palabra = teclado.nextLine();
		for(int i = 0; i<palabra.length(); i++) 
		{
			chars.add(palabra.charAt(i));
		}
		for(int i=0; i<chars.size(); i++)
		{
			char aux = (char) ((int) chars.get(i)+3);
			chars.set(i,aux);
		}
		System.out.println("Palabra cifrada: "+chars);
		chars.clear();
	}

	public static void fbi()
	{
		System.out.println("Ingresa la palabra a Descifrar: "); 
		String palabra = teclado.nextLine();
		for(int i=0; i<palabra.length(); i++) 
		{
			chars.add(palabra.charAt(i));
		}
		for(int i=0; i<chars.size(); i++)
		{
			char aux = (char) ((int) chars.get(i)-3);
			chars.set(i,aux);
		}
		System.out.println("Palabra descifrada: "+chars);
		chars.clear();
	}

	public static void opciones() 
	{
		System.out.println("Elija cualquier opcion");
		System.out.println("1) Cifrar");
		System.out.println("2) Descifrar");
		System.out.println("3) Salir");

		try{
			opcion = Integer.valueOf(teclado.nextLine());
			switch(opcion){
				case 1:
				cia();
				break;
				case 2:
				fbi();
				break;
				case 3:
				System.exit(0);
				break;
				default :
				System.out.println("Ingrese una opcion valida"); 
				break;
			}
		} catch(Exception e){}       
	}
}


