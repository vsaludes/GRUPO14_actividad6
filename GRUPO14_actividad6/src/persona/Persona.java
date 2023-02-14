/**
 * Clase abstracta que representa una Persona.
 * @author Grupo XIV
 */
package persona;

public abstract class Persona {
	
	/**
	 *  <b>String nif</b> Nif de la persona<br>
	 *  <b>String nombre</b> Nombre de la persona<br>
	 *  <b>String apellido</b> Apellido de la persona<br>
	 *  <b>String direccion</b> Dirección de la persona<br>
	 *  <b>String telefono</b> Teléfono de la persona
 	 */
	private String nif;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
    
    /**
     * Constructor con todos los atributos de la persona
     * @param nif Nif de la persona
     * @param nombre Nombre de la persona
     * @param apellido Apellido de la persona
     * @param direccion Dirección de la persona
     * @param telefono Teléfono de la persona
     */
    
	public Persona(String nif, String nombre, String apellido, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getNif() {
		return nif;
	}
	
	public void setNif (String nif) {
		this.nif = nif;
	}
	
	/**
	 * Obtiene el nombre de la persona
	 * @return nombre Nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece el nombre de la persona
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
    
	/**
	 * Método abstracto que representa una llamada de una persona a otra.
	 * @param p La persona a la que se está llamando
	 * @return La información sobre la llamada
	 */
	public abstract String llamar(Persona p);

	/**
	 * Método toString()
	 * @return Una cadena de texto que combina el valor de los atributos nombre y apellido separados por un espacio.
	 */
	public String toString() {
        return nombre + " " + apellido;
    }
	
	/**
	 * Método abstracto que se especializa en cada subclase para devolver una cadena que indica el tipo de tarea que realiza cada perfil de persona. 
	 * 
	 * @return Una cadena que describe el trabajo realizado por la persona.
	 */
	public abstract String trabajar();

}
