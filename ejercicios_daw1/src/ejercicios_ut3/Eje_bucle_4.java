package ejercicios_ut3;

import java.util.Scanner;

public class Eje_bucle_4 {

	public static void main(String[] args) {
		//Escribir un programa que lea tantos n�meros como el usuario quiera
		//(hasta que se inserte un n�mero negativo). El primer n�mero hay que visualizarlo en la pantalla.

		
		
		int leido=0;
		
		
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		System.out.print("dame numeros positivos");
	 
		while ((leido >= 0))
		{
			System.out.print(leido+" otro mas... ");
			
			leido=teclado.nextInt();
			
			
		}
		
		
		teclado.close();
	
		
			
		


	}

}
