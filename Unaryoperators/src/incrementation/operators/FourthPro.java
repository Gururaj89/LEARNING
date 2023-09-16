package incrementation.operators;

public class FourthPro {

	public static void main(String[] args) {
		int a=20;
		int b;
		b=a+++a++ + ++a+ ++a+a+++ ++a+ ++a;//Post and pre Increment//
		System.out.println("assigning the value is" +a);
		System.out.println("assigning the value is" +b);
	}

}
