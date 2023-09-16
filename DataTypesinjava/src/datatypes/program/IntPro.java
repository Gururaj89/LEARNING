package datatypes.program;

public class IntPro {

	public static void main(String[] args) {
		int a;
		a= 2147483647;
		System.out.println(a);
		System.out.println("===================");
		int b;
		b= -2147483648;
		System.out.println(b);
		System.out.println("===================");
      /* int c;
		 c= -2147483649; //underflow
	  */
		/* int d;
		 d= +2147483648; //overflow
	  */
	}

}
