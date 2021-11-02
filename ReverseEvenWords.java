package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] splitArr = test.split(" ");
		System.out.println("Split the String  and Traverse through each word");
		System.out.println("****************************************************");
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println("splitArr["+i+"]: " + splitArr[i]);
		}
		System.out.println("****************************************************");
		System.out.println("Printing the Even Position Words in Reverse order");
		System.out.println("****************************************************");
		for (int i = 0; i < splitArr.length; i++) {
			    	if (i % 2 != 0) {
			    		char arr1[] = splitArr[i].toCharArray();
						for (int j = (arr1.length) - 1; j >= 0; j--) {
							System.out.print(arr1[j]);

						}
						System.out.print(" ");	
				}

				else {
					System.out.print(splitArr[i]);
					System.out.print(" ");
				}

			}
	}
}
	


