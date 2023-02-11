package test;

import plantilla.Administrativo;
import plantilla.Alumno;
import plantilla.Profesor;

public class Principal {

	public static void main(String[] args) {
				
		
		//Crea un objeto Profesor, un objeto Alumno y un objeto Administrativo.
		//Heredan los parámetros:  nombre, apellido, direccion y telefono. 
		
		Profesor profe = new Profesor("Tomás", "Delgado", "Calle Cucudrulo 5, Madrid", "696655733" );
		Alumno alumn = new Alumno("Diego", "Alejo", "Avenida de los Álamos 24, Albacete", "677414889");
		Administrativo admin = new Administrativo("Marta", "González", "Plaza Italia 3, Sevilla", "633226654");
		//prueba
		Profesor profe2 = new Profesor("María", "Schubert", "Rue del Percebe 13, Barcelona", "633696336");
		
		
		//Ejecuta el método toString() sobre cada uno de ellos.
		System.out.println("Ejecuta el método toString() sobre cada uno de ellos.");
		System.out.println("\n" + profe.toString());
		System.out.println(alumn.toString());
		System.out.println(admin.toString());
		
		
		//Ejecuta el método trabajar() sobre cada uno de ellos.
		System.out.println("\n\nEjecuta el método trabajar() sobre cada uno de ellos.");
		System.out.println("\n" + profe.trabajar());
		System.out.println(alumn.trabajar());
		System.out.println(admin.trabajar());
		
		
		//Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
		System.out.println("\n\nEjecuta el método llamar(Persona p) para que el alumno llame al profesor.");
		System.out.println("\n" + profe.llamar(alumn));
		//Pruebas
		System.out.println("\nPruebas");
		System.out.println(alumn.llamar(admin));
		System.out.println(profe.llamar(admin));
		System.out.println(profe.llamar(profe2));
	}

}
