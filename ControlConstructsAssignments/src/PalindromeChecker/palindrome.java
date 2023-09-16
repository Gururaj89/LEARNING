package PalindromeChecker;

public class palindrome {
	void ispalindrome(int n) {
		
		int original=n;
		int rev=0;
		while(n>0) {
			int ld=n%10;
			rev=rev*10+ld;
			n=n/10;
			
		}
		if(original==rev) {
			System.out.println("Enter number is a palindrome");
		}
		else {
			System.out.println("Enter number is a not palindrome");
		}
	}

}
