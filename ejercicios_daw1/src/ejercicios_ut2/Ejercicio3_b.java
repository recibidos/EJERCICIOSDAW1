package ejercicios_ut2;



/* Escribir un programa Calcule el volumen de una esfera dado su radio.
 	JAVIER HERNANDEZ RODRIGUEZ 1º DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio3_b {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float radio,volumen;//declaración de la variables
	                
	                System.out.print( "Dame un valor para el radio de la Esfera por favor:"); //da el mensaje por pantalla
	                
	                radio = teclado.nextFloat(); //se asigna a base lo que dá el metodo .nextLine() del objeto teclado
	                	    
	                /* Usaremos métodos de la clase integrada Math, para ayudarnos con las fórmulas */
	                
	                volumen= (float) (2f/3f * Math.PI *(Math.pow(radio,3)));//euacion del volumen de la esfera 2/3*pi*r^3
	                		// 2f = 2 notacion flotante para evitar la auto conversion a enteros en operaciones
	                System.out.println("\nEl volumen de la esfera de radio: "+radio+" es: "+volumen); //da el resultado
	                
	             
	                                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del método main

							} //fin de la clase Ejercicio3_b
