package com.edubrige;
class table{
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+n*i);
		}
	}
}

	

public class Mainapp {

	public static void main(String[] args) {
		table t=new table();
		Thread tob=new Thread()
		{
			public void run()
			{
				System.out.println("runmethod");
				t.printTable(5);
			}
		};
		Thread tob1=new Thread()
				{
			public void run()
			{
				System.out.println("run method");
				t.printTable(10);
				
			}
				};
				tob1.start();

	}

}
