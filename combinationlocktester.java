import javax.swing.*;
public class combinationlocktester{
	public static void main(String [] args){
		String number1, number2, number3;
		int num1, num2, num3, i;
		combinationlock ComboLock1=new combinationlock();


		System.out.println("Create your own manually set lock");
		number1=JOptionPane.showInputDialog("Enter the turn value of n1");
		num1 = Integer.parseInt(number1);
		number2=JOptionPane.showInputDialog("Enter the turn value of n2");
		num2 = Integer.parseInt(number2);
		number3=JOptionPane.showInputDialog("Enter the turn value of n3");
		num3= Integer.parseInt(number3);
		combinationlock ComboLock2= new combinationlock(num1,num2,num3);
		System.out.println("Your lock you created was " + ComboLock2.toString());
		System.out.println("Try opening a random lock");

		for (i=0; i<3;i ++){
			number1=JOptionPane.showInputDialog("guess a value for n1");
			num1 = Integer.parseInt(number1);
			number2=JOptionPane.showInputDialog("guess a value for n2");
			num2 = Integer.parseInt(number2);
			number3=JOptionPane.showInputDialog("guess a value for n3");
			num3= Integer.parseInt(number3);
			System.out.println("attempting to open lock");
			if(ComboLock1.openlock(num1,num2,num3)==true){
				System.out.println("Success");
				break ;
			}
			else{
				System.out.println("try again");
			}
		}

		if(i>=2){
			System.out.println("The combo was "+ ComboLock1.toString());

		}
	}
}