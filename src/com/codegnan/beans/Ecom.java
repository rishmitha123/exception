package com.codegnan.beans;

import com.codegnan.exception.InsufficientBalanceException;

public class Ecom {
	public int buyProduct(int balance , int cost) throws InsufficientBalanceException {
			int updatedBal;
			try {
				if(balance<cost) {
					InsufficientBalanceException e=new InsufficientBalanceException("your balance is too low "+balance+" to buy the product at the cost "+cost);
					throw e;
				}
			updatedBal=balance-cost;
			}
			finally {
				System.out.println("calculation completed");
			}
			
			
			
			return updatedBal;
			
		}


}
