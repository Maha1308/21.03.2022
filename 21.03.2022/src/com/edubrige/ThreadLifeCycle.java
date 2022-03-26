package com.edubrige;
class Myclass extends Thread{
	public void run()
	{

	for (int i=1;i<=5;i++) {
		System.out.println(i+" "+Thread.currentThread());
	}
}
}

public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		Myclass ob=new Myclass();
		Myclass ob1=new Myclass();
		System.out.println("state of thread ob"+ob.isAlive());
		System.out.println("state of thread ob"+ob1.isAlive());
		ob.start();
		System.out.println("state of thread ob"+ob.isAlive());
		System.out.println("state of thread ob"+ob1.isAlive());
		ob.join();
		System.out.println("state of thread ob"+ob.isAlive());
		ob1.start();
		System.out.println("state of thread ob"+ob1.isAlive());
		System.out.println("state of thread ob"+ob.isAlive());
	}
		
	}


