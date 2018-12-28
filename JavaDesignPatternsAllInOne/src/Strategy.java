import java.util.Scanner;

public class Strategy {
	public static void Execute() {
		ISpreadSheet spreadsheet = null;
		Owner Mike = new Owner();
		boolean repeat = true;
		while (repeat) {

			System.out.println("This is the strategy pattern. It allows algorithms to be selected at runtime.");
			System.out.println("Enter in a document to work on: 1)Balance Sheet 2) Tax form 3)HR Form.");
			Scanner strategyInput = new Scanner(System.in);
			String input = strategyInput.nextLine();
			switch (input) {
			case "1":
				spreadsheet = new BalanceSheetForm();
				break;
			case "2":
				spreadsheet = new TaxForm();
				break;
			case "3":
				spreadsheet = new HRForm();
				break;
			default:
				spreadsheet = new Null();
				break;
			}
			Mike.SetSpreadSheet(spreadsheet);
			Mike.WorkOn();
			System.out.println("Rerun Strategy Pattern? Y/N: ");
			char go; // Variable to hold user response.
			Scanner strategyExitInput = new Scanner(System.in);
			go = strategyExitInput.next().charAt(0);
			if (go == 'y' || go == 'Y') {
				repeat = true;
				// break; //break will exit your code, you don't want to do this, you want to
				// allow repeat to be assigned, that will break out of code.
			} else if (go == 'n' || go == 'N') {
				repeat = false;
				System.out.println("Exiting Strategy Pattern Example.");
				// break; //break will exit your code, you don't want to do this, you want to
				// allow repeat to be assigned, that will break out of code.
			} else {
				repeat = false;
				System.out.println("Not a listed option, exiting Strategy Pattern Example..");
			}

		}
	}

}
