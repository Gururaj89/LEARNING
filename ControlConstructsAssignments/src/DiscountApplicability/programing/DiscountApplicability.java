package DiscountApplicability.programing;

import java.util.Scanner;

public class DiscountApplicability {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);

	}
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
	}

}
