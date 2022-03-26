package com.edubrige;

public class Annoymousclass {

	public static void main(String[] args) {
		new Thread()
		{
			public void run()
			{
				System.out.println("run method");
			}
			}.start();
		Runnable rob=new Runnable()
				{
			public void run()
			{
				System.out.println("runnable run mentod");
			}
				};
				Thread tob1=new Thread(rob);
				tob1.start();

	}

}
