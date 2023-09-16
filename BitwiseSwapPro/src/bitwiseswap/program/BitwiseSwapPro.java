package bitwiseswap.program;

import java.util.Scanner;

public class BitwiseSwapPro {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the first integer: ");
	        int num1 = scan.nextInt();
	        System.out.print("Enter the second integer: ");
	        int num2 = scan.nextInt();  
	       
	      swapUsingBitwise(num1 , num2);
	   
	    }
	

	    public static void swapUsingBitwise(int num1, int num2) {
	         int temp=num1;
	         num1=num2;
	         num2=temp;
	         System.out.print("Numbers After Swapping :");
	         System.out.print("First :"+ num1);
		     System.out.print(", Second :" + num2);

	}

}
