import java.util.Scanner;


public class MainMenu {
	public static boolean userMainMenu()
	{
		boolean repeat = true;
		System.out.println("Design Patterns");
		System.out.println("Here is a list of design patterns.");
		System.out.println("Choose: 1) Strategy/Null Object Pattern, 2)Singleton Pattern 3)Adapter Pattern 4)Factory Method Pattern 5)Decorator Pattern");
		Scanner mainMenuExeInput = new Scanner(System.in);
		String input = mainMenuExeInput.nextLine();
		switch(input)
		{
		case "1":
			//https://www.youtube.com/watch?v=94t2ayF1l3o
			Strategy.Execute();
			for (int i = 0; i < 1000; ++i) System.out.println();
			break;
		case "2":
			//https://www.youtube.com/watch?v=xgkbirZrwAs&index=4&list=PL8C53D99ABAD3F4C8
			Singleton.Execute();
			break;
		case "3":
			//https://www.dotnettricks.com/learn/designpatterns/adapter-design-pattern-dotnet
			Adapter.Execute();
			break;
		case "4":
			//https://www.youtube.com/watch?v=qzxp9p7UP_Y
			Factory.Execute();
			
			break;
		case "5":
			//https://www.youtube.com/watch?v=nk9Z1vwO3RI
			Decorator.Execute();
			break;
		default:
			System.out.println("Didn't Choose Anything.");
			break;
		}
		System.out.println("Design Patterns main menu. Restart main design patterns main program? Y/N: ");	
		char go;
		Scanner mainMenuExitInput = new Scanner(System.in);
		go = mainMenuExitInput.next().charAt(0);
		if(go == 'y' || go == 'Y')
		{
			//Test 1 of clearing console.
			for (int i = 0; i < 100; ++i) System.out.println();
			//End of Test 1 of clearing console. Java doesn't have a clear console. 
			repeat = true;
			return repeat;
		}
		else if(go == 'n' || go == 'N')
		{
			for (int i = 0; i < 100; ++i) System.out.println();
			repeat = false;
			return repeat;
		}
		else
		{
			for (int i = 0; i < 100; ++i) System.out.println();
			repeat = false;
			return repeat;		
		}
	}
}
