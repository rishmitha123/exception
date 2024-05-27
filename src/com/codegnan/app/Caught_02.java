package com.codegnan.app;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Caught_02 {
	static Logger logger=Logger.getLogger(Caught_02.class);

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number :");
		int n1=sc.nextInt();
		System.out.println("enter second number :");
		int n2=sc.nextInt();
		try {
		int res=calc(n1,n2);
		System.out.println("result :"+res);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			logger.error(e);
		}
		System.out.println("end of main");

	}
	public static int calc(int num1,int num2) {
		int res;
		try {
		res=num1/num2;
		}
		finally {
		System.out.println("end of calc method");
		}
		return res;
	}

}
