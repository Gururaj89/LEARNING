package bufferreadreader.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstPro {

	public static void main(String[] args) {
 BufferedReader reader =new BufferedReader (new InputStreamReader(System.in));
	 
	 try {
		 System.out.print("enter your name :");
		 String name = reader.readLine();
		 
		 System.out.print("enter your age :");
		 String ageStr = reader.readLine();
		 
		 int age =Integer.parseInt(ageStr);
		 System.out.print("Hello, "+name+"! you are "+age+ " years old.");
		 
	 }
	 catch (IOException e) {
		 System.out.print("enter your name");
	 }

}
}
