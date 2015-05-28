import javax.swing.*;
public class encryption{
	public static void main(String [] args){
	String myInput, myNumer;
	myInput = JOptionPane.showInputDialog("Type in your word that you want to decrypt/encrypt: ");
	int x,y;
	int charNum;
	String encString = "";
	myNumer = JOptionPane.showInputDialog("Type in the number you want to encrypt by or type in the negative of the encryptede number to decrypt");
		x = Integer.parseInt(myNumer);
	for (int i = 0; i < myInput.length(); i++) {
		System.out.println((int)myInput.charAt(i));
		charNum = (int)myInput.charAt(i);
		
		
		charNum = charNum + x;
		
	if (charNum > 122)
		charNum = (charNum - 26);
	
			
		
		System.out.println("New Character = " + (char)charNum);
		encString += (char)charNum;
	}
	
	System.out.println("Your encrypted word is =" + encString);
	}
	
	//int secword;
	//secword = Integer.parseInt(myInput);
	//for(int i = 0; i <= secword.length(); i + 5 ; i++){
	//System.out.println((int)secword.charAt(i));
	//System.out.println(secword);
	
	
	}	
			
	
		