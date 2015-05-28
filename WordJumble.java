import javax.swing.*;
public class WordJumble {
	public static void main(String [] args){
		String letters = JOptionPane.showInputDialog("Enter your word here");
		jumbleWords(letters, "");
	}
	public static void jumbleWords(String word, String jumbledLetters){
		int pos;
		String remainingLetters;
		String origWord = word;
		String origJumbledLetters = jumbledLetters;
		if(word.length() == 1){
			System.out.println(jumbledLetters + word);
		}
		else {
			for(pos = 0; pos < origWord.length(); pos++){
				remainingLetters = origWord.substring(0, pos) +
					origWord.substring(pos + 1, origWord.length());
				jumbleWords(remainingLetters, origJumbledLetters + origWord.charAt(pos));
			}
		}
	}
}
