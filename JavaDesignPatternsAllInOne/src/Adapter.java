import java.util.Scanner;

public class Adapter {
	public static void Execute() {
		boolean repeat = true;
		while (repeat) {

			ITarget Itarget = new EmployeeAdapter();
			ThirdPartyBillingSystem client = new ThirdPartyBillingSystem(Itarget);
			client.ShowEmployeeList();
			System.out.println("Rerun Adapter Pattern? Y/N: ");
			char go; // Variable to hold user response.
			Scanner Console = new Scanner(System.in);
			go = Console.next().charAt(0);
			if (go == 'y' || go == 'Y') {
				repeat = true;
				// break; //break will exit your code, you don't want to do this, you want to
				// allow repeat to be assigned, that will break out of code.
			} else if (go == 'n' || go == 'N') {
				repeat = false;
				// System.out.println("Adapter Pattern program ended.");
				System.out.println("Exiting Adapter Pattern example.");
				// break; //break will exit your code, you don't want to do this, you want to
				// allow repeat to be assigned, that will break out of code.
			} else {
				repeat = false;
				System.out.println("Not a listed option, exiting Adapter Pattern example.");
			}
			

		}
	}

}