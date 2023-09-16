package methodoverloading.program;

import java.util.Scanner;

public class SecondPro {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcom the pooja hotel........");
		System.out.println("=====================================");
		System.out.println("Menu order..... ");
		System.out.println("=====================================");
        bill();
        bill(2);
        bill("northindian");
        bill("Dosa",7);
	}
	public static void bill() {
		System.out.println("bill for teas is only 10rs");
		System.out.println("---------------------------");
	}
	public static void bill(int n) {
		System.out.println("bill for " +n+" idly is " +(n*30));
		System.out.println("-------------------------------");
	}
	public static void bill(String type) {
		System.out.println("bill for " +type+" food is 100 RS" );
		System.out.println("-------------------------------");
	}
   public static void bill(String type,int n) {
	   System.out.println("bill for " +n+" "+type+" "+"is " +(n*8));
	   System.out.println("------------------------------------");
	   
   }
}
