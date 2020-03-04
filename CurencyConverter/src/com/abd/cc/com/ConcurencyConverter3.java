package com.abd.cc.com;
import java.util.Scanner;

public class ConcurencyConverter3 {
	int rupee=63;
	int dirham=3;
	int real=3;
	int chilean_peso=595;
	int mexican_peso=18;
	int _yen=107;
	int $australian=2;
	Scanner scan=new Scanner(System.in);
	 int exchangeRates[] = new int[7];
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
		ConcurencyConverter3 cc=new ConcurencyConverter3();
		cc.printCurrency();
	}
}






















