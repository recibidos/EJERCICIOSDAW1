package ejercicios_ut3;

import java.util.Scanner;

public class EJ_condicionales1 {

	public static void main(String[] args) {
		// Crea un programa que tiene un numero oculto (del 1 al 10). El programa pregunta el número al jugador,
		//  si la adivina muestra un mensaje de éxito. Si no, muestra el error.
		int numero=0;
		final int OCULTO=(int)(1+Math.random()*10);
		
		System.out.println("esto es para hacer trampa:"+OCULTO);
		
		 System.out.println( "Dame un numero DEL 1 AL 10:");
		 
			Scanner teclado = new Scanner(System.in);
			 numero=teclado.nextInt();
			 teclado.close();
			
			if (numero >= 1 && numero <= 10) //condicion para que el numero sea correcto
				{
					if (numero==OCULTO)
					{
						System.out.println("has acertado eres una Fiera!!!!!");
					}	
					else
						{System.out.println("Sigue intentando hay miles de Premios!!!");
						}
				}
			else
				{ 
				System.out.println("¿Que entiendes tu por un numero del 1 al 10?");
				}
			
		}// cierre del main
}// cierre del public class
