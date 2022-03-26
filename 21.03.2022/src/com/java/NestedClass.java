package com.java;
class outerclass
{
	int i;
	private class Innerclass{
		int varinner;
		Innerclass(){
			varinner=10;
		}
		void method_inner() {
			System.out.println("Inner class method"+varinner);
			System.out.println("outer class variable i"+i);
		}
	}
	void outer_method() {
		Innerclass ob=new Innerclass();
		ob.method_inner();
	}
}
public class NestedClass {

	public static void main(String[] args) {
		outerclass ob=new outerclass();
		ob.outer_method();
	}

}
