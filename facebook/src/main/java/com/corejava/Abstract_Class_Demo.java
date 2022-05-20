package com.corejava;

// class is a collection of variables and methods
// object is instance of a class
// instance means combination of new and constructor
// what is out? it is object of print stream class and is static
// what is int? it is object of input stream class and is static

// what is abstract class? at least one abstract method  
// if a class is having abstract method i.e method without body, then class also will be abstract(incomplete)
// we cannot create object of an abstract class
// if we want to restrict other classes to create object of my class, we have 2 approaches
	// 1. make your class abstract
	// 2. create private constructor
//declare you class abstract or create private constructor

public abstract class Abstract_Class_Demo {
	
	void add() {
		System.out.println("Add");
	}
	
	void sub() {
		System.out.println("Sub");
	}
	
	// function without body is abstract
	abstract void mult();

}

// if class is abstract, then how to use that class function which are having body like add and sub function in above example
// via child class

class AbstractChild extends Abstract_Class_Demo{
	void mult() {
		System.out.println("Multiply");
	}
	
	public static void main(String[] args) {
		
		AbstractChild ac = new AbstractChild();
		// if we have parent child relationship then child class object we can store inside parent class
		Abstract_Class_Demo acd = new AbstractChild();
		ac.add();
		acd.mult();
		acd.sub();
		
		
	}
	
	
	
	
}