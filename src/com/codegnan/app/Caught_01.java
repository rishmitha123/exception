package com.codegnan.app;

import java.util.Scanner;

public class Caught_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number :");
		int num1=sc.nextInt();
		System.out.print("Enter second number :");
		int num2=sc.nextInt();
		try {
		int quot=num1/num2;
		System.out.println("Result :"+quot);
		}
		catch(ArithmeticException e) {
			System.out.println("exception thrown"+e);
		}
		System.out.println("end of program");
		


	}

}
