package ejercicios_ut3;

import java.util.Scanner;

public class Eje_bucle_2 {

	public static void main(String[] args) {
		// Pedir n�meros hasta que se inserte un 0. Mostrar la cantidad de n�meros le�dos y el resultado de multiplicar todos ellos.
		
		final int numeroparar=0; 
		int contador=-1;
		int multiplicados=0;
		int leido;
		
		
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		//System.out.print("numerillo? ");
		//leido=teclado.nextInt();
		leido=1;
		multiplicados=1;
	
		do
		{
			multiplicados=multiplicados*leido;
			System.out.print(" � numerillo? ");
			leido=teclado.nextInt();
			
		
		
		
		contador++;
		
		}
		while (leido!=numeroparar);
		
		
		teclado.close();
		if (contador==0)
		{System.out.println(" s�lo has usado el 0 ");}
		else{
		System.out.println("has usado: "+contador+" valores distintos de 0 y su multiplicaci�n es: "+multiplicados);
		}



	}

}
