package test;

import plantilla.Administrativo;
import plantilla.Alumno;
import plantilla.Profesor;

public class Principal {

	public static void main(String[] args) {
				
		//Crea un objeto Profesor, un objeto Alumno y un objeto Administrativo.
		//Heredan los parámetros:  nombre  apellido direccion telefono 
		
		Profesor profe = new Profesor("Tomás", "Delgado", "Calle Cucudrulo 5, Madrid", "696655733" );
		Alumno alumn = new Alumno("Diego", "Alejo", "Avenida de los Álamos 24, Albacete", "677414889");
		Administrativo admin = new Administrativo("Marta", "González", "Plaza Italia, 3", "633226654");
		
		//Ejecuta el método toString() sobre cada uno de ellos.
		
		System.out.println(profe.toString());
		System.out.println(alumn.toString());
		System.out.println(admin.toString());
		
		//Ejecuta el método trabajar() sobre cada uno de ellos.
		
		//Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
		System.out.println("\n" + profe.llamar(alumn));
	}

}
