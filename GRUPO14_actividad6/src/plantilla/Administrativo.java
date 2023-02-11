/**
 * Clase que representa a un administrativo y hereda de la clase Persona.
 * @author Grupo XIV
 */
package plantilla;

import persona.Persona;

public class Administrativo extends Persona {
	
	/**
	 * Constructor que permite crear un objeto de la clase Administrativo con los atributos nombre, apellido, direccion y telefono.
	 * 
	 * @param nombre El nombre del administrativo.
	 * @param apellido El apellido del administrativo.
	 * @param direccion La dirección del administrativo.
	 * @param telefono El teléfono del administrativo.
	 */
	public Administrativo(String nombre, String apellido, String direccion, String telefono) {
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
		// //Administrativo: “El administrativo Rosa Torres va a realizar estas tareas: hacer matrículas, controlar asistencia”. 
		//Como parte de la cadena utilizarás las propiedades nombre y tareas.
		return null;
	}
	}

