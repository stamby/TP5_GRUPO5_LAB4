package ventana;

//import java.util.Objects;

//import ventana.Genero;

public class Peliculas extends Genero implements Comparable<Peliculas>{
	private static int id = 0;
	private String nombre;
	//private String genero; // este lo trabajamos con otra clase Genero
	
	public Peliculas() {
		super();
		//id=siguienteid(); // Lo comento por que genera que cada vez que se vuelve al panel Agregar incrementa. 
		setNombre("");
		//System.out.println("Entre a Peliculas vacio");
	}
	
	public Peliculas(int id, String Nombre) {
		super();
		nombre = Nombre;
		//System.out.println("Entre a Peliculas con id y Nombre");
	}
	public Peliculas(String descripcion, String genero, int idGen, String descripGen) {
		super(idGen,descripGen);
		id = siguienteid();
		setNombre(descripcion);
		//System.out.println("Entre a Peliculas con descrp genero id y Nombre");
	}
	public static int siguienteid() {
		id++;
		return id;
	}
		
	public static int get_Id() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

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
