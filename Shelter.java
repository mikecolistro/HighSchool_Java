import javax.swing.*;
import java.util.*;

public class Shelter {

	private ArrayList<Dog> newDog;

	public Shelter(){
		newDog = new ArrayList<Dog>();
		fillDog();
	}
	public int numDogs(){
		return newDog.size();
	}

	public void fillDog(){
		String myInput = JOptionPane.showInputDialog("How many dogs are you adding");
		int dogInput = Integer.parseInt(myInput);

		String name, breed;

		for(int i =0; i < dogInput; i++){
			name = JOptionPane.showInputDialog("Dog " + (i+1) + " Name");
			breed = JOptionPane.showInputDialog("Dog " + (i+1) + " Breed");

			newDog.add(new Dog(name,breed));
		}
	}

	public void addDog(String name, String breed){

		newDog.add(new Dog(name,breed));
	}

	public void removeDog(int num){
		newDog.remove(num);
	}
	public String toString(){
		System.out.println("The amount of dogs in the shelter is: = " + newDog.size());
		String output = "";
		for(int i =0; i < newDog.size(); i++){

			output += i + ": " + newDog.get(i) + "\n";
		}
		return output;
	}
}