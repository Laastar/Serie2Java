public class Polinomio 
{
    private double a;
    private double b;
    private double c;

    public Polinomio(double a, double b, double c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double misterio(int casual) throws WonderlandException 
    {
        if (b*b-4*(a)*(c)<0) 
        {
            throw new WonderlandException(); 
        }
        else
        {
            if(casual == 1)
            {
                return ((-b + Math.sqrt(b*b-4*(a*c)))/2*a);
            }
            else
            {
                return ((-b - Math.sqrt(b*b-4*(a*c)))/2*a);
            }
        }
    }
}