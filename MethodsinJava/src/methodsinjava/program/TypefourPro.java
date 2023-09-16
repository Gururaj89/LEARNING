package methodsinjava.program;

public class TypefourPro {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int result=add(a,b);
		System.out.println("The addition result is : " +result);
		int result1=sub(a,b);
		System.out.println("The Substraction result is : " +result1);
		int result2=multi(a,b);
		System.out.println("The Multiplication result is : " +result2);
		int result3=div(a,b);
		System.out.println("The Division result is : " +result3);
		int result4=mod(a,b);
		System.out.println("The Percentage result is : " +result4);
		}
	 
		public static int add(int a, int b) {
		
			int c=a+b;
			return c;
		}
		public static int sub(int a, int b) {
			
			int c=a-b;
			return c;
		}
        public static int multi(int a, int b) {
			
			int c=a*b;
			return c;
		}
        public static int div(int a, int b) {
			
     			int c=a/b;
     			return c;
     		} 
        public static int mod(int a, int b) {
			
 			int c=a%b;
 			return c;
 		} 
	}


