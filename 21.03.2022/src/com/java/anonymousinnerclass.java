package com.java;
abstract class myabstract{
	public abstract void add();
	public abstract void sub();
}
public class anonymousinnerclass {

	public static void main(String[] args) {
		myabstract ob= new myabstract()
				{
			public void add() {
				System.out.println("add method");
			}
				public void sub()
				{
					System.out.println("subract method");
				}
		
	};
	ob.add();
	ob.sub();

}
}
