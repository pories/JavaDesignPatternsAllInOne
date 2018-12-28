import java.util.LinkedList;
import java.util.List;

public class EmployeeAdapter extends HRSystem implements ITarget {

	@Override
	public List<String> GetEmployeeList() {
		List<String> employeeList = new LinkedList<String>();
		String[][] employees = GetEmployees();
		for (String[] item : employees) {
			employeeList.add(item[0]);
			employeeList.add(",");
			employeeList.add(item[1]);
			employeeList.add(",");
			employeeList.add(item[2]);
			employeeList.add("\n");
		}
		return employeeList;
	}

}
