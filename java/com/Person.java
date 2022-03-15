package com;
import javax.persistence.*;
import java.io.*;

public class Person implements Serializable {
	 
	 private String personName;
	 private String address;
	 
	 
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, String address) {
		super();
		this.personName = personName;
		this.address = address;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	 
	

}
