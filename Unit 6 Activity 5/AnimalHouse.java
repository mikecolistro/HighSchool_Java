import javax.swing.*;

public class AnimalHouse {
	public static void main(String [] args){
		Mammal theArray[] = new Mammal[5];

		String choice;

		for(int i = 0 ; i < 5; i++){
			choice = JOptionPane.showInputDialog("Mammal #" + (i + 1) + "\n" +
				"1 - Dog\n" +
				"2 - Cat\n" +
				"3 - Horse\n" +
				"4 - Pig");
			if(choice.equals("1")){
				theArray[i] = new Dog();
			}
			if(choice.equals("2")){
				theArray[i] = new Cat();
			}
			if(choice.equals("3")){
				theArray[i] = new Horse();
			}
			if(choice.equals("4")){
				theArray[i] = new Pig();
			}
		}
		for(int i = 0; i < 5; i++){
			theArray[i].eat();
		}
	}
}