package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] arr1={3,2,11,4,6,7};
		int[] arr2 ={1,2,8,4,9,7};
		System.out.println(" Printing the Insection of 2 Arrays");
		System.out.println("*************************************************************");
		for (int i = 0; i < arr1.length;i++) {
	        for( int j = 0; j < arr2.length; j++ )
 	        {
	            if( arr1[i] == arr2[j] )
	            	
	            	System.out.println("Intersection numbers in First Array [" + i + "] : " + arr1[i] );
	                
	            	//System.out.println("Intersection numbers in Second Array [" + j + "] : " + arr2[j] );
	            	
 	        }       
		
	}

	}
}
