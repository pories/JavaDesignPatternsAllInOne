
public class HRSystem {

	public String[][] GetEmployees() {
		// This is an array of arrays. The first array number is the number of arrays,
		// the second array declaration says that it can store multiple sized arrays. In
		// this case each one is equal and has 3 elements.
		String[][] employees = new String[4][];
		employees[0] = new String[] { "100", "Mike", "Team Leader" };
		employees[1] = new String[] { "101", "John", "Developer" };
		employees[2] = new String[] { "102", "Pat", "Developer" };
		employees[3] = new String[] { "103", "Mary", "Tester" };
		return employees;
	}
}
