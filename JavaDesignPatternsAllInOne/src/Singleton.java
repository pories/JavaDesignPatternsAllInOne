import java.util.Scanner;

public class Singleton {
	public static void Execute() {
		boolean repeat = true;
		while (repeat) {
			Single myVar2 = Single.GetInstance();

			System.out
					.println("This is the Singleton pattern. It restricts the instantiation of a class to one object.");
			System.out.println("Please input a message for the only object to write back to you: ");
			Scanner signletonInput = new Scanner(System.in);
			String msg = signletonInput.nextLine();
			myVar2.DoSomething(msg);

			System.out.println("Rerun Singleton Pattern? Y/N: ");
			char go; // Variable to hold user response.
			Scanner Console = new Scanner(System.in);
			go = Console.next().charAt(0);
			if (go == 'y' || go == 'Y') {
				repeat = true;
				// break; //break will exit your code, you don't want to do this, you want to
				// allow repeat to be assigned, that will break out of code.
			} else if (go == 'n' || go == 'N') {
				repeat = false;
				// System.out.println("Singleton Pattern program ended.");
				System.out.println("Exiting Singleton Pattern example.");
				// break; //break will exit your code, you don't want to do this, you want to
				// allow repeat to be assigned, that will break out of code.
			} else {
				repeat = false;
				System.out.println("Not a listed option, exiting Singleton Pattern example.");
			}

		}
	}
}
