package com.entities;

import javax.persistence.*;
import java.util.*;
@Entity
public class Department {

	
	@Id
	private String departmentName;
	
	@OneToMany(mappedBy="employeeId")
	List<Employee> employeeList;
	
	public Department() {}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	
}
