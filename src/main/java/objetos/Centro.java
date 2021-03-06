package objetos;


import java.util.List;

public class Centro {
	
	public static final String CODIGO = "codigo";
	public static final String NOMBRE = "nombre";
	public static final String DIRECTOR = "director";
	public static final String DIRECCION = "direccion";
	public static final String LOCALIDAD = "localidad";
	public static final String PROVINCIA = "provincia";
	
	private float codigo;
	private String nombre;
	private float director;
	private String direccion;
	private String localidad;
	private String provincia;
	private List<Profesor> listaProfesores;
	
	
	public Centro() {
	}

	
	public Centro(float codigo, String nombre, float director, String direccion, String localidad, String provincia) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.director = director;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		
	}
/*	
	public Centro(float codigo, String nombre, float director, String direccion, String localidad, String provincia, List<Profesor> profesores) {
		this (codigo, nombre, director, direccion, localidad, provincia);
		this.profesores = profesores;
	}

*/
	

	public float getCodigo() {
		return codigo;
	}


	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getDirector() {
		return director;
	}


	public void setDirector(float director) {
		this.director = director;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public List<Profesor> listaProfesores() {
		return listaProfesores;
	}

	public void listaProfesores(List<Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}


	@Override
	public String toString() {
		return "\nCENTRO: " + 
			"Codigo: " + codigo  +"\n" +
			"\tNombre: " + nombre  +"\n" +
			"\tDirector: " + director  +"\n" + 
			"\tDireccion: " + direccion  +"\n" +
			"\tLocalidad: " + localidad  +"\n" +
			"\tProvincia: " + provincia  +"\n" +
			"\tLista profesores: " + listaProfesores  +"\n";
	}
		
	
	

}
