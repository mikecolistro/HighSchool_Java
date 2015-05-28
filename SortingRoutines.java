//Michael Colistro
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
public class SortingRoutines{
public static int loopCounter, comparisonCounter, shiftCounter;
public static void main(String [] args){
loopCounter = 0;
comparisonCounter = 0;
shiftCounter = 0;

long time = -1;
	int arraysize;
	String num = JOptionPane.showInputDialog("How many random numbers would you like?");
	arraysize = Integer.parseInt(num);
	int nums[]=new int[arraysize];
//Tells you if you enter a invalid number
	if(arraysize > 10000){
		System.out.println("Invalid amount of numbers stay under 10000");
		System.exit(-1);
	}
//Generates Numbers
	for (int i = 0; i < arraysize; i++){
	     nums[i] = (int)(Math.random()*5000);

	}
//Prints unsorted
	System.out.println("Unsorted: ");
	for (int i = 0; i < arraysize; i++)
			System.out.println(nums[i]);
//Asks which sorting method to use
	String myInput=JOptionPane.showInputDialog("What SortRoutine would u like to use\n"+
		" 1- Selection Sort\n" +
		" 2- Bubble Sort\n"+
		" 3- Insertion Sort\n" +
		" 4- Quick Sort");
// if statements select the sorting method
	if (myInput.equals("1")){
		time = System.currentTimeMillis();
		selectionSort(nums);
		time = System.currentTimeMillis() - time;
	}
	else if (myInput.equals("2")){
		time = System.currentTimeMillis();
		bubbleSort(nums);
		time = System.currentTimeMillis() - time;
	}
	else if (myInput.equals("3")){
		time = System.currentTimeMillis();
		insertionSort(nums);
		time = System.currentTimeMillis() - time;
	}
	else if  (myInput.equals("4")){
		time = System.currentTimeMillis();
		quickSort(nums,0,nums.length-1);
		time = System.currentTimeMillis() - time;
	}
	else {
		time = System.currentTimeMillis();
		System.out.println("Invalid");
		time = System.currentTimeMillis() - time;
	}
		System.out.println("\n" + "Your sorted numbers are: ");

	for (int i = 0; i < arraysize; i++)
		System.out.println(nums[i]);
System.out.println("\n" + "The time it took to process was : " + time + "ms");
System.out.println("Number of comparisons was: " + comparisonCounter);
System.out.println("Number of loops was: " + loopCounter);
System.out.println("Number of shifts was: " + shiftCounter);
}
//Next variables is what makes the sorting
public static void selectionSort(int data[]) {
		int smallest;

		for(int i = 0; i < data.length - 1; i++){
			loopCounter++;
			smallest = i;
			for(int index = i + 1; index < data.length; index++){
			loopCounter++;
			comparisonCounter++;
			if(data[index] < data[smallest])
				shiftCounter++;
				swap(data, smallest, index);
			}
		}
	}
	public static void swap(int array2[], int first, int second){
		int hold = array2[first];
		array2[first] = array2[second];
		array2[second] = hold;
	}
public static void bubbleSort(int data[]){

	for(int pass=1; pass <data.length; pass++){
		loopCounter++;

		for(int element = 0; element < data.length- 1; element++){
		loopCounter++;
		comparisonCounter++;
		if(data[element] > data[element + 1]){
			shiftCounter++;
			swap(data, element, element + 1);
			}
		}
	}
}
public static void insertionSort(int data[]){
	int insert;
	for(int next = 1; next < data.length; next++){
		loopCounter++;
		insert = data[next];
		shiftCounter++;
		int moveItem=next;

		while(moveItem> 0 && data[moveItem -1]> insert){
			loopCounter++;
			data[moveItem] =data[moveItem -1];
			shiftCounter++;
			moveItem--;
		}
		data[moveItem] = insert;
		}
	}


public static void quickSort(int data[], int low, int high){
	int partitionLoc;
	comparisonCounter++;
	if(low < high){
	shiftCounter++;
		partitionLoc = partition(data, low, high);
		quickSort(data, low, partitionLoc - 1);
		quickSort(data, partitionLoc + 1, high);

	}
}
public static int partition(int data2[], int left, int right){
	boolean moveLeft = true;
	int separator = data2[left];

	while(left < right){
		loopCounter++;
		comparisonCounter++;
		if(moveLeft == true){
			while((data2[right] >= separator) && (left < right)){
				loopCounter++;
				shiftCounter++;
				right --;
			}
		shiftCounter++;
			data2[left] = data2[right];
			moveLeft = false;

		}
		else {
			while((data2[left] <= separator) && (left < right)){
				loopCounter++;
				shiftCounter++;
				left++;
			}
			shiftCounter++;
			data2[right] = data2[left];
			moveLeft = true;

		}
	}
	data2[left] = separator;
	return left;
}
}