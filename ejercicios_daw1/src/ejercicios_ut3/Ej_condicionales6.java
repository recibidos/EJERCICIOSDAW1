package ejercicios_ut3;

import java.util.Scanner;

public class Ej_condicionales6 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida el ph de una soluci�n 
		 * y muestre el mensaje de si la soluci�n es �cida (ph < 7.0)
		 *  o peligr�samente �cida: ph < 3.0)
		 */

		Scanner teclado=new Scanner(System.in);
		
		double nivelph=0.0;
		
		System.out.println("Por favor introduce el nivel de PH de tu soluci�n: ");
		
		nivelph=teclado.nextDouble();
		teclado.close();
		//procedemos con el an�lisis
		if( nivelph <3.0)
		{
			System.out.printf("TEN CUIDADO EL NIVEL DE pH : %.2f ES �PELIGROSAMENTE �CIDO!",nivelph);
		}else{
			if (nivelph <7.0)
			{
				System.out.printf(" EL NIVEL DE pH : %.2f INDICA QUE LA SOLUCION ES �CIDA",nivelph);
			}else{
				System.out.printf(" EL NIVEL DE pH : %.2f INDICA QUE LA SOLUCION NO ES �CIDA",nivelph);
				}
			}
		
		
		
	}

}
