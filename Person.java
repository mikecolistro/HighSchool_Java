public class Person {
	private String fName, lName;
	private int age;
	private boolean male;

	public Person() {
		fName = "John";
		lName = "Doe";
		age = 21;
		male = true;
	}

	public String getName() {
		return fName + " " + lName;
	}

	public void setName(String newFName, String newLName){
		fName = newFName;
		lName = newLName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public boolean getMale() {
		return male;
	}

	public void setMale(boolean isMale){
		male = isMale;
	}

	public String toString(){
		String output = "";
		output += "Name: " + fName + " " + lName + "\n";
		if(male){
			output += "Sex: Male\n";
		}
		else {
			output += "Sex: Female\n:";
		}
		output += "Age: " + age + "\n";
		return output;
	}


}