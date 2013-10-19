package ejercicios_ut2;



/* Escribir un programa que pregunte al usuario dos números y luego muestre la suma, el producto y la media de los dos números.
 	JAVIER HERNANDEZ RODRIGUEZ 1º DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio2 {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float valor1,valor2; //declaración de la variable "nombreUsuario"
	                
	                System.out.print( "Dame un valor por favor:"); //da el mensaje por pantalla
	                
	                valor1 = teclado.nextFloat(); //se asigna a valor1 lo que dá el metodo .nextLine() del objeto teclado (cargar un Float)
	                	    
	                System.out.print( "Dame otro valor por favor:"); //da el mensaje por pantalla
	                
	                valor2 = teclado.nextFloat(); //se asigna a valor2 lo que dá el metodo .nextFloat() del objeto teclado (cargar un Float)
		             
	                System.out.println("\nla suma de :"+valor1+" y de: "+valor2+" es: "+(valor1+valor2)); //da el resultado
	                
	                System.out.println("\nla el producto de :"+valor1+" x "+valor2+" es: "+(valor1*valor2)); //da el resultado
	                
	                System.out.println("\nla media de :"+valor1+" y de: "+valor2+" es: "+(valor1+valor2)/2); //da el resultado
	                
	                
	                
	             
	                                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del método main

							} //fin de la clase Ejercicio2
