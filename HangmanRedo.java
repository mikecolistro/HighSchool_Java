import javax.swing.*;
public class HangmanRedo {
	public static void main(String [] args){
		String dictionaries [][] = {

					                {	"boy", "girl", "mother", "father", "sister", "love", "sky", "wind", "water", "study", "ball",
					                    "cat", "dog", "puppy", "kitten", "apple", "pear", "lemon", "mango", "peach", "apricot", "chips", "steak", "fries", "cheese",
					                    "patatoe", "wedge", "heel", "hand", "foot", "arm", "leg", "nose", "face", "mouth", "tongue", "fingers", "toes", "line", "space",
					                    "phone", "cord", "core", "grass", "trees", "birds", "animals", "lazy", "funny", "king", "queen", "heart", "heat", "cold", "sun",
					                    "moon", "movie", "theater", "hairy", "big", "small", "large", "huge", "pig", "donkey", "cow", "chicken", "pizza", "bread", "stones",
					                    "sticks", "leaves", "letters", "alphabet", "soup", "hungry", "tired", "sleepy", "noisy", "caring", "friends", "month", "day", "light"
					                },
									 { 	"abstraction", "ambiguous", "arithmetic", " backslash " , "bitmap", "circumstance", "combination", "consequently", " consortium",
					                    "decrementing", "dependency", "disambiguate", " dynamic", "encapsulation", "equivalent", "expression", "facilitate", " fragment",
					                    "hexadecimal", "implementation", "indistinguishable", "inheritance", "internet", "java", "localization", "microprocessor",
					                    "navigation", "optimization", "parameter", " patrick", "pickle", "polymorphic", "rigorously", "simultaneously", "specification",
					                    "structure", "lexical", "likewise", " management", "manipulate", "mathematics", "hotjava", "vertex", "unsigned", "traditional"
					                },
									{ "toothbrush", "savings", "bank", "account", "teller", "paper", "pencil", "tea", "coffee", "spirit", "ghost", "can", "melon", "necklace",
					                    "screen", "baloon", "string", "calendar", "work", "toys", "kids", "school", "class", "campus", "freedom", "liberty", "happiness",
					                    "university", "message", "marker", "crayon", "eraser", "music", "lyrics", "songs", "ballads", "shapes", "triangle", "circle", "rectangle",
					                    "square", "oval", "show", "video", "player", "team", "sport", "basketball", "football", "soccer", "softball", "baseball", "tennis",
					                    "hockey", "lacrosse", "volleyball", "circut", "blade", "scratch", "hit", "home", "house", "safe", "safety", "number", "count", "bear",
					                    "goose", "lama", "panda", "lion", "tiger", "cheetah", "computer", "crackers", "rice", "fan", "shoes", "book", "story", "princess",
					                    "prince", "jester", "court", "jury", "judge", "bench", "scandal", "name", "newspaper", "press", "shove", "tear", "cry", "magic", "tricks",
					                    "cereal", "breakfast", "lunch", "dinner", "main", "course", "fork", "spoon", "knife", "lamp", "desk", "bottle", "highlighter", "cap",
					                    "medicine", "six", "seven", "flower", "rose", "petal"
                }};

	String picture[] = {"  O \n/ | \\\n  |\n/   \\","  O \n/ | \\\n  |\n/","  O \n/ | \\\n  |","  O \n/ | \\","  O \n/ |","  O \n/","  O", " "};


	String wordDif,hangWord,blankWord,myAttempt,lettersTaken = "",difficulty = "";
	int easyWord, medWord, hardWord,Words,Attempt;
	wordDif = JOptionPane.showInputDialog("Choose your word difficulty \n 1-Easy \n 2-Medium \n 3-Hard");
	easyWord = (int)(Math.random()*46);
	medWord = (int)(Math.random()*45);
	hardWord = (int)(Math.random()*106);
	hangWord = "";
	if (wordDif.equals("1")){
		hangWord = dictionaries[0][easyWord];
	difficulty = "easy";
	}
	else if (wordDif.equals("2")){
		hangWord = dictionaries[1][medWord];
	difficulty = "medium";
	}
	else if (wordDif.equals("3")){
		hangWord = dictionaries[2][hardWord];
	difficulty = "hard";
	}
	else {
		System.out.println("Invalid");
	}

		blankWord = "";
		Words = 1;

for(int pos = 0; pos < hangWord.length(); pos++){
			if(((int)hangWord.charAt(pos) >= 1)&&((int)hangWord.charAt(pos) <= 200)){
				blankWord += "-";
			}
			else {
				blankWord += hangWord.charAt(pos);
				if(hangWord.charAt(pos) == ' ') {
					Words++;
				}
			}
		}
//System.out.println(blankWord);


	for(Attempt = 7; Attempt > 0; Attempt--){
	System.out.println(blankWord);
	System.out.println(picture[Attempt]);
		myAttempt = JOptionPane.showInputDialog(Attempt + " Tries Left \nPick another letter");

	//Checks if letters used
	if(lettersTaken.equals(myAttempt)){
		System.out.println("Letters has been already chosen");
	}
	else{
		lettersTaken += myAttempt;
		for(int pos = 0; pos < hangWord.length(); pos++){
			//System.out.println("Comparing " + myAttempt + " to " + hangWord.charAt(pos));
			if(("" + hangWord.charAt(pos)).equals(myAttempt)){
				System.out.println("Match!");
				Attempt++;
				blankWord = blankWord.substring(0, pos) + myAttempt + blankWord.substring(pos, blankWord.length()-1);

			}
		}
	}
	// If the word is guessed
	if(blankWord.equals(hangWord)){
		System.out.println("The difficulty is " + difficulty + "\n" + "Congratulations you win \n"+blankWord);
		System.out.println(picture[Attempt]);
		break;
	}

	}
	System.out.println("No guesses left you lose.");
	System.out.println(picture[Attempt]);
	System.out.println("The word was: " + hangWord);
	}

}