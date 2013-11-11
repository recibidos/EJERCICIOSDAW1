package ejercicios_ut3;

import java.util.Scanner;

public class Ej6_detector_festivo_letras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int tipo_dia=0; //0 incorrecto , 1 laborable ,  Festivo
		
		 System.out.println( "Dame un numero de dia de la semana:");
			Scanner teclado = new Scanner(System.in);
		 numero=teclado.nextInt();
		 teclado.close();
			
		 switch (numero){
		 case 1: //SE PROPAGA HASTA ABAJO VÁLIDO PARA 1,2,3,4,5
			 
		 case 2:
			
		 case 3:
			
		 case 4:
			
		 case 5:
			 tipo_dia=1;
			 break;
		 case 6: //SE PROPAGA HASTA ABAJO VÁLIDO PARA 6,7
			 
		 case 7:
			 tipo_dia=2;
			 break;
	     default:
	}

}
