import javax.swing.*;

public class Library {
	// The library will contain books stored in an array

	private Book libBooks[];

	public Library(){
		fillBooks();
	}

	public void fillBooks(){
		//asks how many books to fill
		String myInput = JOptionPane.showInputDialog("How many books would you like to enter");
		int numBooks = Integer.parseInt(myInput);

		libBooks = new Book[numBooks];

		String title, author;

		for(int i = 0; i < numBooks; i++){
			title = JOptionPane.showInputDialog("Book " + (i+1) + " Title");
			author = JOptionPane.showInputDialog("Book " + (i+1) + " Author");
			//Create the individual book object
			libBooks[i] = new Book(title, author);
		}

	}

	public void checkOutBook(int num, String name){

		if(libBooks[num].isOut() == true){
			JOptionPane.showMessageDialog(null, "This book is already out!");
		}
		else{
			libBooks[num].setIsOut(true);
			libBooks[num].setCheckOutName(name);
		}
}

	public void returnBook(int num){
		if(libBooks[num].isOut() == false){
			JOptionPane.showMessageDialog(null, "this book is already returned!!");
		}
		else{
			libBooks[num].setIsOut(false);
		}
	}

	public String toString() {
		String output = "";
		output += "Library contains:\n";
		//print each book
		for(int i = 0; i < libBooks.length; i++){
			output += "Book #" + i + "\n";
			output += libBooks[i].toString() + "\n";
		}
		return output;
	}
}
