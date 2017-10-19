

public class Employee implements Comparable<Employee>{
	private String id;
	private String fName;
	private String lName;
	public Employee(String id, String fName, String lName) {
		
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}
	
	public String getId() {
		return id;
	}
	public String getFName() {
		return fName;
	}
	public String getLName() {
		return lName;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return id.equals(other.id);
	}
	
	@Override
	public int compareTo(Employee other) {
		
		return id.compareTo(other.id);
		
		
		
	}

	@Override
	public String toString() {
		return id + fName;
	}

	/*@Override
	public boolean equals(Object obj) {
		
		
		Employee theOther = (Employee) obj;
		
		return  this.id == theOther.id; // &&
				//this.model == theOther.model &&
				//this.price == theOther.price;
	}
	*/
	
	
	
}
