
public class Pepperoni extends Toppings {

	public Pepperoni(Pizza myVar2) {
		super(myVar2);
		// TODO Auto-generated constructor stub
	}

	public double cost()
	{
		return 3.50 + pizzaMyVar1.cost();
	}
}