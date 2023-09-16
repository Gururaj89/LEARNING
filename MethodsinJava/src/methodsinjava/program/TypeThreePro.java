package methodsinjava.program;

public class TypeThreePro {

	public static void main(String[] args) {
		int a=10;
		int b=20;
        add(a,b);
        sub(a,b);
        multi(a,b);
        div(a,b);
        mod(a,b);
	}

	public static void add(int a,int b) {
		int c=a+b;
		System.out.println("The Addition Result Is :" + c);
	}
	public static void sub(int a,int b) {
		int c=a-b;
		System.out.println("The Substraction Result Is :" + c);
	}
	public static void multi(int a,int b) {
		int c=a*b;
		System.out.println("The Multiplication Result Is :" + c);
	}
	public static void div(int a,int b) {
		int c=a/b;
		System.out.println("The Division Result Is :" + c);
	}
	public static void mod(int a,int b) {
		int c=a%b;
		System.out.println("The Percentage Result Is :" + c);
	}
}
