package AbstractaInteface;

public class Libro extends producto {
	
	//Atributo
	private String autor;

	/**
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param autor
	 */
	
	//Constructor
	public Libro(String nombre, String descripcion, double precio, String autor) {
		super(nombre, descripcion, precio);
		this.autor = autor;
	}
	
	

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}



	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}



	@Override
	
	public void mostrarInformacion()
	{
		System.out.println("El libro se llama: " +getNombre());
		System.out.println("La descripcion se trata: " +getDescripcion());
		System.out.println("El libro cuesta : " +getPrecio());
		System.out.println("El autor se llama: " +getAutor());
	}
	

}
