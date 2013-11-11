package ejercicios_ut3;

import java.util.Scanner;

public class Ej_condicionales3 {

	public static void main(String[] args) {
		//Una tienda hace un descuento del 10% por compras menores de 20€, un 20% por compras entre 20 y 50€ y un 25% si la 
		//compra es mayor. Escribe un programa que pida el precio de un producto y muestre su precio final en las rebajas.
		
		// fórmula del descuento para evitar desbordamientos   cantidadFinal=(cantidadInicial-(cantidadInicial*(porcentaje_descuento/100)
		
		//declarar variables
		double importe_compra=0.0;      //para almacenar el total base de la compra.
		double des_fin=0.0;             // para guardar el % de descuento final. (inicialmente a 0)
		double importe_descontado=0.0;   //guardará el precio final con descuento
				
		final double des1_p=10.0 ;  	//guarda el porcentaje de descuento tipo1
		final double des1_d=5.0;		//guarda valor mínimo (desde) para descuento tipo1
		final double des1_h=20.0;		//guarda valor máximo (hasta) para descuento tipo1
		final double des2_p=20.0 ;  	//guarda el porcentaje de descuento tipo1
		final double des2_d=20.0;		//guarda valor mínimo (desde) para descuento tipo2
		final double des2_h=50.0;		//guarda valor máximo (hasta) para descuento tipo2
		final double des3_p=25;			//guarda el descuento para compras mayores que tipo1 y tipo2
		final double des3_d=50.0;		//guarda valor mínimo (desde) para descuento tipo3
	    Scanner teclado = new Scanner(System.in); //inicializar captura de teclado
	    
		 System.out.println( "POR FAVOR INTRODUZCA EL IMPORTE DE SU COMPRA:");
	
			
	
			 importe_compra=teclado.nextDouble();
			 teclado.close();
			 
			 if (importe_compra > des1_d && importe_compra < des1_h) {  // condicion para descuento nivel d1
				 des_fin=des1_p;
			 } else {
				 if (importe_compra > des2_d && importe_compra < des2_h) { // condicion para descuento nivel d2
				 des_fin=des2_p;
				 } else {
					 if (importe_compra > des3_d) { // condicion para descuento nivel d3
						 des_fin=des3_p;
			     		 }
				 }
			 }
			 if (des_fin==0){ //no hay descuento
				 importe_descontado=importe_compra;
				 System.out.printf("\n No ha llegado a la cantidad mínima de Compra, \n el importe de su compra es:..... %2.f €",importe_descontado);
			 }else{ // compra con descuento ...
				 importe_descontado=(importe_compra-(importe_compra*(des_fin)/100));
				 //System.out.printf("\n Importe incial: %3$.2f €, descuento: %2$.2f % IMPORTE FINAL: %1$.2f €",importe_descontado,des_fin,importe_compra);
				 System.out.printf(" Importe incial: %3$.2f €, descuento: %2$.2f %% IMPORTE FINAL: %1$.2f €",importe_descontado,des_fin,importe_compra);
	
			 }
					 
				 
			 }
	

}
