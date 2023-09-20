package TP5;

public class Pelicula {
	private final int id;
	private String nombre;
	private static int contador = 0;
	
	public Pelicula(){
		this.id = contador++;
		this.nombre = "sin nombre";
	};
	
	public Pelicula(int id, String nombre, String genero) {
		super();
		this.id = contador++;
		this.nombre = nombre;
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


	@Override
	public String toString() {
		return "Pelicula: " + id + "- " + nombre;
	}
	
	

}
