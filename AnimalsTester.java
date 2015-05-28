public class AnimalsTester{
	public static void main(String [] args){

		Bird rex = new Bird();
		rex.unnoticedWindow(4000);
		rex.setBreed("robin");
		System.out.println("Bird object rex:");
		System.out.println("age: " + rex.getAge());
		System.out.println("weight: " + rex.getWeight());
		System.out.print("breed: " + rex.getBreed());
		rex.speak();
		System.out.println(rex);

		System.out.println("----------------------------------");

		Horse kim = new Horse();

		kim.setAge(16);
		kim.setWeight(150);
		kim.succesfulHurdle(20);
		kim.setBreed("brown steed");
		System.out.println("Horse object Kim:");
		System.out.println("age: " + kim.getAge());
		System.out.println("weight: " + kim.getWeight());
		System.out.print("breed: " + kim.getBreed());
		kim.speak();
		System.out.println(kim);





	}
}