package Principal;

public class Electrodomestico {

	protected String modelo;
	protected Double precio;
	protected Integer stock;
	protected Fabricante fabricante;
	
	
	public Electrodomestico() //constructor por defecto
	{
		
	}
	
	
	protected String getModelo() {
		return modelo;
	}


	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}


	protected Double getPrecio() {
		return precio;
	}


	protected void setPrecio(Double precio) {
		this.precio = precio;
	}


	protected Integer getStock() {
		return stock;
	}


	protected void setStock(Integer stock) {
		this.stock = stock;
	}


	protected Fabricante getFabricante() {
		return fabricante;
	}


	protected void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	
	
	
	
	
	
	
	

}
