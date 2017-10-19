import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import static java.util.Arrays.asList;

public class EmployeeSortsTest {
/*	@Test //Test that objects are Aliases (or Equals)
	public void assertThatEmployeeIdsAreNotTheSame() {
		Employee underTest = new Employee("111", "Gene", "Christopher");
		Employee underTest2 = new Employee("222", "Malinda", "Chung");
		Employee underTest3 = new Employee("333", "John", "Felix");
		Employee underTest4 = new Employee("444", "Justin", "Patric");		
	List<Employee> empTest = new ArrayList<>(asList(underTest, underTest2, underTest3, underTest4));
	
	for(Employee i : empTest) {
		boolean check = i.equals(i);
	
		assertEquals(check, true);
	}
	}*/
	@Test //Test that objects are Aliases (or Equals)
	public void shouldBeAbleToSortEmployeeByLastName() {
		Comparator<Employee> lastNameFirstNameComparator = new LastNameFirstNameCompare();
		Employee underTst = new Employee("11", "Gene", "Christopher");
		Employee underTst2 = new Employee("22", "Malinda", "Chung");
		Employee underTst3 = new Employee("33", "John", "Felix");
		Employee underTst4 = new Employee("44", "Justin", "Patric");		
	List<Employee> empTst = new ArrayList<>(asList(underTst, underTst2, underTst3, underTst4));
	Collections.sort(empTst, lastNameFirstNameComparator);
	
		assertEquals(asList(underTst, underTst2, underTst3, underTst4), empTst);
	}
		
	
	
	

//	@Test //Test that objects are Aliases (or Equals)
//	public void assertThatObjEqualsIsOverridden() {
//		Computer underTest = new Computer("make", "model", 0.0);
//		Computer underTest2 = new Computer("make", "model", 0.0);
//		underTest = underTest2;
//		boolean check = (underTest.equals(underTest2));
//		assertEquals(check, true);
//	}
//	@Test //Test that objects are Aliases (or Equals)
//	public void assertThatStringEqualsIsOverridden() {
//		Computer underTest = new Computer("make", "model", 0.0);
//		Computer underTest2 = new Computer("make", "model", 0.0);
//		
//		boolean check = underTest.getMake().equals(underTest2.getMake());
//		assertEquals(check, true);
//	}
//	@Test //Test that objects are Aliases (or Equals)
//	public void assertThatObjectEqualsIsOverridden() {
//		Computer underTest = new Computer("make", "model", 0.0);
//		Computer underTest2 = new Computer("make", "model", 0.0);
//		boolean check = (underTest.equals(underTest2));
//		assertEquals(check, true);
//	}
}
