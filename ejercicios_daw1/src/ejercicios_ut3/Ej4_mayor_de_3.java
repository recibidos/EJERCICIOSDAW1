package ejercicios_ut3;

import java.util.Scanner;

public class Ej4_mayor_de_3 {

	public static void main(String[] args) {
		// Escribe un programa que visualice el m�s peque�o de tres n�meros.
		 System.out.println( "Dame un numero entero:");
			Scanner teclado = new Scanner(System.in);
			int numeroa=teclado.nextInt();
			System.out.println( "Dame otro numero entero:");
			
			int numerob=teclado.nextInt();
			System.out.println( "Dame otro numero entero:");
	
			int numeroc=teclado.nextInt();
			
			teclado.close();
			
			if (numeroa>=numerob) { //a>b escartamos a para las comparaciones
				{
				     if (numerob>=numeroc) //b>c el peque�o es el c
				     {
				    	 System.out.printf( "el numero %d es el menor ",numeroc);
				     	}
				     
				     	else //b<b
				     	{  //
				    		 System.out.printf( "el numero %d es el menor ",numerob);
				     	}
					}
				}
				
			
			else // b>a  descartamos b para las comparaciones
				{
				if (numeroa>=numeroc)  //a>c
				{	
					System.out.printf( "el numero %d es el menor ",numeroc);
				
				}else
					{
					System.out.printf( "el numero %d es el menor ",numeroa);
					}
				    
				}
			
						
				}
				
		
	

}
