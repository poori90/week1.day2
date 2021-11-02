package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] str1 = str.toCharArray();
		System.out.println("Characters in the String ");
		System.out.println("**********************************************************");
		for (int i = 0; i < str1.length; i++) {
			System.out.println("charArray1[" + i + "]: " + str1[i]);
		}
		System.out.println("**********************************************************");
		System.out.println("Printing the length of  the Char Array ");
		System.out.println(str1.length);
		System.out.println("**********************************************************");
		System.out.println("Printing the Traversed characters from the Array");
		for (int i = 0; i < str1.length; i++) {

			System.out.println(str1[i]);
			if (str1[i] == 'e') {
				count++;

			}

		}
		System.out.println("**********************************************************");
		System.out.println("Printing the count of Letter 'E' occurance in the string");
		System.out.println(count);

	}
}
