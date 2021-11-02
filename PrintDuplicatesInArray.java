package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = arr.length;
		int count ;
		System.out.println("Duplicate numbers in the Array ");
		System.out.println("*********************************************");
		for (int i = 0; i < len ; i++) {
			count =0 ;
			for (int j = i; j < len-1; j++) {
			if(arr[i]==arr[j])	{
				count=count+1;
				
			}
				
		} if(count >1)
			System.out.println("Printing the First array numbers :"+arr[i]);
		}
	}

}
