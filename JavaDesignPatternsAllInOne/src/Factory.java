import java.util.Scanner;

public class Factory {
	public static void Execute() {
		boolean repeat = true;
		while (repeat) {
			boolean myvar3torf;
			boolean myvar4torf;
			System.out.println(
					"This is the Factory pattern. It is used for creating objects without having to specify the exact class of the object that will be created.");
			System.out.println(
					"Here we have created two objects and didn't specify the exact class of the object when it was created.");
			System.out.println("Enter T to create object 1, and F to create object 2.");
			System.out.println("Please enter a T/F value for first object: ");
			// string myvar1torf = Console.ReadLine().ToLower();
			Scanner factoryInputObject1 = new Scanner(System.in);
			String inputOne = factoryInputObject1.nextLine();
			switch (inputOne) {
			case "t":
				myvar3torf = true;
				break;
			case "T":
				myvar3torf = true;
				break;
			default:
				myvar3torf = false;
				break;
			}
			System.out.println("Please enter a T/F value for second object: ");
			Scanner factoryInputObject2 = new Scanner(System.in);
			String inputTwo = factoryInputObject2.nextLine();
			switch (inputTwo) {
			case "t":
				myvar4torf = true;
				break;
			case "T":
				myvar4torf = true;
				break;
			default:
				myvar4torf = false;
				break;
			}
			IAbstractionInterface1 myvar1 = ObjectFactory.Create(myvar3torf);
			IAbstractionInterface1 myvar2 = ObjectFactory.Create(myvar4torf);
			myvar1.SomethingInteresting();
			myvar2.SomethingInteresting();
			System.out.println("Rerun Factory Pattern? Y/N: ");
			char go;
			Scanner Console = new Scanner(System.in);
			go = Console.next().charAt(0);
			if (go == 'y' || go == 'Y') {
				repeat = true;
			} else if (go == 'n' || go == 'N') {
				repeat = false;
				System.out.println("Exiting Factory Pattern example.");
			} else {
				repeat = false;
				System.out.println("Not a listed option, exiting Factory Pattern example.");
			}
		}
	}
}
