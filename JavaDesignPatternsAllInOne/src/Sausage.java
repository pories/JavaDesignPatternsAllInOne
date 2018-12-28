
public class Sausage extends Toppings{

	public Sausage(Pizza myVar2) {
		super(myVar2);
		// TODO Auto-generated constructor stub
	}
	public double cost()
	{
		return 3.50 + pizzaMyVar1.cost();
	}

}