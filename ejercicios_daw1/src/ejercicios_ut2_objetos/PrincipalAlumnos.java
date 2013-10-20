package ejercicios_ut2_objetos;

import java.util.Scanner;

public class PrincipalAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseAlumno alumno1 = new ClaseAlumno(); //Creación/instanciación objeto alumno1 de la clase ClaseAlumno
		ClaseAlumno alumno2 = new ClaseAlumno(); //Creación/instanciación alumno1 de la clase ClaseAlumno
		ClaseAlumno alumno3 = new ClaseAlumno(); //Creación/instanciación de la clase ClaseAlumno
		
		Scanner entradaPorTeclado = new Scanner( System.in );
		
		System.out.println("------ PEDIREMOS EL NOMBRE Y LA EDAD DE TRES ALUMNOS  --------");

			// pedimos los datos del Alumno1 usando los metodos de la clase ClaseAlumno
		alumno1.asignarNombre(alumno1.pedirNombre());
		alumno1.asignarEdad(alumno1.pedirEdad());
			// ahora los del alumno2
		alumno2.asignarNombre(alumno2.pedirNombre());
		alumno2.asignarEdad(alumno2.pedirEdad());
			// ahora los del alumno3
		alumno3.asignarNombre(alumno3.pedirNombre());
		alumno3.asignarEdad(alumno3.pedirEdad());
		
		//mostramos los datos con los metodos "mostrar" definidos en la ClaseAlumno
		alumno1.muestraNombre();
		alumno1.muestraEdad();	
		alumno2.muestraNombre();
		alumno2.muestraEdad();	
		alumno3.muestraNombre();
		alumno3.muestraEdad();
		

	
		 // Calculo de la media usando el metodo que esta almacenado en la clase (sin usar variables)
		System.out.println("_________edad media:");
		System.out.println
		(alumno1.calculaMedia(alumno2.calculaMedia(alumno2.devolverEdad(),alumno3.devolverEdad()),alumno1.devolverEdad()));
		
		

	}

}
