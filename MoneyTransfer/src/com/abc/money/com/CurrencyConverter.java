package com.abc.money.com;

public class CurrencyConverter {
	double exchangeRates[] = {63,3,3,595,18,107,2};
	void printCurrencies() {

	System.out.println("rupee: " + exchangeRates[0]);

	System.out.println("chilean_peso: " + exchangeRates[1]);

	System.out.println("mexican_peso: " + exchangeRates[2]);

	System.out.println("_yen: " + exchangeRates[3]);

	System.out.println("$australian: " + exchangeRates[4]);

	}

	public static void main(String args[]){

	CurrencyConverter cc = new CurrencyConverter();

	cc.printCurrencies();

	}

	public double computeTransferAmount1(int countryIndex, double amount) {
		return 0;
	}

	public double computeTransferAmount(int countryIndex, double amount)
	{
		return 0;
	}

}