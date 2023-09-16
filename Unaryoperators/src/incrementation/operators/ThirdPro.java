package incrementation.operators;

public class ThirdPro {

	public static void main(String[] args) {
		int a=10;
		int b;
		b=++a+ ++a+a+++a++; //Post and Pre incrementation//
		System.out.println("the assigning value is" +a);
		System.out.println("the assigning value is" +b);
	}

}
