package com.entities;
import java.io.*;
public class PersonKey  implements Serializable{

	private String personName;
	private String personEmail;
	
	   public PersonKey()
	   {
		   
	   }

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
	   
	   
	
	
}
