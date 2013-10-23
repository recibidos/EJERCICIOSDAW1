package ejercicios_ut2_objetos;

import java.util.Scanner;

public class ClaseAlumno {
//
	
	//CREACI�N DE LA CLASE ClaseAlumno	

	        //Declaraci�n de atributos de la clase Alumno
	        private String atr_nombre;
	        private int atr_edad; 
	        
	        //M�todo asignarNombre 
	        public void asignarNombre( String apelativo ){ //el parametro que se le pasar� a este m�todo ser� un "String" el apelativo 
	                
	                atr_nombre = apelativo;
	                
	        }
	        
	        //M�todo asignarEdad
	        public void asignarEdad( int a�os ){//el parametro que se le pasar� a este m�todo ser� "a�os" un "Int" (entero)              
	                atr_edad = a�os;
	                
	        }

	        //M�todo devolverEdad (retorna el atributo atr_edad para usarlo por ejemplo al calcular la media)
	        public double devolverEdad(){
	                
	                return (double)atr_edad; //reconversion del int a double para que funcione correctamente el m�todo "media"
	        }
	        //M�todo devolverEdad (retorna el atributo atr_edad para usarlo por ejemplo al calcular la media)
	         public String devolverNombre(){
	    	                
	    	        return (String)atr_nombre; //reconversion del int a double para que funcione correctamente el m�todo "media"
	    	                
	               
	        }
	                
	        //M�todo muestraNombre usa el System.print para sacar el atr_nombre por "consola"

	        public void muestraNombre(){
	                
	                System.out.print( " Nombre: " + atr_nombre ); //usamos print para que no haya salto de linea (decorativo)
	                
	        }
	        
	        //M�todo muestraNombre usa el System.print para sacar el atr_edad por "consola" con un peque�o forateo

	        public void muestraEdad(){
	                
	                System.out.println( "  tiene: " + atr_edad + " a�os" );
	        }
	                
	        
	        
	        //Metodo calculaMedia, dados 2 valores que se le pasan de tipo double calcula su media.
	        	        
	        public double calculaMedia(double valor1,double valor2){
	        	return ((valor1+valor2)/2);
	        }
	        
	        //metodo pedirNombre para pedir el dato del nombre lo retorna como un String pero no lo asigna...
	        public String pedirNombre(){
	        System.out.println("NOMBRE DEL ALUMNO:");
	        Scanner entradaPorTeclado = new Scanner( System.in );
	        return entradaPorTeclado.next();
	        }

			//metodo pedirNombre para pedir el dato de la Edad por teclado nombre lo retorna como un Int pero no lo asigna...
	        public int pedirEdad(){
	    	        System.out.println("Edad DEL ALUMNO:");
	    	        Scanner entradaPorTeclado = new Scanner( System.in );
	    	        return entradaPorTeclado.nextInt();
	        }
	 }
