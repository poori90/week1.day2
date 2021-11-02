package week1.day2;

public class MyMobile {

	String name = "Dolly";
	int number = 123;
	 public String  makeCalls() {
		
		 
		 System.out.println("This method is to print the makecalss "+name);
		 return name ;
	}
	 public void sendMsg() {
		
		 System.out.println("This Method is to print the send message "+number);
	}
	// public 
	 private void payBills() {
		System.out.println("This method is to print the paybills");

	}
	public static void main(String[] args) {
		
		MyMobile  obj = new MyMobile();
		obj.makeCalls();
		obj.sendMsg();
		
		
	}

}
