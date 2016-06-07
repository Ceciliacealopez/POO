package Principal;

public class Televisor extends Electrodomestico{

	protected Integer pulgadas;
	protected Boolean poseeHDMI;
	
	
	public Televisor() //constructor por defecto
	{
		
	}
	
	public void cargarpulgadas( Integer pulgadas )
	{
		this.pulgadas = pulgadas;   //en azul significa que es de la clase, en marrón es solo del metodo 
							//this. es para que lo que le sigue haga referencia al de la clase y no al del metodo
		
	}
	
	public Integer decirpulgadas()
	{
		return pulgadas;
	}
	
	
	public void cargarposeeHDMI( Boolean poseeHDMI )
	{
		this.poseeHDMI = poseeHDMI;   //en azul significa que es de la clase, en marrón es solo del metodo 
							//this. es para que lo que le sigue haga referencia al de la clase y no al del metodo
		
	}
	
	public Boolean decirposeeHDMI()
	{
		return poseeHDMI;
	}
	

}
