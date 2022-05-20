package com.facebook;

public class Hello {
	//global variable
	int i; //instance variable
	static int k; //class variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j=9; //local variable
		System.out.println(j);
		
		// for float we have to write 'f'
		//float f = 2.3;
		//float f = 2.3f;
		
		//NS-->S via object
		Hello h = new Hello();
		System.out.println(h.i);
		
		//S-->NS or S direct
		System.out.println(k);
		
		System.out.println("Welcome");
		System.out.println("Hello");
		System.out.println("Muneeswar");
		
		

	}

}


//note: boolean data type cannot be type casted
// why wrapper class? to convert data type into object
// why convert primitive to object? - because we are using object everywhere

//1. primitive data type - 8 - byte, short, int, long, float, double, char, boolean
// byte - 1 byte
// short - 2 bytes
// int - 4 bytes
// long - 8 bytes
// float - 4 bytes
// double - 8 bytes
// char - 16 bit uni code
// boolean - 1 bit
// convert interger to byte (int-->byte) to save memory, this processor is called type casting.
// converting lowering data type to higher is meaningless - implicit type casting eg: int i = 10; long i = i*20;
// converting higher data type to lower is explicit type casting eg: long l = 10; int i = (int) i*20;
// wrapper classess - convert primitive data type to object. why convert primitive to object? - because we are using object everywhere


//2. reference data type - object of any class comes under reference
//Byte - 1 byte - value "0"
//Short - 2 bytes - value "0"
//Integer - 4 bytes - value "0"
//Long - 8 bytes - value "0L"
//Float - 4 bytes - value "0.0f"
//Double - 8 bytes - value "0.0d"
//Character - 16 bit uni code - value "null"
//Boolean - 1 bit - value "false"






