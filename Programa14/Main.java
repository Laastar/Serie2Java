public class Main 
{
    public static void main(String[] args) 
    {
        Agenda agenda = new Agenda();
         
        while(true)
        {
            agenda.opciones();
            System.out.println();
            //System.out.print("\033[H\033[2J");
            System.out.flush();
        } 
    }
}