package ejercicios_ut3;

import java.util.Scanner;

public class EJ2_Par_o_Impar {

	public static void main(String[] args) {
		// DADO UN NUMERO ENTERO DIRÁ SI ES PAR O IMPAR
		  System.out.print( "Dame un numero entero:");
			Scanner teclado = new Scanner(System.in);
			int numero=teclado.nextInt();
			teclado.close();
			
			
			if (numero %2 !=0 )  // CONDICION DE COMPARACION CON EL OPERADOR RESTO DE DIVISION ENTERA
					{ 
						System.out.print( "El numero "+numero+" es IMPAR");
					}
					else
					{
						System.out.print( "El numero "+numero+" es PAR");
					}
	}

}
