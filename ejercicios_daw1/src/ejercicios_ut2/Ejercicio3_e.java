package ejercicios_ut2;



/* Escribir un programa Calcule LA HIPOTENUSA DE UN TRIANGULO RECTANGULO CONOCIDOS 2 CATETOS.
 	JAVIER HERNANDEZ RODRIGUEZ 1º DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio3_e {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float cateto1,cateto2,hipotenusa;//declaración de la variables
	                System.out.println("CALCULO DE LA HIPOTENUSA DE UN TRIANGULO RECTANGULO CONOCIDOS 2 CATETOS");
	                
	                System.out.print( "Dame un valor para el primer Cateto:"); //da el mensaje por pantalla
	                
	                cateto1 = teclado.nextFloat(); //recogemos el dato del Cateto1
	                System.out.print( "Dame otro valor para el otro Cateto:"); //da el mensaje por pantalla

	                cateto2 = teclado.nextFloat(); //recogemos el dato del Cateto2
	                
	                //calculo de la hipotenusa
	                hipotenusa=(float) (Math.sqrt((Math.pow(cateto1, 2)+Math.pow(cateto2,2)))); //hay que reconvertir el resultado a float para cargarlo en la variable de ese tipo 
	                
	                
	              
	                System.out.println("\nLa hipotenusa de ese triangulo es:"+hipotenusa);
	                
	                                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del método main

							} //fin de la clase Ejercicio3_e
