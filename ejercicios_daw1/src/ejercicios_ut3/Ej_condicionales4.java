package ejercicios_ut3;

import java.util.Scanner;

public class Ej_condicionales4 {

	public static void main(String[] args) {
		/* El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar. 
		 * Crea un programa que pida: tama�o del dep�sito (en litros), porcentaje del dep�sito que est� lleno 
		 * y litros de consumo por 100kms.
		 *El programa mostrar� los kil�metros que quedan de autonom�a.
         * Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar porque estamos usando la reserva.
         */
		
		double capacidad=0.0;
		double porcentaje=0.0;
		double consumo=0.0;
		double autonomiakm=0.0;
		final double chivato=30.0;
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		
		System.out.println(" �Qu� capacidad (lts.) tiene el dep�sito? ");
		capacidad=teclado.nextDouble();
		System.out.println("�Qu� porcentaje de deposito queda? ");
		porcentaje=teclado.nextDouble();
		System.out.println("�C�al es la media actual en lts/100 Km?");
		consumo=teclado.nextDouble();
		
		teclado.close();
		autonomiakm=100*(capacidad*(porcentaje/100))/consumo;
		
		System.out.printf("Te queda combustible para hacer : %.2f Kmts.",autonomiakm);
		if (autonomiakm <chivato) 
			{ System.out.print("\0007");
		     System.out.flush();
			System.out.println(" REPOSTA CUANDO PUEDAS�ESTAS CIRCULANDO CON LA RESERVA!");
			}
		}

}
