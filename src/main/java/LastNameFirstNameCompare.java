import java.util.Comparator;

public class LastNameFirstNameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int lastNameCompare = o1.getLName().compareTo(o2.getLName());
		if (lastNameCompare == 0) {
			return o1.getFName().compareTo(o2.getFName());
		}
		return lastNameCompare;
		
		
		
	}

}
