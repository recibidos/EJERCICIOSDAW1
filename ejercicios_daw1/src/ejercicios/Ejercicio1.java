package ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5.
 * Escribir un programa que pregunte al usuario
 * su nombre, y luego lo salude.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		double tamaño;
		double velocidad;
		double tiempo;
		Scanner teclado= new Scanner(System.in);
		System.out.println("¿Cúantos Megabytes?");
		tamaño = teclado.nextDouble();
		System.out.println("¿velocidad en Mbit/s?");
		velocidad = teclado.nextDouble();
		
		tiempo=(tamaño * 1024.0 * 1024.0 * 8.0)/(velocidad*Math.pow(10,6));
				
		System.out.println("tardará "+tiempo+ " segundos");
		teclado.close();
	}

}
