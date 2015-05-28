import javax.swing.*;
public class Fibonacci {
     public static int fib(int n) {
     //the fibonacci sequence
                if (n < 2) {
                   return n;
                }
                else {
		   return fib(n-1)+fib(n-2);
                }
	}
public static void main(String[] args) {
    // asks the user how many terms he/she wants to show up
    String term = JOptionPane.showInputDialog("Input the amount of terms you would like to show");
    int turm = Integer.parseInt(term);
    //loop that prints the terms
    for (int i=0; i<=turm; i++)
        System.out.print(fib(i)+", ");
}


}