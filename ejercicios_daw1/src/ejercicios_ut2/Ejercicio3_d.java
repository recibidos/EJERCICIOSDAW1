package ejercicios_ut2;



/* Escribir un programa
 Calcule el area de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 	JAVIER HERNANDEZ RODRIGUEZ 1º DAW VESPERTINO 2013 */

import java.util.Scanner; //importamos la libreria Scanner para poder leer del teclado

public class Ejercicio3_d {

	        public static void main(String[] args) {
	                
	                Scanner teclado = new Scanner( System.in ); 		//creamos el objeto teclado
	                                
	                float ordenada1,ordenada2,abcisa1,abcisa2,base,altura,area;		//declaración de la variables
	                
	                System.out.println("CALCULO DEL AREA DE UN RECTANGULO SEGUN 2 COORDENADAS DE VERTICES OPUESTOS");
	                
	                // asignaremos ahora al sucesivamente las ordenadas y abcisas de las 2 coordenadas valores cargando las variables con el metodo .nextFloat() de la clase Scanner
	                
	                System.out.print( "Dame un valor para coordenada X1:por favor:"); //da el mensaje por pantalla
	                
	                ordenada1 = teclado.nextFloat(); 
	                System.out.print( "Dame un valor para coordenada Y1:por favor:"); //da el mensaje por pantalla
	                
	                abcisa1 = teclado.nextFloat(); 
	                	    
	                System.out.print( "Dame un valor para coordenada X2:por favor:"); //da el mensaje por pantalla
	                
	                ordenada2 = teclado.nextFloat(); 
	                System.out.print( "Dame un valor para coordenada Y2:por favor:"); //da el mensaje por pantalla
	               
	                abcisa2 = teclado.nextFloat(); 
	               
	                //calculo de la base y altura , por el metodo del valor Absoluto abs
	                base=Math.abs(ordenada2-ordenada1);
	                altura=Math.abs(abcisa2-abcisa1);
	                area=base*altura;
	                System.out.print( "el area del rectangulo es: "+area);
	                	                teclado.close(); //llamamos al metodo close del objeto teclado (cierre) libera el recurso.

	        										} //fin del método main

							} //fin de la clase Ejercicio3d
