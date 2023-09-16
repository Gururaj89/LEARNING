package methodoverloading.program;

import java.util.Scanner;

public class SolutionProgram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=scan.nextLine();
		greet(name);

	}
	public static void greet(String name) {
		System.out.println("Hello omkar....How are You...");
	}

}
