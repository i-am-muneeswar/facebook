package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.*;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k = "y";
		
		while (k.equals("y")) {
		System.out.println("********** Main Menu **********");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view All profile");
		System.out.println("press 7 to login profile");
		
		Controller m = new Controller();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice:");
		
		int d = s.nextInt();
			switch(d) {
				case 1:
					m.createProfile();
					break;
				case 2:
					m.viewProfile();
					break;
				case 3:
					m.deleteProfile();
					break;
				case 4:
					m.editProfile();
					break;
				case 5:
					m.searchProfile();
					break;
				case 6:
					m.allProfiles();
					break;
				case 7:
					m.ProfileLogin();
					break;
				default:
					System.out.println("Out of range");
			}
		System.out.println("Press y to continue");
		k = s.next();
		}

	}
	
}

