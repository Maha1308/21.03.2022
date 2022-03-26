package com.java;
class myclass extends Thread{
	int total;
 public void run()
 {
	 System.out.println("Inside run");
	 synchronized(this) {
		 for (int i=1;i<=10;i++) {
			 total=total+i;
		 }
			 notify();
		 }
	 }
 }


public class Wait_notify {

	public static void main(String[] args) {
	myclass ob=new myclass();
	ob.start();	

	synchronized(ob) {
		try {
			System.out.println("before wait");
		ob.wait();
		System.out.println("after wait");
		System.out.println("total="+ob.total);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	}

}
