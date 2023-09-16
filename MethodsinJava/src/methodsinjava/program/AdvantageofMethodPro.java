package methodsinjava.program;

public class AdvantageofMethodPro {

	public static void main(String[] args) {
		greet();
        int a=10;
        int b=20;
        int result=add(a,b);
        System.out.println("The Addition Result is : " +result);
        sub(a,b);
        int result2=div(a,b);
        System.out.println("The  division result is " +result2);
        int result3=mod(a,b);
        System.out.println("The Percentage result is : " +result3);
        int result4=multi(a,b);
        System.out.println("The Multiplication Result is :" +result4);
        boolean result5=checkgreater(a,b);
        System.out.println("the Greater Then : "+result5);
	}
 
	public static void greet() {
		System.out.println("Hello World");
	}
	public static int add(int a,int b) {
		int c=a+b;
		return c;
		
	}
	public static void sub(int a,int b) {
		int c=a-b;
		System.out.println("The  Substraction Result is " +c);
	}
	public static int div(int m ,int n) {
		int c=m/n;
		return c;
	}
	public static int mod(int a,int b) {
	    int c=a%b;
		return c;
		
		
	}
	public static int multi(int a,int b) {
		int c=a*b;
		return c;
		
	}
	public static boolean checkgreater(int a,int b) {
		boolean c=a>b;
		return c;
	}
	
}
