package ejercicios_ut2;



/* Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

 	JAVIER HERNANDEZ RODRIGUEZ 1� DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio1 {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                String vsnombre; //declaraci�n de la variable "nombreUsuario"
	                
	                System.out.print( "�Me dices tu nombre, por favor? "); //da el mensaje por pantalla
	                
	                vsnombre = teclado.nextLine(); //se asigna a vsnombre lo que d� el metodo .nextLine() del objeto teclado
	                	                                
	                System.out.print( "Mucho gusto en conocerte: " + vsnombre + " , espero que tengas buen dia"); //muestra el saludo
	                                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del m�todo main

							} //fin de la clase Ejercicio1
