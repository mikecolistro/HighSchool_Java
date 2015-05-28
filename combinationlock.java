
import javax.swing.*;
public class combinationlock{
	private int num1, num2, num3;
	public combinationlock (int n1, int n2, int n3){
		num1=n1;
		num2=n2;
		num3=n3;

	}
	public combinationlock(){
		num1=(int)(Math.random()*3 +1);
		num2=(int)(Math.random()*3 +1);
		num3=(int)(Math.random()*3 +1);

	}
	public boolean openlock(int n1, int n2, int n3){
		if((n1==num1)&&(n2==num2)&&(n3==num3)){
			System.out.println("Success!!"); return true;

		}
		else{
			System.out.println("Fail") ;return false;
		}
	}
	public String toString(){
			String output= "n1 = " + num1 + " n2 = " + num2 + " n3 = " + num3;
			return output;

	}
}