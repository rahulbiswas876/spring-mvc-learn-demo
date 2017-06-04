package com.rahul.springmvc;

import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

public class Customer {

	private String firstName;
	
	@NotNull
	@Size(min=1,message="is required")
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
