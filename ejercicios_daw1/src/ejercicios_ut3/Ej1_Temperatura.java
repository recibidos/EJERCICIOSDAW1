package ejercicios_ut3;

import java.util.Scanner;

public class Ej1_Temperatura {

	public static void main(String[] args) {
		// leemos la temperatura en ºF
		  System.out.print( "Dame un valor para la temperatura en ºF:");
		Scanner teclado = new Scanner(System.in);
		double temperatura=teclado.nextDouble();
		teclado.close();
		//PAsar a ºC
		temperatura = (temperatura-32)/1.8;
		
		//verificar congelación
		if (temperatura <= 0)
			{	 System.out.println( "Aviso Punto de congelación temperatura = "+temperatura+" ºC");
			 System.out.println( " ¡cuidado con el hielo!");
			}
			else {System.out.println( "Valores correctos, temperatura actual = "+temperatura+" ºC");
			}
		
         

	}

}
