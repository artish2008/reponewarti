package twitter.RestAPIHTTPClientautomation;

//import java.util.Arrays;

//import java.util.Scanner;

public class ArrayRepeatedElements {

public static void main(String[] args) 

	{



	int[] myArr= {10, 20, 9, 20,50};

	ArrayRepeatedElements a = new ArrayRepeatedElements();

	a.repeatArrayElement(myArr);

	}

	/*

	int[] myArr = new int [10];

	int temp;


	//Read in 10 elements into the array from Console

	Scanner s = new Scanner(System.in);

	System.out.println("Enter 5 numbers(separated by spaces) to set up Input array: ");

	for (int i=0; i<5; i++)


	myArr[i] = s.nextInt(); 


	// Print out the Initial array

	System.out.print("{ ");


	for (int i=0; i<5; i++)

	System.out.print(myArr[i]+ ", ");

	s.close(); */
//		----either we get array input from user by Scanner class and call method 
//or we can do directly declaring ARRAY

	public void repeatArrayElement(int[] myArr)

	{

	System.out.println("Repeated elements in array are:");


	for (int i=0; i<myArr.length-1; i++)


	{

	boolean check = false;


	    /*  for(int k=0; k<i; k++)

	if(myArr[i]== myArr[k])

	{

	is_seen = true;

	break;

	}

	*/



	       if(!check)

	{

	for(int j=i+1; j<myArr.length; j++)

	{

	if(myArr[i] == myArr[j])

	System.out.println(myArr[i] +" is repeated in positions Array["+i +"] and Array[" +j +"]");

	}

	}//if not seen

	}//for loop i++

	}// closing method 



	}//main class


	//resultRepeated elements in array are:

	 //20 is repeated in positions Array[1] and Array[3]






	
