package ejercicios_ut2;


/* Escribir un programa que programa que pida el tama�o de un archivo (Mbytes) y 
 * la velocidad de una l�nea de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.

 	JAVIER HERNANDEZ RODRIGUEZ 1� DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio5 {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
	                                
	                float ficheromMB,veloMbits,tiempo;	               
	                System.out.println("CALCULO DEL TIEMPO DE TRASFERENCIA DE UN FICHERO:");
	                System.out.println( "�cuantos MegaBytes tiene el fichero? "); //da el mensaje por pantalla
	                
	                ficheromMB = teclado.nextFloat(); //se asigna la variable leyendo del teclado.
       
	                System.out.println( "�velocidad de transferencia en MegaBist/s de la l�nea? "); //da el mensaje por pantalla
	                
	                veloMbits = teclado.nextFloat(); //se asigna la variable leyendo del teclado.   
	                
	                
	                tiempo= ( ficheromMB/ (veloMbits*1000000f/(8*(float)(Math.pow(2, 20))))); //conversion a (float) del resultado Math.pow -- dibidimos Bytes/s /Bytes quedan Segundos 
	                
	                System.out.println("el fichero de:"+ficheromMB+" Mbytes se transferir� en:"+tiempo+"segundos, por una  l�nea de:"+veloMbits+" Mbits/s"); //mostramos resultados
	                
	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del m�todo main

							} //fin de la clase Ejercicio5
