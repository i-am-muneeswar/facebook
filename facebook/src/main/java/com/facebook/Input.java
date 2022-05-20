package com.facebook;

import java.util.Scanner; // this library is not default needed to take input


public class Input {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //why scanner? To take input from user
		System.out.println("Enter first Number:");
		int i1 = s.nextInt();
		
		System.out.println("Enter Second Number:");
		int i2 = s.nextInt();
		
		System.out.println("Addition is:"+(i1+12));

	}

}
