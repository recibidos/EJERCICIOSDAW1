package ejercicios_ut3;

import java.util.Scanner;

public class Eje_bucle_1 {

	public static void main(String[] args) {
		// Imprimir la tablas de multiplicar que el usuario elija.
		
		int que_tabla=0; 
		int contador=0;
		
		Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
		System.out.println("¿Qué tabla de multiplicar quieres que te escriba: ");
		que_tabla=teclado.nextInt();
		teclado.close();
		while ( contador<11) {
			System.out.println(que_tabla+" x "+(contador)+" = "+(que_tabla*contador++));
			
		}
	
		

	}

}
