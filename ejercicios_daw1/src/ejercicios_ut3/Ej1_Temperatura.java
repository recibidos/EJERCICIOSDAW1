package ejercicios_ut3;

import java.util.Scanner;

public class Ej1_Temperatura {

	public static void main(String[] args) {
		// leemos la temperatura en �F
		  System.out.print( "Dame un valor para la temperatura en �F:");
		Scanner teclado = new Scanner(System.in);
		double temperatura=teclado.nextDouble();
		teclado.close();
		//PAsar a �C
		temperatura = (temperatura-32)/1.8;
		
		//verificar congelaci�n
		if (temperatura <= 0)
			{	 System.out.println( "Aviso Punto de congelaci�n temperatura = "+temperatura+" �C");
			 System.out.println( " �cuidado con el hielo!");
			}
			else {System.out.println( "Valores correctos, temperatura actual = "+temperatura+" �C");
			}
		
         

	}

}
