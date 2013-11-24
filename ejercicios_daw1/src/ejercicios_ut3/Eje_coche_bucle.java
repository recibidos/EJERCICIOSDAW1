package ejercicios_ut3;
import graphics.Color;
import graphics.Canvas;
import graphics.Rectangle;
import graphics.Ellipse;

public class Eje_coche_bucle {
  
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   Canvas ventana;
			 Rectangle capota,ventana1,carga,chasis ;
		     Ellipse ruedad,ruedat ;
		//ventana=Canvas.getInstance();
		capota= new Rectangle(50,190,100,50);
		chasis= new Rectangle(0,240,200,50);
		ventana1=new Rectangle(55,195,40,40);
		carga=new Rectangle(155,195,40,40);
		
		ruedad= new Ellipse(10,260,40,40);
		ruedat= new Ellipse(150,260,40,40);
		// variables control desplazamiento
	
		final int lposicionh=500; //limite del desplazamiento
		int desplazamientoh=0;
		int direccion=1; //(cambiará a -1 cuando rebote, tambien vale de paso de desplazamiento)
				
		
		//ventana1.new Rechtangle()
		capota.draw();
		capota.fill();
		chasis.draw();
		chasis.fill();
		ventana1.draw();
		carga.draw();
		carga.draw();
		ruedad.draw();
		ruedad.fill();
		ruedat.draw();
		ruedat.fill();
		capota.setColor(Color.BLUE);
		chasis.setColor(Color.BLUE);
		ventana1.setColor(Color.WHITE);
		carga.setColor(Color.RED);
		// mover
		desplazamientoh=lposicionh; //incicializamos el contador de "pasos"
		
		while (true) {
						if (desplazamientoh==0) {
								desplazamientoh=lposicionh; // ha llegado al limite horizontal
									direccion=direccion*(-1); //cambiamos el factor de direccion por el contrario (llego al limite)
			
									}
		
	
		capota.translate(direccion, 0);
		chasis.translate(direccion,0);
		ventana1.translate(direccion, 0);
		carga.translate(direccion,0);
		ruedad.translate(direccion, 0);
		ruedat.translate(direccion, 0);
		Thread.sleep(25);
		
		
		// empezamos con el movimiento
		
		desplazamientoh--; //decremento del contador controlador de pos.de desplazamiento
		}

	}

}
