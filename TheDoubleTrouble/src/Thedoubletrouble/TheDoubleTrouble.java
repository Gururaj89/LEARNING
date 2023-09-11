package Thedoubletrouble;

import java.util.Scanner;

public class TheDoubleTrouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to Doubled");
        int num=sc.nextInt();
        sc.close();
        System.out.println(doubleThenumber(num));
        
		

	}
    	public static int doubleThenumber(int num) {
		return num*2;

	}

	}


