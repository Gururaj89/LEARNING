package methodsinjava.program;

public class TypeonePro {

	public static void main(String[] args) {
		add();
        sub();
        multi();
        divi();
        modlus();
	}
	public static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void sub() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	public static void multi() {
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println(c);
}
	public static void divi() {
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
	public static void modlus() {
		int a=10;
		int b=20;
		int c=a%b;
		System.out.println(c);
	}
}