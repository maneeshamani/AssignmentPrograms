package com.abc.money.com;

public class MoneyTransferService1 {
	 CurrencyConverter1 cc = new CurrencyConverter1();
		
     double computeTransferAmount(int countryIndex, double amount) {
             return cc.computeTransferAmount(countryIndex, amount);		
     }
	
     double computeTransferFee(int countryIndex, double amount) {
             double transferAmount = computeTransferAmount(countryIndex, amount);
             double transferFee = transferAmount * 0.02;
             return transferFee;
     }
	
     public static void main(String[] args) {
             MoneyTransferService1 transferService1 = new MoneyTransferService1();
		
             double transferAmount = transferService1.computeTransferAmount(0, 1000);
             double transferFee = transferService1.computeTransferFee(0, 1000);
		
             System.out.println("transferAmount: " + transferAmount);
             System.out.println("transferFee: " + transferFee);
     }

}