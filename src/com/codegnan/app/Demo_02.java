package com.codegnan.app;

import java.util.Scanner;

public class Demo_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number :");
		int n1=sc.nextInt();
		System.out.println("enter second number :");
		int n2=sc.nextInt();
		int res=calc(n1,n2);
		System.out.println("result :"+res);
		System.out.println("end of main");
	
	}
	public static int calc(int num1,int num2) {
		int res;
		res=num1/num2;
		System.out.println("end of calc method");
		return res;
	}

}
