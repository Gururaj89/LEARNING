package PolygonIdentifier.programing;

import java.util.Scanner;

public class PolygonIdentifier {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number of Sides");
		int sides=scan.nextInt();
		 identifyPolygon(sides);
		

	}
	public static void identifyPolygon(int sides) {
		switch(sides) {
		case 3:
			System.out.println("traiangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
				System.out.println("Pentagon");
				break;
		case 6:
			System.out.println("Hexagon");
			break;
		default:
			System.out.println("Polygon");
			
		}
	}
}