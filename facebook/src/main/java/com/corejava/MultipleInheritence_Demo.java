package com.corejava;

// modifiers - static, final, abstract
// specifiers - public, private, protected, default
// we can use all these modifiers and specifiers with inner class and methods
// class be only - public default abstract final

// if a class will be final then it will not be able to create child class
// if method is final in a class we cannot override it
// your class will never be private and static
class D{
	
}


// all methods of an interface will be abstract and public by default
// by default variable of an interface will be public, static and final

interface E{
	int i=9;
	void add();
}

// if we will use interface with class using implements, then we have to write body for all the  methods of an interface
// using interface we can implement using multiple inheritance
// to maintain low coupling between 
// low coupling is via mediator

// we can create low coupling between layers, so that performance of layers will increase in project 

public class MultipleInheritence_Demo extends D implements E {

	public static void main(String[] args) {

	}

	public void add() {
		
	}

}
