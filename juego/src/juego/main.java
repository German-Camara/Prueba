package juego;

import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		System.out.println("Bienvenido al juego de cazar el topo");
		
		System.out.println("Introduce un número entre el 0 y el 1000");
		
		int objetivo = (int) Math.floor(Math.random()*1000);
		
		int maximo=1000;
		int minimo=0;
		
		boolean cpu=false;
		int rival = (int) Math.floor(Math.random()*1000);
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		while(num!=objetivo && cpu==false)
		{
			System.out.println("Has fallado");
			if(num<objetivo)
			{
				System.out.println("Es más mayor");
			}
			if(num>objetivo)
			{
				System.out.println("Es más bajo");
			}
			
			if (rival==objetivo)
			{
				cpu=true;
			}
			if (rival>objetivo)
			{
				maximo=rival;
			}
			if (rival<objetivo)
			{
				minimo=rival;
			}
			
			rival = (int) Math.floor(Math.random()*(maximo-minimo+1)+minimo);
			num=sc.nextInt();
		}
		
		if(cpu)
		{
			System.out.println("Has perdido!!!!");
		}
		else
		{
			System.out.println("Has ganado!!!!");
		}
		sc.close();
	}
}
