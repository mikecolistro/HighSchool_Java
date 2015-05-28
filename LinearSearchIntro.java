public class LinearSearchIntro {
public static int loopCounter, comparisonCounter, shiftCounter;

	public static void main(String [] args){
		loopCounter = 0;
		comparisonCounter = 0;
		shiftCounter = 0;
		String myColours[] = {"1","3","4","6","8","9"};
	System.out.println(linearSearch(myColours,"4"));
System.out.println("Number of comparisons was: " + comparisonCounter);
System.out.println(" num of loops: " + loopCounter);
System.out.println("num of swaps: " + shiftCounter);
	}
		public static boolean linearSearch(String myArray[], String searchForColour){
		int k;

		for( k = 0; k < myArray.length; k++){
			loopCounter++;
			comparisonCounter++;
			if(myArray[k].equals(searchForColour)){

				return true;
			}
			//comparisonCounter++;
			//if(myArray[k].compareTo(searchForColour) > 0){

			//	return false;
			//}

		}

		return false;
		}

	}
