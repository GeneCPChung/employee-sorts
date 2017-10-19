import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorts {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee ("111", "bob", "smith"));
		employees.add(new Employee ("222", "fred", "jones"));
		employees.add(new Employee ("333", "alan", "kostrick"));
		employees.add(new Employee ("444", "zach", "williams"));
		
	
		LastNameFirstNameCompare name = new LastNameFirstNameCompare();
		Collections.sort(employees, name);
		System.out.println(employees);
	}

}
