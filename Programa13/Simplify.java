import java.util.Scanner;

class Simplify
{
    private int num1,num2;    

    public Simplify(int num1, int num2) 
    {
        this.num1 = num1;
        this.num2 = num2;
    }   

    public static void aprendizdeBrujo(Simplify obj) 
    {
        int bandera = 1;

        while(bandera != 0)
        {
            bandera = 0;
            if(obj.num1 % 2 == 0 && obj.num2 % 2 == 0)
            {
                obj.num1 = obj.num1/2;
                obj.num2 = obj.num2/2;
                bandera++;
            }

            if(obj.num1 % 3 == 0 && obj.num2 % 3 == 0)
            {
                obj.num1 = obj.num1/3;
                obj.num2 = obj.num2/3;
                bandera++;
            }

            if(obj.num1 % 5 == 0 && obj.num2 % 5 == 0)
            {
                obj.num1 = obj.num1/5;
                obj.num2 = obj.num2/5;
                bandera++;
            }

            if(obj.num1 % 7 == 0 && obj.num2 % 7 == 0)
            {
                obj.num1 = obj.num1/7;
                obj.num2 = obj.num2/7;
                bandera++;
            }

            if(obj.num1 % 11 == 0 && obj.num2 % 11 == 0)
            {
                obj.num1 = obj.num1/11;
                obj.num2 = obj.num2/11;
                bandera++;
            }

            if(obj.num1 % 13 == 0 && obj.num2 % 13 == 0)
            {
                obj.num1 = obj.num1/13;
                obj.num2 = obj.num2/13;
                bandera++;
            }

	        if(obj.num1 % 17 == 0 && obj.num2 % 17 == 0)
            {
                obj.num1 = obj.num1/17;
                obj.num2 = obj.num2/17;
                bandera++;
            }

            if(obj.num1 % 19 == 0 && obj.num2 % 19 == 0)
            {
                obj.num1 = obj.num1/19;
                obj.num2 = obj.num2/19;
                bandera++;
            }

            if(obj.num1 % 23 == 0 && obj.num2 % 23 == 0)
            {
                obj.num1 = obj.num1/19;
                obj.num2 = obj.num2/19;
                bandera++;
            }
        }

        System.out.println("Dividendo = " + obj.num1);
        System.out.println("Divisor = " + obj.num2);
    }
}
