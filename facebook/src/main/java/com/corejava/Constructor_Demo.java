package com.corejava;

// which package is default package in java? java.lang

// if developer will not write any constructor inside the class, then system will provide default constructor
// constructor will have the same name of class without return type.
// constructor always have the same name as class.
// constructor don't have return type like int, float, etc., but it can have specifiers like public, private, protected
// we can write more than one constructor, but with different parameters, this concept is known as constructor overloading

// javap - disassembler, coverts class file to java file

//object will be mother class by default
// parent child relation is called inheritance
public class Constructor_Demo extends Object{
	
	Constructor_Demo(){
		
	}
	
	int i;
	int j;
	
	Constructor_Demo(int i, int j){
		// this is pointer which will refer a current class object
		// example here variable of class like i and j we can call anywhere using this like this.i or this.j
		// this cannot be used inside static method
		this.i=i; // this will refer current class object
		this.j=j;
	}
	
	public void add() {
		System.out.println("addition is "+(i+j));
		System.err.println("addition is "+(i+j));
	}

	public static void main(String[] args) {
		
		Constructor_Demo c = new Constructor_Demo();
		Constructor_Demo c1 = new Constructor_Demo(3,4);
		
		c.add();
		c1.add();

	}

}
