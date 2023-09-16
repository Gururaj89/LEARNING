package takinginput.program;

import java.util.Scanner;

public class SecondPro {

	public static void main(String[] args) {

		    Scanner scan = new Scanner(System.in);
			System.out.println("Enter The Student First Name...");
			String firstname=scan.next();
			System.out.println("Student First Name is : " +firstname);
			 System.out.println("============================");
			System.out.println("Enter the Student Last Name...");
			String lastname=scan.next();
			System.out.println("Student Last Name is : " + lastname);
			 System.out.println("============================");
			System.out.println("Enter The Student Age...");
	        int age=scan.nextInt();
	        System.out.println("the Student Age is : " + age);
	        System.out.println("============================");
	        System.out.println("Is Student Married ? Say True or False..");
	        boolean married=scan.nextBoolean();
	        System.out.println("The Student Married ? : " +married);
	        System.out.println("============================");
	        System.out.println("Enter The Student Branch..");
	        String branch=scan.next();
	        System.out.println("The Student Branch Is : " +branch);
	        System.out.println("============================");
	        System.out.println("The Student Height.....");
	        float height=scan.nextFloat();
	        System.out.println("The Student Height is : " + height);
	        System.out.println("============================");
	        System.out.println("Enter The Student Weight...");
	        double weight=scan.nextDouble();
	        System.out.println("THe Student Weight is : " + weight);
	        System.out.println("============================");

	}

}
