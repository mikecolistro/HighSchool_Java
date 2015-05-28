import javax.swing.*;
public class concentricMatrix {
	public static void main(String [] args){
		int dimension;
		String Input;
		Input = JOptionPane.showInputDialog("What size of matrix would you like to make?\n");
		dimension = Integer.parseInt(Input);

//makes the size of the array "matrix"
		int matrix[][] = new int[dimension][dimension];

		for(int num = 0; num <= dimension + 1; num++) {
		            for(int i = num; i < dimension - num; i++){
		                for(int j = num; j < dimension - num; j++){
		                    matrix[i][j] = num + 1;
		                }
		            }
		        }


		System.out.println( dimension + "x" + dimension + " Matrix:");
		for(int i = 0; i < dimension; i++){
			for(int j = 0; j < dimension; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}