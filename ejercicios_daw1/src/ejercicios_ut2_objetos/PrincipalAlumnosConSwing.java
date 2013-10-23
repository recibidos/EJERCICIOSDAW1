package ejercicios_ut2_objetos;

import javax.swing.JOptionPane;

public class PrincipalAlumnosConSwing {

	public static void main(String[] args) {
		ClaseAlumno alumno1 = new ClaseAlumno(); //Creación/instanciación objeto alumno1 de la clase ClaseAlumno
		ClaseAlumno alumno2 = new ClaseAlumno(); //Creación/instanciación alumno1 de la clase ClaseAlumno
		ClaseAlumno alumno3 = new ClaseAlumno(); //Creación/instanciación de la clase ClaseAlumno
		
		  {
		  // muestra un cuadro de diálogo con un mensaje 
		 JOptionPane.showMessageDialog(null, "te voy a pedir\nlos datos\nde 3 alumnos nobre y edad");
		alumno1.asignarNombre(JOptionPane.showInputDialog("¿Cual es el nombre del Alumno1?"));
		alumno1.asignarEdad(Integer.parseInt(JOptionPane.showInputDialog("Cual es la Edad?")));
		alumno2.asignarNombre(JOptionPane.showInputDialog("¿Cual es el nombre del Alumno2?"));
		alumno2.asignarEdad(Integer.parseInt(JOptionPane.showInputDialog("Cual es la Edad?")));
		alumno3.asignarNombre(JOptionPane.showInputDialog("¿Cual es el nombre del Alumno3?"));
		alumno3.asignarEdad(Integer.parseInt(JOptionPane.showInputDialog("Cual es la Edad?")));
		
		JOptionPane.showMessageDialog( null,"los datos dados son"+"\n1.-nombre"+alumno1.devolverNombre()+" edad: "+alumno1.devolverEdad()
				+"\n2.-nombre"+alumno2.devolverNombre()+" edad: "+alumno2.devolverEdad()
				+"\n3.-nombre"+alumno3.devolverNombre()+" edad: "+alumno3.devolverEdad()
				+"\n"+"\n La media de edad es:"+ (alumno1.calculaMedia(alumno2.calculaMedia(alumno2.devolverEdad(),alumno3.devolverEdad()),alumno1.devolverEdad())));
		
	
		//; = JOptionPane.showInputDialog("Cual es su nombre?");
		
	
		
			
		  }// fin de main
		// fin de la clase Dialogo1
	}

}
