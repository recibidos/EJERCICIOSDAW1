package ejercicios_ut3;

import java.util.Scanner;

public class Eje_bucle_6 {

	public static void main(String[] args) {
	/* Modifica el ejercicio 3 de condicionales switch (operadores '+', '-', '*', '/') 
		de forma que permita hacer una operaci�n, volver� a pedir al usuario el operador, para, con los mismos n�meros,
		volver a hacer otra operaci�n. El programa terminar� cuando se inserte un caracter que no es un operador.
		*/
		String operacion="";
		int n1;
		int n2;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("dame el primer operador:");
		n1=teclado.nextInt();
		System.out.println("dame el segundo operador:");
		n2=teclado.nextInt();
		
	
			do{
			System.out.println("dame el operador:");
		operacion=teclado.next();
			switch (operacion) {
        case "+":
                System.out.println("El resultado de la suma es: " +(n1+n2));
                break;
        case "-":
                System.out.println("El resultado de la resta es: " +(n1-n2));
                break;
        case "*":
                System.out.println("El resultado del producto es: " +(n1*n2));
                break;
        case "/":
                System.out.println("El resultado de la divisi�n es: " + (n1/n2));
                break;
        default:
                System.out.println("Error, operaci�n no disponible. adiooos")
                ;}
			}
                
            	while ( (operacion.equals("*"))||
            			(operacion.equals("/"))||
            			(operacion.equals("+"))||
            			(operacion.equals("-")));
			
		
				teclado.close();
	
		
			
		

			
	}

}
