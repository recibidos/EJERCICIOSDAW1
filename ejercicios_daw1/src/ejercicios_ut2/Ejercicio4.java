package ejercicios_ut2;



/* Escribir un programa que pase de Kilos a Onzas el valor pedido dato:1 Kilogramo (Kg) = 35.2739619 Onzas (oz)
 	JAVIER HERNANDEZ RODRIGUEZ 1º DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio4 {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float kilogramos =0.0f; //inicializacion con asignacion a 0 (en float)
	                final float onzas_kilo = 35.2739619f; //declaracion de una constante (final)
	                float onzas;
	                System.out.print( "¿cuantos Kilogramos quieres convertir a Onzas? "); //da el mensaje por pantalla
	                
	                kilogramos = teclado.nextFloat(); //se asigna la variagle Kilogramos (float) metodo .nextfloat() del objeto teclado
	                
	                onzas=(kilogramos*onzas_kilo);
	                
	                System.out.println( kilogramos+" son:"+onzas+" Onzas");
	                                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del método main

							} //fin de la clase Ejercicio4
