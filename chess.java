import javax.swing.*;
import java.util.ArrayList;
public class Chess {
	public static void main(String [] args){
	//These are arrays for each of the rows on the board
	int row1[] = {0,0,0,0,0,0,0,0};
	int row2[] = {0,0,0,0,0,0,0,0};
	int row3[] = {0,0,0,0,0,0,0,0};
	int row4[] = {0,0,0,0,0,0,0,0};
	int row5[] = {0,0,0,0,0,0,0,0};
	int row6[] = {0,0,0,0,0,0,0,0};
	int row7[] = {0,0,0,0,0,0,0,0};
	int row8[] = {0,0,0,0,0,0,0,0};
	//This creates an array for the board using the row arrays
	int board[][] = {row1,row2,row3,row4,row5,row6,row7,row8};
	//This outputs the chess boards with only zeros on it
	System.out.println("Empty chess board:");
	for(int i = 0; i < board.length; i++){
		for(int j = 0; j < board[i].length; j++){
			System.out.print(board[i][j]);
	}
		System.out.print("\n");
}
		//This sets the number times the user can input coordinates
		int inputs = 8;
		String myInput, row, column;
		int x, y;
		//This loop allows the user to enter coordintates as long as inputs remains over 0
		while ( inputs >= 1){
		inputs = inputs - 1;
		myInput = JOptionPane.showInputDialog("Enter the coordinates on the chess board with a decimal separating the numbers(Ex. 8.8)");
		row = myInput.substring(0, myInput.indexOf("."));
		column = myInput.substring(myInput.lastIndexOf(".")+1);
		//1 had to be subtracted from the coordinates because the values on the board start at zero
		x = Integer.parseInt(row) - 1;
		y = Integer.parseInt(column) - 1;
		//This changes the entered coordinates value to 1
		board[x][y] = 1;

	}
		//This outputs the final board with 1's marked where coordinates were given
		if ( inputs < 1){
			System.out.println("--------");
			System.out.println("Board with pieces on it:");
			for(int i = 0; i < board.length; i++){
		for(int j = 0; j < board[i].length; j++){
			System.out.print(board[i][j]);
	}
		System.out.print("\n");
}

		}
	}
}