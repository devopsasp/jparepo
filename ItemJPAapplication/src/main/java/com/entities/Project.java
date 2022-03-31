package com.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class Project {

	@Id
	private String projectId;
	private String projectDescription;
	
	@ManyToMany
	private List<Employee> employeeList;

   public Project() {}

public String getProjectId() {
	return projectId;
}

public void setProjectId(String projectId) {
	this.projectId = projectId;
}

public String getProjectDescription() {
	return projectDescription;
}

public void setProjectDescription(String projectDescription) {
	this.projectDescription = projectDescription;
}

public List<Employee> getEmployeeList() {
	return employeeList;
}

public void setEmployeeList(List<Employee> employeeList) {
	this.employeeList = employeeList;
}
   
   
}
