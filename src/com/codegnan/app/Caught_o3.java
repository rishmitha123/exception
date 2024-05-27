package com.codegnan.app;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Caught_o3 {
	static Logger logger =Logger.getLogger(Caught_o3.class);

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your account balance");
		int num1=sc.nextInt();
		System.out.println("enter cost of the product");
		int num2=sc.nextInt();
		try {
			if(num1<num2) {
				ArithmeticException ae=new ArithmeticException("your account balance " +num1+ " is low to buy at the cost of  "+num2);
				throw ae;
			}
			int res=num1-num2;
			System.out.println("remaining balance in account :"+res);
		}
		catch(ArithmeticException e){
			logger.error(e);
		}


				
		

	}

}
