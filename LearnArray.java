package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		int arr[] = {100,49,398,34,1,267};
		int lengArray = arr.length;
		
		System.out.println("Printing the Array Element : ");
		System.out.println("************************************************");
		for(int i=0;i< lengArray; i++)
		{
			System.out.println("Array Elements of [" + i + "] is: " + arr[i] );
	}
		System.out.println("Printing the Elements in Sorting");
		
		Arrays.sort(arr);
		System.out.println("*****************************************************");
		for(int i=0;i< lengArray; i++)
		{
			System.out.println("Array Elements of [" + i + "] is: " + arr[i] );
	}
			System.out.println("************************************************");
			System.out.println("The second largeest No is:  " + arr[lengArray-2] );
			System.out.println("The Second Smallest No is :   "  + arr[1] ) ;
	//System.out.println("The second largeest No is:  " + arr[i-2]);	
}
}