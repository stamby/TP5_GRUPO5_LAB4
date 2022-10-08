package ventana;

import java.util.Objects;

public class Genero {
	private int Id;
	private String Descripcion;

	public Genero() {
		Id = 1;
		Descripcion = "";
	}

	public Genero(int id, String gener) {
		super();
		Id = id;
		Descripcion = gener;
	}
	
	public String getGenero() {
		return Descripcion;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public void setGenero(int id, String descripcion) {
		this.Id = id;
		this.Descripcion= descripcion;
	}

	@Override
	public String toString() {
		return Id + "- " + Descripcion;
	}
	@Override
	public int hashCode() {
		int result = 0;
		//result += ((Id == null) ? 0 : Id.hashCode());
		result += ((Descripcion == null) ? 0 : Descripcion.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return Objects.equals(Descripcion, other.Descripcion) && Objects.equals(Id, other.Id);
	}

}
