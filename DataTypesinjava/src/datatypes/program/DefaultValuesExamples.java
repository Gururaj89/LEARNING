package datatypes.program;

import java.util.Scanner;

public class DefaultValuesExamples {

	public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
	System.out.println("Enter the byte");
    byte b= scan.nextByte();
    System.out.println("byte : " +b);
	System.out.println("=========================");
    System.out.println("Enter the short");
    short s= scan.nextShort();
    System.out.println("short : " +s);
	System.out.println("=========================");
    System.out.println("Enter the int");
    int i= scan.nextInt();
    System.out.println("int : " +i);
	System.out.println("=========================");
    System.out.println("Enter the long");
    long l= scan.nextLong();
    System.out.println("long : " +l);
	System.out.println("=========================");
    System.out.println("Enter the double");
    double d= scan.nextDouble();
    System.out.println("double : " +d);
	System.out.println("=========================");
    System.out.println("Enter the character");
    char c = scan.next ().charAt (0); 
    System.out.println("char : " +c);
	System.out.println("=========================");
    System.out.println("Enter the boolean value");
    boolean bool =scan.nextBoolean();
    System.out.println("boolean : " +bool);
	System.out.println("=========================");
    
	}

}
