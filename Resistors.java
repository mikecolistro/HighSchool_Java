import javax.swing.*;
public class Resistors {
 public static void main(String [] args){
  
  String colours[]={"BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET", "GREY", "WHITE"};
  String Myinput=JOptionPane.showInputDialog("Enter your colours here");
  
  
  String word1,word2,word3;
  int num1 = 0,num2 = 0,num3 = 0; 
  int dash1,dash2;
  String Input2;
  
  dash1=Myinput.indexOf("-");
  System.out.println(dash1);
  dash2=Myinput.lastIndexOf("-");
  System.out.println(dash2);
  
 word1 = Myinput.substring(0, dash1);
 
 word1= word1.toUpperCase();
 
 word2 = Myinput.substring(dash1 + 1, dash2);
 
 word2= word2.toUpperCase();
 
 word3 = Myinput.substring(dash2 +1 , Myinput.length());
 
 word3= word3.toUpperCase();
 
 System.out.println(word1);
 System.out.println(word2);
 System.out.println(word3);
 
 /* ORIGINAL CODE
 For(int i =0; i<colours.length i++){   //lowercase f, semi colon after length
   If(word1.equals(colours[i])){    //lowercase i
    num1=i; 
            //End the for loop here with }
  
 For(int i = 0; i< colours.length i ++){
  If (word2.equals(colours[i])){
    num2=1;
 
 For(int i = 0; i< colours.length i ++);{
  If (word2.equals(colours[i]));{
   
  String Input3=num1 * num2^num3
  System.out.println(Input3)   
       }
      }   
     }
    }   
   }
  }  
  */
  
  //NEW CODE
  for(int i = 0; i < colours.length; i++){
   if(word1.equals(colours[i])){
    num1 = i;
   }
  }
  
  for(int i = 0; i < colours.length; i++){
   if(word2.equals(colours[i])){
    num2 = i;
   }
  }
  
  for(int i = 0; i < colours.length; i++){
   if(word3.equals(colours[i])){
    num3 = i;
   }
  } 

  double endValue = (num1 * 10 + num2) * Math.pow(10,num3);
  System.out.println("The resistor value = " + endValue); 


  
 }
} 

