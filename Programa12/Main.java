import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        double a,b,c;
        WonderlandException iiee = new WonderlandException();

        System.out.println("Ingrese los coeficientes de su polinomio para calcular las raices");

        while (true) 
        {
            try
            {
                a = Double.valueOf(teclado.nextLine());    
                b = Double.valueOf(teclado.nextLine());
                c = Double.valueOf(teclado.nextLine());
                Polinomio p = new Polinomio(a,b,c); 

                double res1 = p.misterio(1);
                double res2 = p.misterio(0);

                System.out.printf("Sus raices son:  %f   y   %f ", r1,r2);
            }
            catch(NumberFormatException nfe) 
            {
                System.out.println("Inserte un numero porfavor");
            }
            catch(WonderlandException we) 
            {
                System.out.println(we.getMessage());
            }
        }
    }
}