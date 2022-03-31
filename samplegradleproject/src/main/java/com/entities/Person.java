package com.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import java.util.List;
@Entity
@Table(name="PersonTable")
public class Person {
	
	  @Id
	  private int personId;
	  
	  @Column(name="FullName")
	  private String personName;
	  
	  @Column(name="PersonAddress")
	  private String address;
	  
	  private int age;
	  
	  private String emailId;
	
	  
	
	  
	  
	  public Person()
	  {
		  
	  }
	  
	  
	

	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	  
	  

}
