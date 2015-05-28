import javax.swing.*;
public class FightClub{
	public static void main(String [] args){
		String charChoice, charMove, charName;
		int rAttack, rDefence, rSpecial, enemyNum, oppNum,oppMove ;
		// User enters the name of his character
		charName = JOptionPane.showInputDialog("What is the name of your character?");
		// Makes the different arrays for the characters
		chosenChar char1 = new chosenChar();
		Colistro Colistro1 = new Colistro();
		Fata Fata1 = new Fata();
		Miggz Miggz1 = new Miggz();
		Harju Harju1 = new Harju();
		Hjorth Hjorth1 = new Hjorth();
		// enters the name of the users character
		char1.setName(charName);
		//sets the characters health
		char1.setHealth(30);
		Colistro1.setHealth(30);
		Fata1.setHealth(30);
		Miggz1.setHealth(30);
		Harju1.setHealth(30);
		Hjorth1.setHealth(30);
		oppNum = 5;


		// this for statment sets up the oppenent to be faced
		for(int i = 0; i < oppNum; oppNum--){

			if(oppNum == 1){
				char1.setHealth(30);
				System.out.println("Your Last Opponent is Hjorth!");
				ImageFrame5 imgFrm = new ImageFrame5();
				imgFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//set dimensions of the window
				imgFrm.setSize(450,450);
				imgFrm.setVisible(true);
				System.out.println(char1.getName() + " vs Hjorth \n FIGHT!");

				while(Hjorth1.getHealth() > 0){
				//gets the opponents attack
				oppMove = (int)(Math.random()* 10);
				// asks you want you want to do
				charMove = JOptionPane.showInputDialog("Choose what move you want to do \n 1 - Attack \n 2 - Defend \n 3-Special Move");
				//attack
				if (charMove.equals("1")){
					rAttack = (int)(Math.random()* 10);
					char1.setAttack(rAttack);
					Hjorth1.setHealth((Hjorth1.getHealth()-char1.getcharAttack()));
					Hjorth1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Hjorth1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Hjorth1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");
				}
				//defence
				else if (charMove.equals("2")){

					rDefence = (int)(Math.random()* 10);
					char1.setDefence(rDefence);
					Hjorth1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-(Hjorth1.getAttack()/2)));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Hjorth1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				//special move
				else if(charMove.equals("3")){

					rSpecial  = (int)((Math.random()* 10)*2);
					char1.setSpecial(rSpecial);
					Hjorth1.setHealth((Hjorth1.getHealth()-(char1.getcharAttack()*2)));
					Hjorth1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Hjorth1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Hjorth1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");



				}
				else{
					System.out.println("Invalid Entry Choose To Attack Defend or Special Move");
				}
				if(char1.getHealth() <= 0){
					System.out.println("You LOST!!!!");
					System.exit(0);
				}

				}
			}

			else if(oppNum == 2){
				char1.setHealth(30);
				System.out.println("Your Next Opponent is Harju!");
				ImageFrame4 imgFrm = new ImageFrame4();
				imgFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//set dimensions of the window
				imgFrm.setSize(450,450);
				imgFrm.setVisible(true);
				System.out.println(char1.getName() + " vs Harju \n FIGHT!");
				while (Harju1.getHealth() > 0){
				oppMove = (int)(Math.random()* 10);
				charMove = JOptionPane.showInputDialog("Choose what move you want to do \n 1 - Attack \n 2 - Defend \n 3-Special Move");

				if (charMove.equals("1")){
					rAttack = (int)(Math.random()* 10);
					char1.setAttack(rAttack);
					Harju1.setHealth((Harju1.getHealth()-char1.getcharAttack()));
					Harju1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Harju1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Harju1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else if (charMove.equals("2")){

					rDefence = (int)(Math.random()* 10);
					char1.setDefence(rDefence);

					Harju1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-(Harju1.getAttack()/2)));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Harju1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else if(charMove.equals("3")){

					rSpecial  = (int)((Math.random()* 10)*2);
					char1.setSpecial(rSpecial);

					Harju1.setHealth((Harju1.getHealth()-(char1.getcharAttack()*2)));
					Harju1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Harju1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Harju1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");


				}
				else{
					System.out.println("Invalid Entry Choose To Attack Defend or Special Move");
				}
				if(char1.getHealth() <= 0){
					System.out.println("You LOST!!!!");
					System.exit(0);
				}

				}
			}
			else if(oppNum == 3 ){
				char1.setHealth(30);
				System.out.println("Your Next Opponent is Miggz!");
				ImageFrame3 imgFrm = new ImageFrame3();
				imgFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//set dimensions of the window
				imgFrm.setSize(450,450);
				imgFrm.setVisible(true);
				System.out.println(char1.getName() + " vs Miggz \n FIGHT!");
				oppMove = (int)(Math.random()* 10);
				while(Miggz1.getHealth() > 0){
				charMove = JOptionPane.showInputDialog("Choose what move you want to do \n 1 - Attack \n 2 - Defend \n 3-Special Move");

				if (charMove.equals("1")){
					rAttack = (int)(Math.random()* 10);
					char1.setAttack(rAttack);
					Miggz1.setHealth((Miggz1.getHealth()-char1.getcharAttack()));
					Miggz1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Miggz1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Miggz1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else if (charMove.equals("2")){

					rDefence = (int)(Math.random()* 10);
					char1.setDefence(rDefence);
					Miggz1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-(Miggz1.getAttack()/2)));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Miggz1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else if(charMove.equals("3")){

					rSpecial  = (int)((Math.random()* 10)*2);
					char1.setSpecial(rSpecial);
					Miggz1.setHealth((Miggz1.getHealth()-(char1.getcharAttack()*2)));
					Miggz1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Miggz1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Miggz1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

					}
				else{
					System.out.println("Invalid Entry Choose To Attack Defend or Special Move");
				}
				if(char1.getHealth() <= 0){
					System.out.println("You LOST!!!!");
					System.exit(0);
				}

				}
			}
			else if(oppNum == 4){
				char1.setHealth(30);
				System.out.println("Your Next Opponent is Fata!");
				ImageFrame2 imgFrm = new ImageFrame2();
				imgFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//set dimensions of the window
				imgFrm.setSize(450,450);
				imgFrm.setVisible(true);
				System.out.println(char1.getName() + " vs Fata \n FIGHT!");
				oppMove = (int)(Math.random()* 10);
				while (Fata1.getHealth() > 0){
				charMove = JOptionPane.showInputDialog("Choose what move you want to do \n 1 - Attack \n 2 - Defend \n 3-Special Move");

				if (charMove.equals("1")){
					rAttack = (int)(Math.random()* 10);
					char1.setAttack(rAttack);
					Fata1.setHealth((Fata1.getHealth()-char1.getcharAttack()));
					Fata1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Fata1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Fata1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else if (charMove.equals("2")){

					rDefence = (int)(Math.random()* 10);
					char1.setDefence(rDefence);
					Fata1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-(Fata1.getAttack()/2)));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Fata1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else if(charMove.equals("3")){

					rSpecial  = (int)((Math.random()* 10)*2);
					char1.setSpecial(rSpecial);
					Fata1.setHealth((Fata1.getHealth()-(char1.getcharAttack()*2)));
					Fata1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Fata1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Fata1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else{
					System.out.println("Invalid Entry Choose To Attack Defend or Special Move");
				}
				if(char1.getHealth() <= 0){
					System.out.println("You LOST!!!!");
					System.exit(0);
				}

				}
			}
			else if(oppNum == 5 ){

				System.out.println("Your Opponent is Colistro!");
				ImageFrame imgFrm = new ImageFrame();
				imgFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//set dimensions of the window
				imgFrm.setSize(450,450);
				imgFrm.setVisible(true);
				System.out.println(char1.getName() + " vs Colistro \n FIGHT!");
				oppMove = (int)(Math.random()* 10);
				while (Colistro1.getHealth() > 0){
				charMove = JOptionPane.showInputDialog("Choose what move you want to do \n 1 - Attack \n 2 - Defend \n 3-Special Move");

				if (charMove.equals("1")){
					rAttack = (int)(Math.random()* 10);
					char1.setAttack(rAttack);
					Colistro1.setHealth((Colistro1.getHealth()-char1.getcharAttack()));
					Colistro1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Colistro1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Colistro1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else if (charMove.equals("2")){

					rDefence = (int)(Math.random()* 10);
					char1.setDefence(rDefence);
					Colistro1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-(Colistro1.getAttack()/2)));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Colistro1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else if(charMove.equals("3")){

					rSpecial  = (int)((Math.random()* 10)*2);
					char1.setSpecial(rSpecial);
					Colistro1.setHealth((Colistro1.getHealth()-(char1.getcharAttack()*2)));
					Colistro1.setAttack(oppMove);
					char1.setHealth((char1.getHealth()-Colistro1.getAttack()));
					System.out.println("\nYour character has " + char1.getHealth() + " health points left");
					System.out.println("\nYour opponent has " + Colistro1.getHealth() + " health points left");
					System.out.println("--------------------------------------------------------------------");

				}
				else{
					System.out.println("Invalid Entry Choose To Attack Defend or Special Move");
				}
				if(char1.getHealth() <= 0){
					System.out.println("You LOST!!!!");
					System.exit(0);
				}

				}
			}
			//determines if u win
			else if (oppNum == 0){
				System.out.println("You Won the St. Ignatius Fight Club Championship");
			}
		}

	}
	}
