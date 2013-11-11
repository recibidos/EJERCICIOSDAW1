package ejercicios_ut3;
import java.util.Scanner;
public class Ej6_detector_festivos_switch {
	

	

		public static void main(String[] args) {
			// pide el dia de la semana y dice que tipo de dia es Laborable/Festivo - Incorrecto
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
		    	
		    	 tipo_dia=0;
				break;
				
			 }
			 
			 switch(tipo_dia){
			 case 1:
				 System.out.printf("el dia numero "+numero+" es LABORABLE");
				 break;
				 
			 case 2:
					 System.out.printf("el dia numero "+numero+" es FESTIVO");
					 break;
			  default:
			    	// System.out.printf("el número %d no corresponde a ningun dia",numero);
				  System.out.printf("el dia numero "+numero+" NO ES VÁLIDO");
					break;
					
				 
			 }
		
				}
				
		}

	

