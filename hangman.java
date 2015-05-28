import javax.swing.*;
public class hangman {
	public static void main(String [] args){
		String sports[] = {"SPORTS", "CRICKET", "SQUASH", "FISHING", "RUGBY"};
		String tvshows[] = {"TVSHOWS", "THE CLEVELAND SHOW", "HOUSE", "CSI", "GLEE"};
		String movies[] = {"MOVIES", "HANGOVER", "CLASH OF THE TITANS", "OLD SCHOOL", "ANCHORMAN"};

		String hangmanWords[][] = {sports, movies, tvshows};

		String graphic[] = {"  O \n/ | \\\n  |\n/   \\","  O \n/ | \\\n  |\n/","  O \n/ | \\\n  |","  O \n/ | \\","  O \n/ |","  O \n/","  O", " "};

		int Guesses, Words;
		String category, word, blankWord, lettersUsed;

		int randomNumber1, randomNumber2;
		randomNumber1 = (int)(Math.random()* hangmanWords.length);
		randomNumber2 = (int)(Math.random()* (hangmanWords[randomNumber1].length-1) + 1);
		System.out.println("R1 = " + randomNumber1 + " R2 = " + randomNumber2);
		category = hangmanWords[randomNumber1][0];
		word = hangmanWords[randomNumber1][randomNumber2];


		blankWord = "";
		Words = 1;

		for(int pos = 0; pos < word.length(); pos++){
			//Convert the char at position pos to an int
			//If it is between 'A' and 'Z', add a dash
			if(((int)word.charAt(pos) >= 65)&&((int)word.charAt(pos) <= 90)){
				blankWord += "-";
			}
			else {
				blankWord += word.charAt(pos);
				if(word.charAt(pos) == ' ') {
					Words++;
				}
			}
		}

		lettersUsed = "";

		for(Guesses = 7; Guesses > 0; Guesses--){
			System.out.println("Category: " + category + "\nNumber of Words: " + Words + "\n" + blankWord);
			System.out.println(graphic[Guesses]);
			//Loop for guesses
			String myGuess = JOptionPane.showInputDialog("Number of Guesses Remaining: " + Guesses +
				"\nGuess a letter:");
			myGuess = myGuess.toUpperCase();

			boolean found = false;

			//Check if letter was already used
			if(lettersUsed.indexOf(myGuess)!= -1){
				JOptionPane.showMessageDialog(null, "The letter " + myGuess + " was already guess.\n"
					+"Lose one guess");
			}
			else {
				lettersUsed += myGuess;
				//Determine if the guessed letter is in the word
				for(int pos = 0; pos<word.length(); pos++){
					if(("" + word.charAt(pos)).equals(myGuess)){
						//Replace hyphen with the letter
						blankWord = blankWord.substring(0, pos) + myGuess + blankWord.substring(pos+1, blankWord.length());
						found = true;
					}
				}
			}

			//if the letter is is found, add one to the guess
			if(found){
				Guesses++;
			}

			if(blankWord.indexOf("-")==-1){
				//No dashes left, you guessed it!
				System.out.println("Category: " + category + "\nNumber of Words: " + Words + "\n" + blankWord);
				System.out.println("Congratulations!  You guessed correctly!");
				System.exit(1);
			}
		}

		System.out.println("Sorry you have no guesses left.");
		System.out.println(graphic[Guesses]);
		System.out.println("The correct word was: " + word);

	}
}