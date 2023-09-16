package thetemperatureconverter.programing;

import java.util.Scanner;

public class TempratureconverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Temprature in Degree-F");
        double f=scan.nextDouble();
        Tempratureconverter tempratureconvertor=new Tempratureconverter();
         double tempincelcis=tempratureconvertor.convertFahrenheitToCelsius(f);
         System.out.println(tempincelcis);

	}

}
