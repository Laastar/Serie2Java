import java.util.Scanner;
import java.util.ArrayList;

class Matriz
{
	Scanner sc = new Scanner(System.in);
	double matriz [][];
	int orden;

	Matriz(int orden)
	{
		this.orden= orden;
		this.matriz = new double[orden][orden];
	}

	Matriz(int filas, int k)
	{ 
		this.orden=filas;
		this.matriz = new double[filas][k];
	} 

	void setElemento(int a, int b, double x)
	{
		this.matriz[a][b] = x;
	}

	double getElemento(int a, int b)
	{
		return matriz[a][b];
	}

	int getOrden()
	{
		return this.orden;
	}

	double[] getFila(int m)
	{
		return this.matriz[m];
	}

	void llenar()
	{
		double k =0;
		System.out.println("Ingresa los elementos de la matriz");
		for (int i=0; i< this.getOrden(); i++)
		{
			for(int j= 0; j<this.getOrden(); j++)
			{
				System.out.println("elemento " + i + " " + j);
				k = sc.nextInt();
				this.setElemento(i,j, k);
			}
		}
	}

	void imprimir()
	{
		System.out.println("");
		for (int i=0; i< this.getOrden(); i++)
		{
			for(int j= 0; j<this.getOrden(); j++)
			{
				System.out.print(this.matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}

	Matriz obtenermenores(int i, int j)
	{
		int ordenmenor= (this.getOrden()-1); //de 1 a orden de matriz -1
		Matriz submatriz = new	Matriz(ordenmenor);//crear una nueva matriz
		int r=0, s = 0;
		for (int k=0; k<this.getOrden(); k++) //insertar los elementos de la matriz padre - ciclo
		{
			double[] fila = this.getFila(k);
			if(k != i)
			{
				for(int l=0; l<fila.length; l++)
				{
					if (l != j)
					{
						submatriz.setElemento(r,s++, fila[l]);
					}
				}
				r++;
				s=0;
			}
		}
		return submatriz;
	}

	double getDeterminante(Matriz mat, double determinante)
	{	
		if(mat.getOrden()==1)
		{
			return mat.getElemento(0,0);
		}
		else
		{
			determinante=0;
			for(int j = 0; j<mat.getOrden();j++)
			{
				Matriz submatriz = mat.obtenermenores(0,j);
				determinante += (Math.pow(-1,j))*mat.getElemento(0,j)*(getDeterminante(submatriz, determinante));
			}
		}
		return determinante;
	}
}


class Ejercicio19 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		int orden;
		while(continuar)
		{
			System.out.println("Calculadora de determinantes");
			System.out.println("1) crear matriz  y calcular su determinante");
			System.out.println("2) salir");
			System.out.println("");
			
			int opcion=sc.nextInt();
			switch(opcion)
			{
			case 1: //nueva matriz
				System.out.println("de que orden deseas la nueva matriz");
				int nuevoOrden= sc.nextInt();
				if (nuevoOrden == 0)
				{
					System.out.println("no hay matrices de orden 0");
				}
				else
				{
					Matriz nueva= new Matriz(nuevoOrden);
					nueva.llenar();
					double det= nueva.getDeterminante(nueva,0);
					System.out.println("el determinante de esta matriz es  "+det);
				System.out.println("");
				}
				break;
			case 2: // salir 
				System.exit(0);
				break;
			}
		}
	}
}