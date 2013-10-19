package ejercicios_ut2;



/* Escribir un programa Calcule el per�metro y �rea de un c�rculo dado su radio.
 	JAVIER HERNANDEZ RODRIGUEZ 1� DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio3_c {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float radio,perimetro,area;//declaraci�n de la variables
	                
	                System.out.print( "Dame un valor para el radio de la Circunferencia por favor:"); //da el mensaje por pantalla
	                
	                radio = teclado.nextFloat(); //se asigna a base lo que d� el metodo .nextLine() del objeto teclado
	                	    
	                /* Usaremos m�todos de la clase integrada Math, para ayudarnos con las f�rmulas */
	                
	                perimetro= (float) (2f* Math.PI *radio); //ecuacion del perim. del circ 2*Pi*radio
	                										// se ha convertido el calculo a (float) para evitar error de conversion de tipos 
	                										// ya que Math.Pi retorna un "double"
	                area= (float) (Math.PI *(Math.pow(radio, 2)));//ecuacion del area del circulo. Pi*radio^2
	                
	                System.out.println("\nEl perimetro de la circunferencia de radio: "+radio+" es: "+perimetro+" , el �rea del circulo contenido es: "+area); //da el resultado
	                
	                
	                
	                
	                
	             
	                                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del m�todo main

							} //fin de la clase Ejercicio3c
