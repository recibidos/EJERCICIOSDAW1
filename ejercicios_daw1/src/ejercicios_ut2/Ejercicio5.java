package ejercicios_ut2;


/* Escribir un programa que programa que pida el tamaño de un archivo (Mbytes) y 
 * la velocidad de una línea de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.

 	JAVIER HERNANDEZ RODRIGUEZ 1º DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio5 {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float ficheromMB,veloMbits,tiempo;	               
	                System.out.println("CALCULO DEL TIEMPO DE TRASFERENCIA DE UN FICHERO:");
	                System.out.println( "¿cuantos MegaBytes tiene el fichero? "); //da el mensaje por pantalla
	                
	                ficheromMB = teclado.nextFloat(); //se asigna la variable leyendo del teclado.
       
	                System.out.println( "¿velocidad de transferencia en MegaBist/s de la línea? "); //da el mensaje por pantalla
	                
	                veloMbits = teclado.nextFloat(); //se asigna la variable leyendo del teclado.   
	                
	                
	                tiempo= ( ficheromMB/ (veloMbits*1000000f/(8*(float)(Math.pow(2, 20))))); //conversion a (float) del resultado Math.pow -- dibidimos Bytes/s /Bytes quedan Segundos 
	                
	                System.out.println("el fichero de:"+ficheromMB+" Mbytes se transferirá en:"+tiempo+"segundos, por una  línea de:"+veloMbits+" Mbits/s"); //mostramos resultados
	                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del método main

							} //fin de la clase Ejercicio5
