package ejercicios_ut3;

import java.util.Scanner;

public class Ej_condicionales5 {

	public static void main(String[] args) {
	/*
	 * Un a�o es bisiesto si es divisible entre 4, excepto el �ltimo de cada siglo (aquel divisible por 100),
	 *  salvo que este �ltimo sea divisible  por 400 http://es.wikipedia.org/wiki/A�o_bisiesto.
	 *  Haz un programa que pida un a�o y muestre un mensaje de si es o no bisiesto.
	 */
		int a�o;   
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		    
			 System.out.println( "POR FAVOR INTRODUZCA EL A�O PARA DETERMINAR SI ES BISIESTO:");
		
				
		
				 a�o=teclado.nextInt();
				 teclado.close();
				 //CONCATENAMOS LAS COMPARACIONES L�GICAS CON "OR ||" 
				 //1� la de divisible por 400 (implica el final de siglo "especial"
				 //y luego las de "divisible por 4 y no divisible por 100 (final de siglo) que se deben dar simultaneamente
				 
				 
				 if ((a�o % 400 ==0 )||((a�o % 4 == 0) && (a�o % 100 !=0))) 
				 {
					 System.out.printf( "El a�o: %d es BISIESTO",a�o);
				 } else {
					 	System.out.printf("El a�o: %d es NO ES BISIESTO",a�o);
				 		}
			
					 
					
				 
	}

}
