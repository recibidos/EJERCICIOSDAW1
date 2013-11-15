package ejercicios_ut3;

import java.util.Scanner;

public class Eje_bucle_5 {

	public static void main(String[] args) {
		//Escribe un programa que lea una serie de números, muestre el primero, no el segundo, si el tercero y así sucesivamente. 
		//Termina cuando insertamos un número negativo. El número negativo no se imprimirá.
		
		
		int leido=0;
		int contador=0;
		
		
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		System.out.print("dame numeros positivos");
	 
		while ((leido >= 0))
		{
			if ((contador%2!=0))
			{
			System.out.print(leido+" otro de orden par mas... ");
			}
			
			leido=teclado.nextInt();
			contador++;
			
			
		}
		
		
		teclado.close();
	
		
			
		


	}

}
