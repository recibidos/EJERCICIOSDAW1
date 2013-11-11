package ejercicios_ut3;

import java.util.Scanner;

public class Ej_condicionales6 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida el ph de una solución 
		 * y muestre el mensaje de si la solución es ácida (ph < 7.0)
		 *  o peligrósamente ácida: ph < 3.0)
		 */

		Scanner teclado=new Scanner(System.in);
		
		double nivelph=0.0;
		
		System.out.println("Por favor introduce el nivel de PH de tu solución: ");
		
		nivelph=teclado.nextDouble();
		teclado.close();
		//procedemos con el análisis
		if( nivelph <3.0)
		{
			System.out.printf("TEN CUIDADO EL NIVEL DE pH : %.2f ES ¡PELIGROSAMENTE ÁCIDO!",nivelph);
		}else{
			if (nivelph <7.0)
			{
				System.out.printf(" EL NIVEL DE pH : %.2f INDICA QUE LA SOLUCION ES ÁCIDA",nivelph);
			}else{
				System.out.printf(" EL NIVEL DE pH : %.2f INDICA QUE LA SOLUCION NO ES ÁCIDA",nivelph);
				}
			}
		
		
		
	}

}
