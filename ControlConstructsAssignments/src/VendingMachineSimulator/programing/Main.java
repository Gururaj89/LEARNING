package VendingMachineSimulator.programing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The Product Name");
	String productCode=scan.next();
	getProduct(productCode);

	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "p01":
			System.out.println("Coca cola");
			break;
		case "p02":
			System.out.println("Pepsi");
			break;	
			
		case "p03":
				System.out.println("Fanta");
				break;
		case "p04":
			System.out.println("JalJeera");
			break;
		case "p05":
			System.out.println("MountainDew");
			break;
		case "p06":
			System.out.println("BoatGuava");
			break;
		default:
		  System.out.println("Let the Drink be Panaka......");
		}
	}
}
