package ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5.
 * Escribir un programa que pregunte al usuario
 * su nombre, y luego lo salude.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		double tama�o;
		double velocidad;
		double tiempo;
		Scanner teclado= new Scanner(System.in);
		System.out.println("�C�antos Megabytes?");
		tama�o = teclado.nextDouble();
		System.out.println("�velocidad en Mbit/s?");
		velocidad = teclado.nextDouble();
		
		tiempo=(tama�o * 1024.0 * 1024.0 * 8.0)/(velocidad*Math.pow(10,6));
				
		System.out.println("tardar� "+tiempo+ " segundos");
		teclado.close();
	}

}
