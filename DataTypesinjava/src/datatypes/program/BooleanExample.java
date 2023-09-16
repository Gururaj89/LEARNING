package datatypes.program;

import java.util.Scanner;

public class BooleanExample {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Light is on");
	boolean isLighton =scan.nextBoolean();
	System.out.println(" Light is on ? " + isLighton);
	System.out.println("Light is off");
	scan.nextLine();
	boolean isLightoff =scan.nextBoolean();
	System.out.println(" Light is off ? " + isLightoff);

	}



}
