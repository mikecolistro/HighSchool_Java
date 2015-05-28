import javax.swing.JOptionPane;
import java.util.*;
public class Hangman2
{
    public static void main (String a [])
    {



                    String word = "";
                    int badGuesses;

                    String difficulty = JOptionPane.showInputDialog ("Select difficulty : 1 for easy -- 2 for normal -- 3 for hard");
                    int intDifficulty = Integer.parseInt(difficulty);


                    String dictionaries [][] = {

					                { 	" abstraction ", " ambiguous ", " arithmetic ", " backslash " , " bitmap", " circumstance", " combination", " consequently", " consortium",
					                    " decrementing", " dependency", " disambiguate", " dynamic", " encapsulation", " equivalent", " expression", " facilitate", " fragment",
					                    " hexadecimal", " implementation", " indistinguishable", " inheritance", " internet", " java", " localization", " microprocessor",
					                    " navigation", " optimization", " parameter", " patrick", " pickle", " polymorphic", " rigorously", " simultaneously", " specification",
					                    " structure", " lexical", " likewise", " management", " manipulate", " mathematics", " hotjava", " vertex", " unsigned", " traditional"
					                },


					                {	"boy", "girl", "mother", "father", "sister", "love", "sky", "wind", "water", "study", "ball",
					                    "cat", "dog", "puppy", "kitten", "apple", "pear", "lemon", "mango", "peach", "apricot", "chips", "steak", "fries", "cheese",
					                    "patatoe", "wedge", "heel", "hand", "foot", "arm", "leg", "nose", "face", "mouth", "tongue", "fingers", "toes", "line", "space",
					                    "phone", "cord", "core", "grass", "trees", "birds", "animals", "lazy", "funny", "king", "queen", "heart", "heat", "cold", "sun",
					                    "moon", "movie", "theater", "hairy", "big", "small", "large", "huge", "pig", "donkey", "cow", "chicken", "pizza", "bread", "stones",
					                    "sticks", "leaves", "letters", "alphabet", "soup", "hungry", "tired", "sleepy", "noisy", "caring", "friends", "month", "day", "light"
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

                      			if( intDifficulty > dictionaries.length )

				          		 {
				               			System.out.println( "Sorry answer between 1 and 3" );
				               			return;
       							 }



					String pickedArray[] = dictionaries[intDifficulty];
					String[] difficultyMsg = {"Easy huh?", "At last!A normal guy.", "You think you are a tough guy?"};
        			System.out.println( difficultyMsg[intDifficulty] );


                    Scanner letterProvided = new Scanner(System.in);
                    String pickedArray [] = {""};
                    String letter;

					word = pickedArray[0].trim();
					char[] hidden = new char[word.length()];


					for(int i = 0; i < word.length(); i++)
					{
           				 hidden[i] = '_';
					}

					char[] digit = word.toCharArray();
					Scanner letterProvided = new Scanner(System.in);



					badGuesses = 0;
					do
					{
						System.out.print("So far: " + badGuesses + "bad guesses");
					}

						for(int i = 0; i < word.length(); i++)
						{
                			System.out.print(hidden[i]);
						}

						System.out.print( "\nPlease enter a letter: " );
						String letter = letterProvided.nextLine().toLowerCase();

						char guess = letter.charAt(0);
						boolean correctGuess = false;

						for(int i = 0; i < word.length(); i++)
						{
							if(guess == digit[i])
							{
								hidden[i] = guess;
								correctGuess = true;

							}
						}


						if(!correctGuess)
						{
							badGuesses++;
						}

						 while(badGuesses < 6);


    }
}
