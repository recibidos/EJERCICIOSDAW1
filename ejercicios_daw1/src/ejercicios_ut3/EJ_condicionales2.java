package ejercicios_ut3;

import java.util.Scanner;

public class EJ_condicionales2 {

	public static void main(String[] args) {
		
		
		// Crea un programa que tiene una palabra oculta.
		//El programa pregunta la contraseña al jugador, 
		//si la adivina muestra un mensaje de éxito. Si no, muestra el error.
		
		String Oculta="",intentada="" ;
		final int Aleatorio=(int)(1+ (Math.random()*10));
		// asignacion de la cadena aeatoriamento
		switch(Aleatorio){
	
		case 1:
		  Oculta="agua";
		  break;
		case 2:
		  Oculta="fuego";
		  break;
		case 3:
		  Oculta="aire";
		  break;
		case 4:
		  Oculta="tren";
		  break;
		case 5:
		  Oculta="casa";
		  break;
		case 6:
		  Oculta="perro";
		  break;
		case 7:
		  Oculta="lapiz";
		  break;
		case 8:
		  Oculta="sol";
		  break;
		  case 9:
		  Oculta="luna";
		  break;
		  case 10:
		  Oculta="pelota";
		  break;
		}
	
		
		 System.out.println( "He pensado en una de estas palabras:\n agua, fuego, aire, tren, casa, perro, lapiz, sol, luna, pelota \n"
				 +" escoge una:(pista:("+Aleatorio+")");
		 
		 
			Scanner teclado = new Scanner(System.in);
			 intentada=teclado.next();
			 teclado.close();
			 
			 if (Oculta.equals(intentada.toLowerCase())) {
				 System.out.println( "Eres un Campeón no sé como lo haces");
			 }
			 else
			 {System.out.println( "Era muy díficil, la palabra es: "+Oculta);
			 }
			 }
				 
	 }
			

