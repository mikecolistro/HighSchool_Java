import javax.swing.*;

public class AnimalShelterTester{
	public static void main(String [] args){
	Shelter myShelter = new Shelter ();
		String myInput = "";

		while (!myInput.equals("4")){
			System.out.println(myShelter);
			myInput = JOptionPane.showInputDialog("Please choose from the following menu:\n" +
			"1 - Add a dog to the shelter\n" +
			"2 - Remove a dog from the shelter\n" +
			"3 - Display the operating cost of the shelter\n" +
			"4 - Exit the program");


			if(myInput.equals("1")){
				String dogBreed = JOptionPane.showInputDialog("What breed is your dog");
				String dogName = JOptionPane.showInputDialog("What is the name of the dog you are entering into the shelter?");
				myShelter.addDog( dogName, dogBreed);

			}
			else if(myInput.equals("2")){
				String dogNum = JOptionPane.showInputDialog("Enter the desired dog's assigned number in which you choose to get back from the shelter");
				int dNum = Integer.parseInt(dogNum);
				myShelter.removeDog(dNum);
			}
			else if(myInput.equals("3")){
				String dogNum = JOptionPane.showInputDialog("How many dogs do u have in the shelter?");
				int dNum = Integer.parseInt(dogNum);
				String days = JOptionPane.showInputDialog("Enter the amount of days you are leaving your dog in the shelter" );
				int dayz = Integer.parseInt(days);
				double cost = (dNum*(dayz * 15));
				System.out.println("The cost is = " + cost);
			}
			else if(myInput.equals("4")){
			System.exit(-1);
			}
			else{
				System.out.println("INVALID NUMER,Please choose from the following menu:\n" +
			"1 - Add a dog to the shelter\n" +
			"2 - Remove a dog from the shelter\n" +
			"3 - Display the operating cost of the shelter" +
			"4 - Exit the program");
			}
		}

	}
}