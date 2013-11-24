package ejercicios_ut3;
import graphics.Color;
import graphics.Canvas;
import graphics.Rectangle;
import graphics.Ellipse;

public class Eje_SemaforoContinuo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub=
		Canvas lienzo;
		Rectangle cajamaforo;
		Ellipse circu1,circu2,circu3,circu4;
		
		lienzo=Canvas.getInstance();
		
		
		//rectangulo1= new Rectangle(); //se crea con uno de los 2 metodos constructores
		//cajamaforo= new Rectangle(70,70,60,300);
		cajamaforo=new Rectangle(35,5,160,320);
		circu1=new Ellipse(62,5,100,100);
		circu2=new Ellipse(62,110,100,100);
		circu3=new Ellipse(62,215,100,100);
		circu4=new Ellipse(65,7,96,96);
		cajamaforo.draw();
		circu1.draw();
		circu2.draw();
		circu3.draw();
		circu4.fill();
		
		while (true)  {
		circu4.setColor(Color.RED);
		cajamaforo.fill();
		cajamaforo.setColor(Color.GRAY);
		Thread.sleep(3000);
		circu4.setColor(Color.ORANGE);
			circu4.translate(0, 105);
			Thread.sleep(500);
			circu4.setColor(Color.GRAY);
			Thread.sleep(500);
			circu4.setColor(Color.ORANGE);
			Thread.sleep(500);
			circu4.setColor(Color.GRAY);
			Thread.sleep(500);
			circu4.setColor(Color.ORANGE);Thread.sleep(500);
			circu4.setColor(Color.GRAY);
			Thread.sleep(500);
			circu4.setColor(Color.ORANGE);
			
		
		Thread.sleep(2000);
		circu4.setColor(Color.GREEN);
		circu4.translate(0, 105);
		Thread.sleep(2500);
		circu4.setColor(Color.GRAY);
		
		circu4.setColor(Color.ORANGE);
		circu4.translate(0,-105);
		Thread.sleep(500);
		circu4.setColor(Color.GRAY);
		Thread.sleep(500);
		circu4.setColor(Color.ORANGE);
		Thread.sleep(500);
		circu4.setColor(Color.GRAY);
		Thread.sleep(500);
		circu4.setColor(Color.ORANGE);Thread.sleep(500);
		circu4.setColor(Color.GRAY);
		Thread.sleep(500);
		circu4.setColor(Color.ORANGE);
		
		circu4.setColor(Color.GRAY);
		circu4.translate(0,-105);
		
		}
		
	
	   
		
		
	}

}
