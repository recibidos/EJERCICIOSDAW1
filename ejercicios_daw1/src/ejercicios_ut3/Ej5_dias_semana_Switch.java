package ejercicios_ut3;

import java.util.Scanner;

public class Ej5_dias_semana_Switch {
	public static void main(String[] args) {
		// pide el dia de la semana y da el nombre
		int numero=0;
		String dia_letra="";
		
		 System.out.println( "Dame un numero de dia de la semana:");
			Scanner teclado = new Scanner(System.in);
		 numero=teclado.nextInt();
		 teclado.close();
			
		 switch (numero){
		 case 1:
			 dia_letra="Lunes";
			 break;
		 case 2:
			 dia_letra="Martes";
			 break;
		 case 3:
			 dia_letra="Miércoles";
			 break;
		 case 4:
			 dia_letra="Jueves";
			 break;
		 case 5:
			 dia_letra="Viernes";
			 break;
		 case 6:
			 dia_letra="Sábado";
			 break;
		 case 7:
			 dia_letra="Domingo";
			 break;
	     default:
	    	 System.out.printf("el número %d no corresponde a ningun dia",numero);
			dia_letra="error";
			break;
			
		 }
		 if (!(dia_letra.equals("error"))) {
				System.out.printf("el numero "+numero+" corresponde al: "+dia_letra);
				
			}
			
	}

}


