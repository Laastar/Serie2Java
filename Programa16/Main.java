import java.util.Scanner;
import java.io.IOException;

public class Main 
{
	static Scanner teclado = new Scanner(System.in); 

	public static void main(String[] args) 
	{
		System.out.print("Ingresa un numero: ");
		while (true) 
		{
			try 
			{
				int numero = Integer.valueOf(teclado.nextLine());
				rombo(numero);
				break;
			}
			catch(Exception e) 
			{
				System.out.println("Porfavor ingrese un numero valido");
			}
		}
	}

	public static void rombo(int numero)
    {
        for(int i=0; i<numero; i++)
        {
            System.out.println();
            for(int j=0; j <numero-i-1; j++)
            {
                System.out.print(" ");       
            }
            for(int k=0; k<2*i+1;k++)
            {
                System.out.print("*");
            }           
        }
        for(int j=numero-2; j>=0; j--)
        {
            System.out.println();
            for(int i=0; i <numero-j-1; i++)
            {
                System.out.print(" ");       
            }
            for(int i=0; i<2*j+1; i++)
            {
                System.out.print("*");
            }           
        }
        System.out.println();
    }
}