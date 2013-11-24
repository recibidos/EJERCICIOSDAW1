package ejercicios_ut3;
import graphics.Color;

import graphics.Ellipse;
import graphics.Rectangle;

public class Eje_dianas_colores {

	public static void main(String[] args) throws InterruptedException {
		//el circulo rebota en las paredes cambiando su trayectoria.
		Ellipse circu1;
		
		//lienzo=Canvas.getInstance();
		int cposx=30,cposy=70;
		int limitxR=640;
		int limitxL=0;
		int limityU=0;
		int limityD=500;
		int diametropelota=60;
		int dirx=1;int diry=-1; // control de la direccion del movimiento 1 -1...
		int pausapaso=3;
		
	    Rectangle cajacontorno; //se crea con uno de los 2 metodos constructores
		cajacontorno= new Rectangle(limitxL,limityU,limitxR+diametropelota,limityD+diametropelota); 
		//he aumentado el rectangulo por la derecha y abajo con el diametro de la pelota para que "no atraviese la pared"
		cajacontorno.draw();
		circu1= new Ellipse(cposx,cposy,diametropelota,diametropelota);
		circu1.draw();
		//circu1.setColor(new Color(10,0,200)); // por si queremos el circulo relleno de un color
		//circu1.fill();
		while (true){
			if (circu1.getX()==limitxL){dirx=1;}; //rebote horizontal con la izquierda
			if (circu1.getX()==limitxR){dirx=-1;};//rebote horizontal con la derecha
			if (circu1.getY()==limityU){diry=1;};//rebote vertical arriba
			if (circu1.getY()==limityD){diry=-1;};//rebote vertical abajo
			
			circu1.translate(dirx, diry); //movimiento paso a paso en la direccion marcada
			Thread.sleep(pausapaso);
		}
		

		}
		

}
