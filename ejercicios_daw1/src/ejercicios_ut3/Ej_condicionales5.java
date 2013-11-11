package ejercicios_ut3;

import java.util.Scanner;

public class Ej_condicionales5 {

	public static void main(String[] args) {
	/*
	 * Un año es bisiesto si es divisible entre 4, excepto el último de cada siglo (aquel divisible por 100),
	 *  salvo que este último sea divisible  por 400 http://es.wikipedia.org/wiki/Año_bisiesto.
	 *  Haz un programa que pida un año y muestre un mensaje de si es o no bisiesto.
	 */
		int año;   
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		    
			 System.out.println( "POR FAVOR INTRODUZCA EL AÑO PARA DETERMINAR SI ES BISIESTO:");
		
				
		
				 año=teclado.nextInt();
				 teclado.close();
				 //CONCATENAMOS LAS COMPARACIONES LÓGICAS CON "OR ||" 
				 //1º la de divisible por 400 (implica el final de siglo "especial"
				 //y luego las de "divisible por 4 y no divisible por 100 (final de siglo) que se deben dar simultaneamente
				 
				 
				 if ((año % 400 ==0 )||((año % 4 == 0) && (año % 100 !=0))) 
				 {
					 System.out.printf( "El año: %d es BISIESTO",año);
				 } else {
					 	System.out.printf("El año: %d es NO ES BISIESTO",año);
				 		}
			
					 
					
				 
	}

}
