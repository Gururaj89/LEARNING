package takinginput.program;

import java.util.Scanner;

public class Firstpro1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int a =scan.nextInt();
        System.out.println("The Value is = " + a);
        System.out.println("============================");
        System.out.println("Enter a Real Number");
        float b=scan.nextFloat();
        System.out.println("The value is = " + b);
        System.out.println("============================");
        System.out.println("Enter another Real Number");
        double c=scan.nextDouble();
        System.out.println("The Value is = " + c);
        System.out.println("============================");
        System.out.println("Are ypu Married ?  Say True or False " );
        boolean d=scan.nextBoolean();
        System.out.println("The value is = " + d);
        System.out.println("============================");
        System.out.println("Enter Your Insta Id");
        String e=scan.next();
        System.out.println("The Value is = " + e);
        System.out.println("============================");
        System.out.println("Enter Your Full Name");
        scan.nextLine();
        String f=scan.nextLine();
        System.out.println("THe value is = " +f );

	}

}
