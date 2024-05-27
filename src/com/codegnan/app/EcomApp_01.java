package com.codegnan.app;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.codegnan.beans.Ecom;
import com.codegnan.exception.InsufficientBalanceException;

public class EcomApp_01 {
	static Logger logger=Logger.getLogger(EcomApp_01.class);


	public static void main(String[] args) {
		Ecom ecom=new Ecom();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your account balance");
		int bal=sc.nextInt();
		System.out.println("enter the cost of product");
		int cost=sc.nextInt();
		try {
		int uBal=ecom.buyProduct(bal, cost);
		System.out.println("after buying the updated balance is "+uBal);
		}
		catch(InsufficientBalanceException e) {
			logger.error(e);
		}
	}
		
		




}
