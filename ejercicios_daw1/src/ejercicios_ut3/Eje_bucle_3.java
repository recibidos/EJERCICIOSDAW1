package ejercicios_ut3;

import java.util.Scanner;

public class Eje_bucle_3 {

	public static void main(String[] args) {
		//Escribir un programa que pida varios números hasta que el usuario inserte un número par.
		//Hay que ir mostrando cada uno de los números insertados (excepto el par). 

		
		
		int leido;
		
		
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		//System.out.print("numerillo? ");
		//leido=teclado.nextInt();
		
		System.out.print("numerillo? ");
		leido=teclado.nextInt();
		while ((leido%2 != 0))
		{
			
			System.out.print(leido+" es impar... ");
			leido=teclado.nextInt();
			
		}
		
		
		teclado.close();
	
		
			
		


	}

}
