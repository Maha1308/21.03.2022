package com.java;
class bank{
	static int amount=10000;
	synchronized void deposit(int damt) {
		System.out.println("deposit method");
		amount=amount+damt;
		System.out.println("amount after deposit "+amount);
		System.out.println("deposit is completed");
		notify();
	}
	synchronized void withdraw(int wamt) throws InterruptedException{
		System.out.println("withraw method");
		if(wamt>amount) {
			wait();
		}
		amount=amount-wamt;
System.out.println("Amount after withdraw  "+amount);
	}
}

public class BankApplication {

	public static void main(String[] args) {
	bank ob = new bank();
	new Thread() {
		public void run()
		{
			ob.deposit(500000);}
		}.start();
		new Thread() {
			public void run() {
			try {
				ob.withdraw(30000);
			}catch(InterruptedException e) {
				e.printStackTrace();}}
		
	}.start();
	}
}
	
	
	


