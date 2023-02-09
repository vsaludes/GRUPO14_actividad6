/**
 * Clase que representa a un profesor y que se extiende de la clase abstracta Persona.
 * @author Víctor
 */
package plantilla;

import persona.Persona;

/**
 * Crea una nueva instancia de Profesor con los siguientes datos:
 * 
 * @param nombre Nombre del profesor.
 * @param apellido Apellido del profesor.
 * @param direccion Dirección del profesor.
 * @param telefono Número de teléfono del profesor.
 */
public class Profesor extends Persona {

	public Profesor(String nombre, String apellido, String direccion, String telefono) {
		super(nombre, apellido, direccion, telefono);
		
	}

	 /**
     * {@inheritDoc}
     * 
     */
	@Override
	public String llamar(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}




}
