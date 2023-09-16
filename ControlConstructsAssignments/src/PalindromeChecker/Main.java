package PalindromeChecker;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number");

		int n=scan.nextInt();

		palindrome palindrome = new palindrome();

		palindrome. ispalindrome(n);

	}

}
