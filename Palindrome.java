package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str ="madam";
		String rev = "";
		 int length = str.length(); 
		 for ( int i = length - 1; i >= 0; i-- )  
	         rev = rev + str.charAt(i);  
		   if (str.equals(rev))  
		         System.out.println(" This String is a palindrome."); 
		   else
			   System.out.println("This String is not a Palindrome");
	}

}
