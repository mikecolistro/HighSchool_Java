import java.io.*;

public class RandomQuoteoftheDay {
	public static void main(String [] args) throws IOException {
	 int quote;
	BufferedReader quoteFile = new BufferedReader(new FileReader("RandQuote.txt"));
	//random number to pick the quote
	quote = (int)(Math.random()* 10) ;
	String myLine;
	String quotes [] = new String [10];
	//puts the quotes into an array
	for(int i = 0; i < 10; i++){
		quotes[i] = quoteFile.readLine();
	}
	//closes file so it does not crash
	quoteFile.close();
	System.out.println("Random quote of the day is " + quotes[quote]);

	}
}