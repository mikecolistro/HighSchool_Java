import javax.swing.*;
public class Palindrome {
	public static void main(String [] args){
		String Input ;
		String Input2 ="" ;
			
			Input=JOptionPane.showInputDialog("Enter your word:");
		//tells the user the word and the number of letters in the word
			for(int i = Input.length() - 1; i>=0; i--){	
			Input2 += Input.charAt(i);
			}
			System.out.println("Length of string = " + Input.length());
			System.out.println("Your word was " + Input);
		//Switches your word to all lower case and takes out the spaces
			Input = Input.toLowerCase(); 
			Input = Input.replace(" ", "");
			System.out.println(Input2);
		// identifies if the word you submitted is a palindrome
			if (Input.equals(Input2)){
				System.out.println("Your word is a PALINDROME");
	}
			else{
				System.out.println("Your word is not a PALINDROME");
			}
		

	}	
    }
    
