package com.abd.cc.com;

public class CurrencyConverter5 {
	int exchangeRates[] = {63,3,3,595,18,107,2};
	int rupee=63;
	int dirham=3;
	int real=3;
	int chilean_peso=595;
	int mexican_peso=18;
	int _yen=107;
	int $australian=2;
	void printCurrency()
	{
		System.out.println("rupee:"+exchangeRates[0]);
		System.out.println("dirham:"+exchangeRates[1]);
		System.out.println("real:"+exchangeRates[2]);
		System.out.println("chilean_peso:"+exchangeRates[3]);
        System.out.println("mexican_peso:"+exchangeRates[4]);
		System.out.println("_yen:"+exchangeRates[5]);
		System.out.println("$australian:"+exchangeRates[6]);
	}
	public static void main(String[] args)
	{
		CurrencyConverter5 cc=new CurrencyConverter5();
		cc.printCurrency();
	}
}




















