package com.entities;
import javax.persistence.*;
@Entity
@IdClass(PersonKey.class)
public class Person {
	
	@Id 
	private String personName;
	@Id 
	private String personEmail;
	
	private String address;
	
	public Person() {}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
