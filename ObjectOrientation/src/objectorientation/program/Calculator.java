package objectorientation.program;

public class Calculator {
	int num1;
	int num2;  //inside the class//
	
	
	void add(){
		int result=num1+num2;
		System.out.println("The addition result is " +result);
	}
	void sub(){
		int result1=num1-num2;
		System.out.println("The Substraction result is " +result1);
	}
	void mul(){
		int result2=num1*num2;
		System.out.println("The Multiplication result is " +result2);
	}
	void div() {
		int result3=num1/num2;
		System.out.println("The Division is " +result3);
	}
}
