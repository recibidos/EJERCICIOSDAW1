package ejercicios_ut2;



/* Escribir un programa Calcule el perímetro y área de un rectángulo dada su base y su altura.
 	JAVIER HERNANDEZ RODRIGUEZ 1º DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio3_a {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float base,altura,perimetro,area;//declaración de la variables
	                
	                System.out.print( "Dame un valor para la Base del Rectángulo por favor:"); //da el mensaje por pantalla
	                
	                base = teclado.nextFloat(); //se asigna a base lo que dá el metodo .nextLine() del objeto teclado
	                	    
	                System.out.print( "Dame otro valor para la Altura del Rectángulo por favor:"); //da el mensaje por pantalla
	                
	                altura = teclado.nextFloat(); //se asigna a vsnombre lo que dá el metodo .nextLine() del objeto teclado
		             
	                perimetro= (2*base +2* altura);  //2 veces la base + 2 veces la altura
	                area= (base*altura); 			 //fórmula básica del area de los rectángulos
	                
	                System.out.println("\nEl perimetro del rectángulo de base:"+base+" y de altura: "+altura+" es: "+perimetro); //da el resultado
	                
	                System.out.println("\nEl área del rectangulo de base:"+base+" y de altura: "+altura+" es: "+area); //da el resultado
	                
	                
	                
	                
	             
	                                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del método main

							} //fin de la clase Ejercicio3
