package AbstractaInteface;

public class Electrodomestico extends producto {
	private String marca;

	/**
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param marca
	 */
	public Electrodomestico(String nombre, String descripcion, double precio, String marca) {
		super(nombre, descripcion, precio);
		this.marca = marca;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
@Override
	
	public void mostrarInformacion()
	{
		System.out.println("El electrodomestico se llama: " +getNombre());
		System.out.println("La descripcion se trata: " +getDescripcion());
		System.out.println("El electrodomestico cuesta : " +getPrecio());
		System.out.println("La marca se llama: " +getMarca());
	}

}
