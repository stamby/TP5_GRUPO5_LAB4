package ventana;

public class Peliculas {
	private static int id = 1;
	private String nombre;
	private String genero;
	
	public Peliculas() {
	}
	
	public Peliculas(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
	}
	
	
	
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Peliculas.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return nombre + " / " + genero;
	}
	
	
	
}
