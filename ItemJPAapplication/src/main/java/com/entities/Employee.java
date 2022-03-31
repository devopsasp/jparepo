package com.entities;
import javax.persistence.*;
import java.util.*;
@Entity
public class Employee {

	@Id
	 private int employeeId;
	 private String employeeName;
	 private String emailId;
	 
	 @OneToOne(cascade=CascadeType.ALL)
     private Task task;
	 
	 
	 
	
	 
	 @ManyToOne
	 private Department demartment;
	 
	 
	 
	 
	 
	public Department getDemartment() {
		return demartment;
	}

	public void setDemartment(Department demartment) {
		this.demartment = demartment;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Employee() {}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	 
	 
	
}
