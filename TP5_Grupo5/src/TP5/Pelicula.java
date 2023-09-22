package TP5;

public class Pelicula implements Comparable<Pelicula>{
	private final int id;
	private String nombre;
	private static int contador = 1;
	private Categoria categoria;
	
	
	public Pelicula(){
		this.id = contador;
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
	public int getContador() {
		return contador;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Pelicula other = (Pelicula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre + " - "+categoria.toString() + " - ID: " + id;
	}

	@Override
	public int compareTo(Pelicula o) {
		if(o.nombre.hashCode() == this.nombre.hashCode()) 
			return 0;
			if(o.nombre.hashCode() < this.nombre.hashCode()) 
			{
				return 1;
			}
			return -1;
		
	}
}
