package thecalculatordilemma;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		  Scanner scan= new Scanner(System.in);
		  int num1=20;
		  int num2 =15;
	     System.out.println("Enter the choice..:");
	     int result=scan.nextInt();
	 
		switch(result) {

		case 1:
			System.out.println("Addition two number : " + (num1+num2));
			break;
		case 2:
			System.out.println("Substraction two number : " + (num1-num2));
			break;
		case 3:
			System.out.println("Multiplication two number : " + (num1*num2));
			break;
		case 4:
			System.out.println("Division two number : " + (num1/num2));
			break;
			default :
				System.out.println("you are choosing Wrong.......");
		}
		   
		    }

	}



