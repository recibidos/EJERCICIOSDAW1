package ejercicios_ut3;

import java.util.Scanner;

public class Ej_condicionales4 {

	public static void main(String[] args) {
		/* El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. 
		 * Crea un programa que pida: tamaño del depósito (en litros), porcentaje del depósito que está lleno 
		 * y litros de consumo por 100kms.
		 *El programa mostrará los kilómetros que quedan de autonomía.
         * Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar porque estamos usando la reserva.
         */
		
		double capacidad=0.0;
		double porcentaje=0.0;
		double consumo=0.0;
		double autonomiakm=0.0;
		final double chivato=30.0;
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		
		System.out.println(" ¿Qué capacidad (lts.) tiene el depósito? ");
		capacidad=teclado.nextDouble();
		System.out.println("¿Qué porcentaje de deposito queda? ");
		porcentaje=teclado.nextDouble();
		System.out.println("¿Cúal es la media actual en lts/100 Km?");
		consumo=teclado.nextDouble();
		
		teclado.close();
		autonomiakm=100*(capacidad*(porcentaje/100))/consumo;
		
		System.out.printf("Te queda combustible para hacer : %.2f Kmts.",autonomiakm);
		if (autonomiakm <chivato) 
			{ System.out.print("\0007");
		     System.out.flush();
			System.out.println(" REPOSTA CUANDO PUEDAS¡ESTAS CIRCULANDO CON LA RESERVA!");
			}
		}

}
