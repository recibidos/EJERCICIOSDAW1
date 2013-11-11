package ejercicios_ut3;

import java.util.Scanner;

public class Ej5_dias_semana {

	public static void main(String[] args) {
		// pide el dia de la semana y da el nombre
		int numero=0;
		String dia_letra="";
		
		 System.out.println( "Dame un numero de dia de la semana:");
			Scanner teclado = new Scanner(System.in);
		 numero=teclado.nextInt();
		 teclado.close();
			
			if (numero==1){
				//letra_dia= new String("Lunes");
				dia_letra="Lunes";
			}else if (numero==2){
				dia_letra="Martes";
			}else if (numero==3){
				dia_letra="Miércoles";
			}else if (numero==4){
				dia_letra="Viernes";
			}else if (numero==5){
					dia_letra="Jueves";
			}else if (numero==6){
				dia_letra="Sábado";
			}else if (numero==7){
				dia_letra="Domingo";
			}else{
				System.out.printf("el número %d no corresponde a ningun dia",numero);
				dia_letra="error";

			}
			if (!(dia_letra.equals("error"))) {
				System.out.printf("el numero "+numero+" corresponde al: "+dia_letra);
				
			}
			
	}

}
