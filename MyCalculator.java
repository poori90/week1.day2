package week1.day2;

import java.io.PrintStream;

public class MyCalculator {

	public static void main(String[] args) {
		System.out.println("Calling other class methods in this Class using Object");
		System.out.println("******************************************************************");
		Calculator objadd=new Calculator();
		System.out.println(objadd.add(40, 5, 3));
		Calculator objsub= new Calculator();
		System.out.println(objsub.sub(100, 33));
		Calculator objmul= new Calculator();
		System.out.println(objmul.mul(256, 340));
		Calculator objdiv= new Calculator();
		System.out.println(objdiv.divide(456, 5));

	}

}
