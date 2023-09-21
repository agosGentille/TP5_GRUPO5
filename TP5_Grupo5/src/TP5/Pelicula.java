package TP5;

public class Pelicula {
	private final int id;
	private String nombre;
	private static int contador = 0;
	private Categoria categoria;
	
	
	public Pelicula(){
		this.id = contador++;
		this.nombre = "sin nombre";
		this.categoria = new Categoria();
	};
	
	public Pelicula(String nombre, Categoria categoria) {
		this.id = contador;
		contador++;
		this.nombre = nombre;
		this.categoria = categoria;
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Pelicula: " + id + "- " + nombre + "- "+categoria.toString();
	}
}
