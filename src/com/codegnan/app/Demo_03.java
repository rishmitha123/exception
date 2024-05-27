package com.codegnan.app;

import java.util.Scanner;

public class Demo_03 {

	public static void main(String[] args) {
		int [] marks=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks below :");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("marks are");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("enter the position you want");
		int pos=sc.nextInt();
		System.out.println("marks at given position are :"+marks[pos]);
		System.out.println("end of program");

	}

}
