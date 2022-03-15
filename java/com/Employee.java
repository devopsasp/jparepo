package com;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class Employee {
	
	
	@EmbeddedId
	private EmployeeId id;
	private String employeeName;
	private String address;
	
	public Employee()
	{
		
	}

	public EmployeeId getId() {
		return id;
	}

	public void setId(EmployeeId id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
