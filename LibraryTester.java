import javax.swing.*;

public class LibraryTester {
	public static void main(String [] args){
		Library myLibrary = new Library ();

		String myInput = "";
		while(!myInput.equals("3")){
			//display library
			System.out.println(myLibrary);

			myInput = JOptionPane.showInputDialog("Library Menu\n" + "1 - Checkout Book\n" + "2 - return Book\n" + "3 - Exit");

			if(myInput.equals("1")){
				String bookNum = JOptionPane.showInputDialog("which book # do you wish to check out?");
				int bNum = Integer.parseInt(bookNum);
				String bName = JOptionPane.showInputDialog("what is the name of the person checking out the book?");
				myLibrary.checkOutBook(bNum, bName);
			}

			if(myInput.equals("2")){
				String bookNum = JOptionPane.showInputDialog("Which book # do you wish to return?");
				int bNum = Integer.parseInt(bookNum);
				myLibrary.returnBook(bNum);
			}
		}
	}
}