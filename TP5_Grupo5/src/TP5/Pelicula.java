package TP5;

public class Pelicula {
	private final int id;
	private String nombre;
	private static int contador = 0;
	private Genero genero;
	
	
	public Pelicula(){
		this.id = contador++;
		this.nombre = "sin nombre";
		this.genero = new Genero();
	};
	
	public Pelicula(String nombre, Genero genero) {
		this.id = contador;
		contador++;
		this.nombre = nombre;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pelicula: " + id + "- " + nombre + "- "+genero.toString();
	}
	
	

}
