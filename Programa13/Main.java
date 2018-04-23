import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int num1; 
        int num2;

        Simplify magic;

        try
        {
            System.out.println("Ingresa el dividendo");
            num1 = Integer.valueOf(teclado.nextLine());
            System.out.println("Ingresa el divisor");
            num2 = Integer.valueOf(teclado.nextLine());
            magic = new Simplify(num1, num2);
            Simplify.aprendizdeBrujo(magic);
        }
        catch (InputMismatchException e) 
        {
            System.out.println("Porfavor inserta un numero");
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Porfavor inserta un numero"); 
        }
    }
}