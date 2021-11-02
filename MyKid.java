package week1.day2;

public class MyKid {


	
	public static void main(String[] args) {
		MyMobile  objMob = new MyMobile();
		System.out.println(objMob.name);
		System.out.println(objMob.number);
		
		objMob.makeCalls();
		objMob.sendMsg();
		
		//objMob.payBills();
		
	}

}
