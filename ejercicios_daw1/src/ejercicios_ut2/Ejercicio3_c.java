package ejercicios_ut2;



/* Escribir un programa Calcule el perímetro y área de un círculo dado su radio.
 	JAVIER HERNANDEZ RODRIGUEZ 1º DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio3_c {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float radio,perimetro,area;//declaración de la variables
	                
	                System.out.print( "Dame un valor para el radio de la Circunferencia por favor:"); //da el mensaje por pantalla
	                
	                radio = teclado.nextFloat(); //se asigna a base lo que dá el metodo .nextLine() del objeto teclado
	                	    
	                /* Usaremos métodos de la clase integrada Math, para ayudarnos con las fórmulas */
	                
	                perimetro= (float) (2f* Math.PI *radio); //ecuacion del perim. del circ 2*Pi*radio
	                										// se ha convertido el calculo a (float) para evitar error de conversion de tipos 
	                										// ya que Math.Pi retorna un "double"
	                area= (float) (Math.PI *(Math.pow(radio, 2)));//ecuacion del area del circulo. Pi*radio^2
	                
	                System.out.println("\nEl perimetro de la circunferencia de radio: "+radio+" es: "+perimetro+" , el área del circulo contenido es: "+area); //da el resultado
	                
	                
	                
	                
	                
	             
	                                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del método main

							} //fin de la clase Ejercicio3c
