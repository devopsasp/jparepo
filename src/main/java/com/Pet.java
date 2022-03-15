package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pet {
	
	
     @Id
	private int petId;
	
	private String petName;
	
	private String petType;
	
	private int age;

	
	public Pet()
	{
		
	}
	
public Pet(int petId, String petName, String petType, int age) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petType = petType;
		this.age = age;
	}








	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}








	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", petType=" + petType + ", age=" + age + "]";
	}
	
	
	
	
}
