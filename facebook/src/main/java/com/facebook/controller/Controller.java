package com.facebook.controller;

import com.facebook.entity.*;

import java.util.*;

public class Controller {
	public void createProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = sc.next();
		
		System.out.println("enter your Password");
		String password = sc.next();
		
		System.out.println("enter your Email");
		String email = sc.next();
		
		System.out.println("enter your Address");
		String address = sc.next();
		
		User u = new User();
		
		System.out.println("Profile Created");
	}
	
	// above information controller layer want to transfer to service layer so how to transfer?
	// using object controller will transfer
	// object of which class?
	// object of entity class
	
	public void viewProfile() {
		System.out.println("Profile Viewed");
	}	
	
	public void deleteProfile() {
		System.out.println("Profile Deleted");
	}
	
	public void editProfile() {
		System.out.println("Profile Edited");
	}
	
	public void searchProfile() {
		System.out.println("Profile Searched");
	}
	
	public void allProfiles() {
		System.out.println("All Profiles are Viewed");
	}
	
	public void ProfileLogin() {
		System.out.println("Logged into Profile");
	}
}
