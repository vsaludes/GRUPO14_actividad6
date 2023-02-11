/**
 * Clase que representa a un profesor y hereda de la clase Persona.
 * @author Grupo XIV
 */
package plantilla;

import persona.Persona;

public class Profesor extends Persona {
	
	/**
	 * Constructor que permite crear un objeto de la clase Profesor con los atributos nombre, apellido, direccion y telefono.
	 * 
	 * @param nombre Nombre del profesor.
	 * @param apellido Apellido del profesor.
	 * @param direccion Dirección del profesor.
	 * @param telefono Número de teléfono del profesor.
	 */
	public Profesor(String nombre, String apellido, String direccion, String telefono) {
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

	/**
	 * 
	 */
	@Override
	public String trabajar() {
		// //Profesor: “El profesor Carlos Robles va a impartir su clase”. Como parte de la cadena usarás la propiedad nombre.
		return "El profesor " + this.getNombre() + " " + this.getApellido() + " va a impartir su clase.";
	}




}
