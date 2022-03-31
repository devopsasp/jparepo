package com.entities;
import javax.persistence.*;

@Entity
public class Task {
	@Id
	private int taskId;
	private String taskName;
	private String taskDescription;
	
	@OneToOne
   private	Employee employee;
	
	public Task() {}
	
	

	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	

}
