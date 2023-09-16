package methodsinjava.program;

public class TypeTwoPro {

	public static void main(String[] args) {
	int	result=add();
   System.out.println("The Addition result is " + result);
   int  result1=sub();
   System.out.println("The Substraction result is = " + result1);
   int result2=multi();
   System.out.println("The Multiplication result is " + result2);
   int result3=div();
   System.out.println("The Division result is " + result3);
   int result4=modulus();
   System.out.println("The Percentage result is " + result4);
	}

	public static int add() {
	int a=10;
	int b=20;
	int c=a+b;
	return c;
		
	}
	public static int sub() {
		int a=10;
		int b=20;
		int c=a-b;
		return c;
		
	}
	public static int multi() {
		int a=10;
		int b=20;
		int c=a*b;
		return c;
	}
	public static int div() {
		int a=10;
		int b=20;
		int c=a/b;
		return c;
	}
	public static int modulus() {
		int a=10;
		int b=20;
		int c=a%b;
		return c;
	}
	
}
