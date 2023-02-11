/**
 * Clase que representa a un alumno y hereda de la clase Persona.
 * @author Grupo XIV
 */
package plantilla;

import persona.Persona;

public class Alumno extends Persona {
	
	/**
	 * Constructor que permite crear un objeto de la clase Alumno con los atributos nombre, apellido, direccion y telefono.
	 * 
	 * @param nombre El nombre del alumno.
	 * @param apellido El apellido del alumno.
	 * @param direccion La dirección del alumno.
	 * @param telefono El teléfono del alumno.
	 */
	public Alumno(String nombre, String apellido, String direccion, String telefono) {
		super(nombre, apellido, direccion, telefono);
			}

	/**
	 * Método que permite que un objeto hijo llame a otro hijo.
	 * 
	 * @param p El objeto de la clase Persona a quien se quiere llamar.
	 * @return Una cadena de texto que contiene el nombre y apellido del objeto que llama al método y el nombre y apellido del objeto persona que se pasa como parámetro.
	 */
	@Override
	public String llamar(Persona p) {
		return this.getNombre() + " " + this.getApellido() + " llamando a " + p.getNombre() + " " + p.getApellido();
		
		}

	@Override
	public String trabajar() {
		////Alumno: “El alumno Alicia Torres va a estudiar para el curso 1º Bachillerato”. Como parte de la cadena usarás las propiedades nombre y curso.
		return null;
	}
	}

