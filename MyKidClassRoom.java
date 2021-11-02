package week1.day2;

public class MyKidClassRoom {

	public static void main(String[] args) {
		MyMobileClassRoom objMob = new MyMobileClassRoom();
		System.out.println(objMob.brandName);
		System.out.println(objMob.IMEI);
		
		objMob.makeCalls();  // public methd
	//	objMob.payBills();   // private methd
	}

}
