public class BinarySearchIntro {
public static int loopCounter, comparisonCounter, shiftCounter;

	public static int c;
	public static void main(String [] args){
		loopCounter = 0;
		comparisonCounter = 0;
		shiftCounter = 0;
		c = 0;
		String myColours[] = {"1","3","4","6","8","9"};
	System.out.println("4" + binarySearch(myColours,0,myColours.length-1,"4"));
System.out.println(" " + c);
	//System.out.println("Binary Search: pink" + binarySearch(mySortedArray,0,mySortedArray.length-1,"pink"));
System.out.println("Number of comparisons was: " + comparisonCounter);
System.out.println(" num of loops: " + loopCounter);
System.out.println("num of swaps: " + shiftCounter);

	}
	public static boolean binarySearch(String myArray[], int left, int right,String searchForColour){
		//temporary print for learning purposes
		c++;
		int middle;
		loopCounter++;
		comparisonCounter++;
		if(left > right) {
			return false;
		}
		middle = (left + right) / 2;
				comparisonCounter++;

		if(myArray[middle].equals(searchForColour)){
			return true;
		}
		comparisonCounter++;

		if(searchForColour.compareTo(myArray[middle]) < 0){
			return binarySearch(myArray, left, middle - 1, searchForColour);
		}
		else {
			return binarySearch(myArray, middle + 1, right, searchForColour);
		}
	}
}