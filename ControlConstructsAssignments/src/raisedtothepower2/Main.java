package raisedtothepower2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number");

		int num=scan.nextInt();

		System.out.println("Enter The Power To Which It Should Be Raised");

		int n=scan.nextInt();
		 Power2  Power=new  Power2();
	  int result=Power.raiseToPowerN(num ,n);
	  System.out.println(result);

	}

}
