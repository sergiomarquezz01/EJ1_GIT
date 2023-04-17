package AbstractaInteface;

abstract class producto {
	
	//Atributos
	private String nombre;
	private String descripcion;
	private double precio;
	/**
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 */
	//Constructor
	public producto(String nombre, String descripcion, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	//GETTERS AND SETTERS de todos los atributos que hemos generado anteriormente
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//Imprime la informacion
	public abstract void mostrarInformacion();

}
