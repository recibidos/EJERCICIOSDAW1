package ejercicios_ut3;
import graphics.Color;
import graphics.Canvas;

import graphics.Ellipse;

public class Eje_pelota_rebota {



	public static void main(String[] args) throws InterruptedException {
		// Escribir un programa que dibuje 10 círculos concéntricos en la pantalla. 
		//Puedes utilizar Math.Random() para obtener valores de color aleatorio
	
        
			
		Canvas lienzo;
		
		Ellipse circu1;
		
		lienzo=Canvas.getInstance();
		
		
		//rectangulo1= new Rectangle(); //se crea con uno de los 2 metodos constructores
		//cajamaforo= new Rectangle(70,70,60,300);
		for (int i=1;i<11;i++){
			int aleatr,aleatg,aleatb; // variables internas para rojo verde y azul...
			circu1=new Ellipse((i*20),(i*20),500-(i*40),500-(i*40));
			circu1.draw();
			aleatr=(int)(Math.random()*255);
			aleatg=(int)(Math.random()*255);
			aleatb=(int)(Math.random()*255);
			circu1.setColor(new Color(aleatr,aleatg,aleatb));
			circu1.fill();
			Thread.sleep(200);
			
		}
		

		}
		

}
