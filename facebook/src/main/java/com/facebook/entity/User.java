package com.facebook.entity;

public class User {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String password;
	private String email;
	private String address;

}

// access specifiers - public, private, default, protected
// low coupled means having mediator
// why setter and getter methods? to maintain low coupling to increase performance
// dto pattern - data transfer object
// why to transfer data using object only? because of dto (data transfer object) design pattern
// gof - gang od four design pattern to create projects, dto is a type of gof