public class Mammal{
	private int itsAge;
	private int itsWeight;
	private String breed;

	public Mammal(){
		itsAge = 2;
		itsWeight = 5;
	}

	public int getAge(){
		return itsAge;
	}

	public int getWeight(){
		return itsWeight;
	}

	public void setAge(int newAge){
		itsAge = newAge;
	}

	public void setWeight(int newWeight){
		itsWeight = newWeight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String newBreed){
		breed = newBreed;
	}

	public void speak() {
		// will be overwritten by Dog class and Cat class
	}
}
