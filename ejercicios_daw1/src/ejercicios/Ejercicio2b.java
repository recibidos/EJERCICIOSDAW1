package ejercicios;
import java.util.Scanner;


/*
 * Ejercicio 2.
 * Escribir un programa que pregunte al usuario dos n�meros
 * y luego muestre la suma, el producto y la media de los
 * dos n�meros.
 */

public class Ejercicio2b {

	public static void main(String[] args) {
        double numero1,numero2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Dame dos n�meros, y calcular� con ellos: ");
        numero1 = teclado.nextDouble();
        numero2 = teclado.nextDouble();
        
        System.out.println("N�mero 1 " + numero1);
        System.out.println("N�mero 2 " + numero2);
        System.out.println("La suma es " + (numero1+numero2));
        System.out.println("El producto es "+ (numero1*numero2));
        System.out.println("La media es "+ (numero1+numero2)/2);
        
        teclado.close();
	}

}