
package TP5;

public class Pelicula {
	@Override
	public String toString() {
		return nombre + ", "+genero;
	}
	private int id;
	private String nombre;
	private Genero genero;
	private static int cont = 1;

	public Pelicula() {
		this.id = cont;
	}
	
	public Pelicula(String nombre, Genero genero) {
		super();
		this.id = cont;
		cont++;
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getCont() {
		return cont;
	}
}
