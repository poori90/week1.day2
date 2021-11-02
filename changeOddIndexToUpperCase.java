package week1.day2;

public class changeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str="welcome";
		char[] charArray = str.toCharArray();
		System.out.println("Converting OddIndex Char to Uppercase");
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0)
			{
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.print(upperCase);
			}
		
			else
				System.out.print(charArray[i]);
		}	

	}

}
