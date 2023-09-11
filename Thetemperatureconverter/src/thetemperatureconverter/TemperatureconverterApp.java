package thetemperatureconverter;

import java.util.Scanner;

public class TemperatureconverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Temprature in Degree-F");
        double f=scan.nextDouble();
        Temperatureconverter  tempratureconvertor=new Temperatureconverter();
         double tempincelcis=tempratureconvertor.convertFahrenheitToCelsius(f);
         System.out.println(tempincelcis);

	}

}
