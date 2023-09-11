package temperatureConversion;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Conversion Tool! ");
        System.out.println("1.celsius to fahrenheit" );
        System.out.println("2.fahrenheit to celsius" );
       System.out.println("Enter the choice");
        int choice = scanner.nextInt();
        
        if(choice==1) {
        	System.out.println("Enter the celsius");
	        double celsius=scanner.nextDouble();
        	System.out.println("celsius to fahrenheit");
        double result=celsiusTofahrenheit(celsius);
        	System.out.println(result);
        }
        if(choice==2) {
        	System.out.println("Enter the fahrenheit");
 	       double fahrenheit=scanner.nextDouble();
        	System.out.println( "fahrenheit to celsius");
        	double result=fahrenheitTocelsius(fahrenheit);
	        	System.out.println(result);
        }

}
    public static double celsiusTofahrenheit(double celsius) {
	return (celsius *9/5)+32;
}
    public static double fahrenheitTocelsius(double fahrenheit ) {
	return (fahrenheit-32)*5/9;
}

	}


