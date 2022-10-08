package ventana;

//import ventana.Genero;

public class Peliculas extends Genero implements Comparable<Peliculas>{
	private static int id = 0;
	private String nombre;
	//private String genero; // este lo trabajamos con otra clase Genero
	
	public Peliculas() {
		super();
		//id=siguienteid();// Lo comento por generar que al reiniciar la funcion siguiente id se ejecuta dos veces.
		setNombre("");
		System.out.println("Pase por el constructor Peliculas vacio");
	}
	
	public Peliculas(int id, String Nombre) {
		super();
		nombre = Nombre;
		//this.genero = genero;
	}
	public static int siguienteid() {
		id ++;
		return id;
	}
	
	/*public static int getId() {
		return id;
	}*/

	/*public static void setId(int id) {
		Peliculas.id = id;
	}*/

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*public String getGenero() {
		return genero;
	}
	public void setGenera(int id, String genero) {
		this.setGenero(id, genero);
	}*/

	@Override
	public String toString() {
		return getNombre() + " / " + this.getGenero();
	}

	@Override
	public int compareTo(Peliculas o) {
		// TODO Auto-generated method stub
		int compare = o.nombre.compareTo(this.nombre);
		if(compare>0)
			return -1;
		if(compare<0)
			return 1;
		return 0;
	}
	
	
	
}
