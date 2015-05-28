public class stringlengthexample{
	public static void main(String [] args){
		String myName ;
		myName = "Star Wars";
		System.out.println("The number of letters in the string myName is:" + myName.length());
		// length method returns the number of characters. Also must have ()
		
		//Part 2
		for (int i=0; i< myName.length(); i++)
		System.out.println(myName.charAt(i));
		}
}
	