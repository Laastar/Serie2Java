import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Main
{
	private static Scanner teclado = new Scanner(System.in); 
	private static ArrayList<String> binarios = new ArrayList<String>();

	public static void main(String[] args) 
	{
		System.out.print("Ingresa los numeros separados por un espacio: ");
		try 
		{

			String numeros = teclado.nextLine();
			String[] arrOfNums = numeros.split(" ");
			for (int i = 0; i < arrOfNums.length; i++) 
			{
				int res = Integer.parseInt(arrOfNums[i]);
				String binario = Integer.toBinaryString(res);
				binarios.add(binario);
			}
			System.out.println(binarios);
			Contador.kakuzu(binarios);
		}
		catch(Exception e) 
		{
			System.out.println("Porfavor ingrese un numero valido");
		}
	}
}