import java.util.Scanner;

public class Main17 
{
   public static void main(String[] args) 
   {
    System.out.print("Ingresa el numero de discos: ");
    Scanner sc = new Scanner(System.in);
    int ndiscos = Integer.parseInt(sc.nextLine());    
    int nDisks = ndiscos;
    doTowers(nDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int topN, char from, char inter, char to) 
    {
        if (topN == 1)
        {
            System.out.println("Disk 1 from " + from + " to " + to);
        }
        else 
        {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disco " + topN + " desde " + from + " hacia " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}

