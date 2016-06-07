package Principal;

public class Fabricante {

	protected String nombre;
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getTelefono() {
		return telefono;
	}

	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected String telefono;
	protected String direccion;
	
	
	public String toString()
	{
		return nombre + " - Tel: "+ telefono;
	}
	
	

}
