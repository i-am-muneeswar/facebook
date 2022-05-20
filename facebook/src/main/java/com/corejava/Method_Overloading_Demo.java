package com.corejava;

// java cannot have multiple inheritance

public class Method_Overloading_Demo {
	
	public int add(int i, int j){
		return i+j;
	}
	
	public float add(float i, float j){
		return i+j;
	}

	// if a class has two methods with same name but different parameter is known as method overloading
	
	public static void main(String[] args) {
		
		Method_Overloading_Demo mod = new Method_Overloading_Demo();
		int i = mod.add(3, 4);
		float f = mod.add(2.3f, 3.4f);
		System.out.println(i+" "+f);
		
		ChildClass cc = new ChildClass();
		int p = cc.add(2, 3);
		System.out.println("The result is "+p);

	}

}


// method overriding
// same method with same parameters is present in both child and parent class alwys chilkd class will overrride parent class
class ChildClass extends Method_Overloading_Demo{
	
	public int add(int i, int j){
		
		i = i*6;
		j = j*7;
		return i+j;
	}
	
}


