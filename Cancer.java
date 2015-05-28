import java.io.*;
public class Cancer{
	public static String grid [][];
	public static int cancerSize;
	public static void main(String [] args)throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("Cancer.txt"));
		int row, col;
		grid = new String [15][15];
		String myInfo;

		String myLine;
		for(row = 0; row < 15; row++){
   			myLine = readFile.readLine();
   			for(col = 0; col < 15; col++){
    		grid[row][col] = "" + myLine.charAt(col);
   		}
  		}


	displayGrid();
	cancerSize = 0;
	for(row = 0; row < 15; row++){
   		for(col = 0; col < 15; col++){
   			cancerFind(row, col);
   		}
	}
	System.out.println("The cancer was " + cancerSize + " units big");
	displayGrid();
	System.out.println("Congratulations ur now cancer free!!!");
		}


	public static void  cancerFind(int row, int col){
			if(grid[row][col].equals("-")){
			grid[row][col] = " ";
			cancerSize++;
			cancerFind(row - 1, col - 1);
			cancerFind(row - 1, col);
			cancerFind(row - 1, col + 1);
			cancerFind(row, col - 1);
			cancerFind(row, col + 1);
			cancerFind(row + 1, col -1);
			cancerFind(row + 1, col);
			cancerFind(row + 1, col + 1);
		}
	}
	public static void displayGrid(){
		String output = " Cancer Grid" + "\n";
		for(int row = 0; row<= 14; row++){
				for(int col = 0; col <= 14; col++){
				output += grid[row][col];
			}
			output+= "\n";
			}
		System.out.println(output);
		}
	}


