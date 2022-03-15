package com;
import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeId implements Serializable{
	
	private int employeeId;
	private String employeeEmail;
	
	public EmployeeId()
	{
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	
	

}
