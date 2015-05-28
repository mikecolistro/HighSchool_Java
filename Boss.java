public class Boss extends Person {
	private int salary;
	private int numEmployees;

	public Boss() {
		super();
		salary = 0;
		numEmployees = 0;
	}

	public void hireWorkers(int n){
		numEmployees += n;
	}

	public void fireWorkers(int n){
		numEmployees -= n;
	}

	public void setSalary(int s){
		salary = s;
	}

	public String toString(){
		String output = "";
		output += super.toString();
		output += "Salary: " + salary + "\n";
		output += "Employees: " + numEmployees + "\n";
		return output;
	}

}
