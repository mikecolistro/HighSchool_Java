public class workersTester {
	public static void main (String [] args){
		Boss B1 = new Boss();
		B1.setName("Steve", "Jobs");
		B1.setAge(46);
		B1.setSalary(1000000);
		B1.hireWorkers(2500);

		HourlyWorker n1 = new HourlyWorker();
		n1.setName("Alice", "Smith");
		n1.setAge(23);
		n1.setMale(false);

		HourlyWorker n2 = new HourlyWorker();
		n2.setName("Henry","Jones");
		n2.setAge(37);

		System.out.println(B1);
		System.out.println(n1);
		System.out.println(n2);

		System.out.println("-----------------------");
		System.out.println("Printing out an array of 3 person objects using a loop");

		Person ppl[] = new Person[3];
		ppl[0] = B1;
		ppl[1] = n1;
		ppl[2] = n2;

		for(int i = 0; i < ppl.length; i++){
			System.out.println(ppl[i]);
		}
	}
}