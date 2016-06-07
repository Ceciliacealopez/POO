package Principal;

public class AireAcondicionado extends Electrodomestico {

	public Integer frigorias;
	
	public AireAcondicionado() //constructor por defecto
	{
		
	}
	
	public void frigorias( Integer frigorias )
	{
		this.frigorias = frigorias;   //en azul significa que es de la clase, en marrón es solo del metodo 
							//this. es para que lo que le sigue haga referencia al de la clase y no al del metodo
		
	}
	
	public Integer decirfrigorias()
	{
		return frigorias;
	}
	

}
