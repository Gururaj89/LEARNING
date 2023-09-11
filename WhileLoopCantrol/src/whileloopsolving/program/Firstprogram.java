package whileloopsolving.program;

import java.util.Scanner;

public class Firstprogram {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	calculate(num);
	

	}

	public static void calculate(int num) {
		int datacount=1;
		while(datacount<=6) {
			
			if(datacount % 2==0) {
				System.out.println("First set");
			}
			else if(datacount % 3==0){
				System.out.println("Second set");
				
			}
			else {
				System.out.println("Third set");
				
			}
			datacount++;
		}
		
		
	}
}
