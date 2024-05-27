package com.codegnan.app;


import java.util.Scanner;

public class Demo_01{
	public static void main(String[] args) 
	{
//		logger.debug("debug massage");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number :");
		int num1=sc.nextInt();
		System.out.print("Enter second number :");
		int num2=sc.nextInt();
		int quot=num1/num2;
		System.out.println("Result :"+quot);
		System.out.println("end of program");
		

	}

}
