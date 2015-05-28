import java.io.*;
import javax.swing.*;
public class StudentInfo {
	public static void main(String [] args) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("StudentInfo.txt"));
		int inInfo[] = new int[100];
		String myInfo;
		String sinfo;
		int numStud;
		System.out.println("The contents in StudentInfo.txt is ");

		while((myInfo = readFile.readLine()) != null){
			System.out.println(myInfo);
		}
		//Print Writer class and FileWriter
		readFile.close();
		PrintWriter fileOut = new PrintWriter(new FileWriter("StudentInfo.txt", true));
		String numStudent;
		numStudent = JOptionPane.showInputDialog("How many students do u plan on inputing");
		numStud = Integer.parseInt(numStudent);
		for(int i = 0 ; i < numStud; i++){
			sinfo = JOptionPane.showInputDialog("Enter your students info here following this example : Name/School/Age" );
			fileOut.println(sinfo);
		fileOut.close();
		}

	}
}