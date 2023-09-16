package raisedtothepower;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
		Power1 Power1=new Power1();
		int result=Power1. raiseToTwo(num);
		System.out.println(result);
		

	}

}
