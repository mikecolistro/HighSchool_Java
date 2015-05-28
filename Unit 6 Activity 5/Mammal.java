public abstract class Mammal {
	private int age;

	public Mammal() {
		age = 1;
	}
	public void move(){
		System.out.println("Mammal move one step");
	}
	public abstract void speak();
	public abstract void eat();

}