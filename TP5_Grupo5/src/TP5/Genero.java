package TP5;

public class Genero extends Pelicula {
	private String genero;

	public Genero () {
		
	};
	
	public Genero(int id, String nombre, String genero) {
		super(id, nombre, genero);
	}


	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Genero [genero=" + genero + "]";
	}


	
	
	

}
