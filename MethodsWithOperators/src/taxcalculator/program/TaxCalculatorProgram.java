package taxcalculator.program;

import java.util.Scanner;

public class TaxCalculatorProgram {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
        double purchaseAmount = scan.nextDouble();
        System.out.println();
        System.out.print("Enter tax rate (in decimal): ");
        double taxRate = scan.nextDouble();

        double totalCost = calculateTotalWithTax(purchaseAmount, taxRate);
        System.out.println("Total cost including tax: " + totalCost);
        
        scan.close();
	}

	 public static double calculateTotalWithTax(double purchaseAmount, double taxRate) {
	        double taxAmount = purchaseAmount * taxRate;
	        double totalCost = purchaseAmount + taxAmount;
	        return totalCost;

	}

}
