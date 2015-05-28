import javax.swing.*;
public class DogTester {
	public static void main (String[] args){
	String pup1, pup2,kind1,kind2,anger,anger2;
	int ang1, ang2;
	
	pup1 = JOptionPane.showInputDialog("Dog 1s name is");
	pup2 = JOptionPane.showInputDialog("Dog 2s name is");	
	kind1 = JOptionPane.showInputDialog("Dog 1s breed is");
	kind2 = JOptionPane.showInputDialog("Dog 2s breed is");	
		dog dog1 = new dog (pup1, kind1);
		dog dog2 = new dog (pup2, kind2);
		
		//Print out the details of each dog
		System.out.println(dog1);
		System.out.println("---------------------------------");
		System.out.println(dog2);
		System.out.println("----------------------------------");
		//user can change the dogs aggression of dog 1
		anger = JOptionPane.showInputDialog("Dog 1s aggresion is: " + dog1.getAggression() + " If you are happy with aggression enter 200 if your not enter the aggression you desire on a scale from 1 to 10");
		ang1 = Integer.parseInt(anger);
		anger2 = JOptionPane.showInputDialog("Dog 2s aggresion is: " + dog2.getAggression() + " If you are happy with aggression enter 200 if your not enter the aggression you desire on a scale from 1 to 10"); 
		ang2 = Integer.parseInt(anger2);
		if(ang1 == 200){
			System.out.println("your dogs aggression is still the same");
		}
		else{
			dog1.setAggression(ang1);
		}
		if(ang2 == 200){
			System.out.println("your dogs aggression is still the same");
		}
		else{
			dog2.setAggression(ang2);
		}
		//get values for dog1 and dog2
		System.out.println(dog1.getName() + "'s Aggression: " + dog1.getAggression());
		System.out.println(dog1.getName() + "'s Hunger: " + dog1.getHunger());
		System.out.println(dog2.getName() + "'s Aggression: " + dog2.getAggression());
		System.out.println(dog2.getName() + "'s Hunger: " + dog2.getAggression());
	//factors controlling the behaviour
		if(dog1.getAggression() >5){
			System.out.print(dog1.getName() + ":");
			dog1.barkAngry();
		}
		else{
			System.out.print(dog1.getName() + " ");
			dog1.barkFriendly();
		}
	
		if(dog2.getAggression() >5){
			System.out.print(dog2.getName() + ":");
			dog2.barkAngry();
		}
		else{
			System.out.print(dog2.getName() + " ");
			dog2.barkFriendly();
		}
	
	
	}
}