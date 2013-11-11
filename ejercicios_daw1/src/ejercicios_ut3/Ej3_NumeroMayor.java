package ejercicios_ut3;

import java.util.Scanner;

public class Ej3_NumeroMayor {

	public static void main(String[] args) {
		// dados 2 numeros dirá cual es el mayor o igual que el otro
		  System.out.println( "Dame un numero entero:");
			Scanner teclado = new Scanner(System.in);
			int numeroa=teclado.nextInt();
			System.out.println( "Dame otro numero entero:");
			//Scanner teclado = new Scanner(System.in);
			int numerob=teclado.nextInt();
			
			teclado.close();
			
			//comparamos
			if (numeroa >= numerob)
			{
				System.out.printf( "el numero %d es mayor o igual que %d",numeroa,numerob);
			}
				else
				{
					System.out.printf( "el numero %d es mayor que %d",numerob,numeroa);
				}
	}

}
