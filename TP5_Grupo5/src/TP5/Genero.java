package TP5;

public class Genero {
	private int id;
	private String genero;
	public Genero () {
		this.id = 0;
		this.genero = "sin genero";
	};
	public Genero(int id, String genero) {
		this.id = id;
		this.genero = genero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return  genero;
	}


	


	
	
	

}