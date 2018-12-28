import java.text.NumberFormat;
import java.util.Scanner;

public class Decorator {

	public static void Execute() {
		boolean repeat = true;
		while (repeat) {
			Pizza mypizza = new ThickCrust();
			mypizza = new Pepperoni(mypizza);
			mypizza = new Sausage(mypizza);
			System.out.println(
					"This is the decorator pattern. It allows behaviors to be added to an existing object dynamically during runtime.");
			System.out.println(
					"Here we use a decorator pattern to make a pizza, and add things to it, and then to tell us it's cost.");
			NumberFormat cashOutputFormat = NumberFormat.getCurrencyInstance();
			System.out.println("Pizza costs: " + cashOutputFormat.format(mypizza.cost()));			
			System.out.println("Rerun Decorator Pattern? Y/N: ");
			char go; // Variable to hold user response.
			Scanner Console = new Scanner(System.in);
			go = Console.next().charAt(0);
			if (go == 'y' || go == 'Y') {
				repeat = true;
			} else if (go == 'n' || go == 'N') {
				repeat = false;
				System.out.println("Exiting Decorator Pattern example.");
			} else {
				repeat = false;
				System.out.println("Not a listed option, exiting Decorator Pattern example.");
			}
		}
	}
}