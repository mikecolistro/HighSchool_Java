import javax.swing.*;
public class FightClub{
	public static void main(String [] args){
		String charChoice;
		charChoice = JOptionPane.showInputDialog("Which character would you like to be" + "\n" +
			" 1 - Michael Colistro" + "\n 2 - Stefano Fata" + "\n 3 - Lucas Miggliaza" + "\n 4 - Travis Harju" + "\n 5 - Mike Hjorth");

		if(charChoice.equals("1")){
			System.out.println(" Your Character  is Michael Colistro ");
		}
		if(charChoice.equals("2")){
			System.out.println(" Your Character is Stefano Fata ");
		}
		if(charChoice.equals("3")){
			System.out.println(" Your Character  is Lucas Miggliaza ");
		}
		if(charChoice.equals("4")){
			System.out.println(" Your Character  is Travis Harju ");
		}
		if(charChoice.equals("5")){
			System.out.println(" Your Character  is Mike Hjorth ");
		}

	}
}