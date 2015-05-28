
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
public class Psalms {
    public static ArrayList<String> PsalmNum = new ArrayList<String>();
    public static ArrayList PsalmWord = new ArrayList();
    public static int pos;

    public static void main(String [] args)throws IOException{
     String myinput;

     pos = 0;
     BufferedReader readFile = new BufferedReader(new FileReader("PsalmsNum.txt"));

     String line;
     while ((line = readFile.readLine()) != null) {
         PsalmNum.add(line);
     }
     readFile.close();

     BufferedReader readFile2 = new BufferedReader(new FileReader("PsalmsWord.txt"));

     String line2;
     while ((line2 = readFile2.readLine()) != null) {
         PsalmWord.add(line2);
     }
     readFile2.close();

     System.out.println("The Psalms that are in the file are : " + PsalmNum);
	 myinput = JOptionPane.showInputDialog("Enter which Psalm you are looking for");
	 System.out.println("Your requested Psalm was:" + "\n" + myinput);

     String []strArray = new String[PsalmNum.size()];

     int []ArrayNum = new int[PsalmNum.size()];
     PsalmWord.toArray(strArray);

        for(int i = 0; i < PsalmNum.size()-1; i++){
         ArrayNum[i] = Integer.parseInt(PsalmNum.get(i));
        }


     if (binarySearch(ArrayNum,0,PsalmNum.size()-1,Integer.parseInt(myinput))){
         System.out.println(strArray[pos]);
     }
 }

 public static boolean binarySearch(int myArray[], int left, int right,int searchForColour){
        int middle;
        if(left > right) {
            return false;
        }
        middle = (left + right) / 2;

     if(myArray[middle]==(searchForColour)){
      pos = middle;
         return true;
     }
     if(searchForColour<myArray[middle]){
         return binarySearch(myArray, left, middle - 1, searchForColour);
     }
     else {
      return binarySearch(myArray, middle + 1, right, searchForColour);
  }
 }
}