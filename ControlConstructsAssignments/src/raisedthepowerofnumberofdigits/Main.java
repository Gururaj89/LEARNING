package raisedthepowerofnumberofdigits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
	    int num=scan.nextInt();
	    Power Power =new Power();
	    int digits=Power.countdigits(num);
		int result=Power.raiseToPowerN(num , digits);
		System.out.println("The result is "+num+" Raised  to Power " + digits+" is "+ result);

	}

}