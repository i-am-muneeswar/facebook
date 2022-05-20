package com.corejava;

// super should be first part of the constructor
// super is used to call parent class constructor, using super we can maintain constructor chaining
// we cannot use this and super in static
// super is used to call parent constructor and this is used to call current class constructor
// super is used to call class, constructor and variable
class A {
	
	int i=7;
	void ss(){
		System.out.println("Hello");
	}
	
	A(){
		System.out.println("A");
	}
}

class B extends A{
	B(){
		super();
		System.out.println("B");
		super.ss();
		System.out.println(super.i);
	}
}

class C extends B{
	C(){
		System.out.println("C");
	}
}

public class Constructor_Chaining_Demo {

	public static void main(String[] args) {
		new C();
	}

}
