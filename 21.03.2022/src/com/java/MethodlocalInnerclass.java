package com.java;
class myouterclass{
	void method() {
		System.out.println("outerclass method");
		class mylocalclass{
			int n;
			void innermethod() {
				System.out.println("innerclass method");
			}
		}
		mylocalclass iob=new mylocalclass();
		iob.innermethod();
	}
}
public class MethodlocalInnerclass {

	public static void main(String[] args) {
		myouterclass ob=new myouterclass();
		ob.method();

	}

}
