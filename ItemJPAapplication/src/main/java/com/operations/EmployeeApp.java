package com.operations;
import javax.persistence.*;
import java.util.*;
import com.entities.*;
public class EmployeeApp {
	public static void main(String [] args)
	{
		EntityManagerFactory efac=Persistence.createEntityManagerFactory("ItemPU");
		EntityManager emanager=efac.createEntityManager();
		emanager.getTransaction().begin();
		Employee e=new Employee();
		e.setEmployeeId(1);
		e.setEmployeeName("Peter Jones");
		e.setEmailId("peter@gmail.com");
		Employee e1=new Employee();
		e1.setEmployeeId(2);
		e1.setEmployeeName("Jacob Marting");
		e1.setEmailId("jacob@gmail.com");
		
	   Employee e2=new Employee();
	   e2.setEmployeeId(3);
	   e2.setEmployeeName("Erric Maze");
	   e2.setEmailId("errice@gmail.com");
	  
		
	   
	   Department department=new Department();
	   department.setDepartmentName("Training");
	   List<Employee> employeelist=new ArrayList();
	   employeelist.add(e);
	   employeelist.add(e1);
	   employeelist.add(e2);
	   department.setEmployeeList(employeelist);
	   
		
		Task task=new Task();
	  
		task.setTaskId(1);
	   task.setTaskName("processing chemical");
	   task.setTaskDescription("checking chemicals for preservative");
	   task.setEmployee(e);
	   e.setTask(task);
	   
	    e.setDemartment(department);

	    e1.setDemartment(department);
	    e2.setDemartment(department);
	    
	    
	    Project project1=new Project();
	    project1.setProjectId("P001");
	    project1.setProjectDescription("Coffee research project 1");
	    
	    Project project2=new Project();
	    project2.setProjectId("P002");
	    project2.setProjectDescription("Chemical research for plants");
	    
	    
      List<Project> projectList=new ArrayList<Project>();
      projectList.add(project1);
     projectList.add(project2);	   
	    
     
      
      project1.setEmployeeList(employeelist);
      project2.setEmployeeList(employeelist);
	    
	   emanager.persist(e);
	   emanager.persist(e1);
	   emanager.persist(e2);
	   emanager.persist(department);
	   emanager.persist(project1);
       emanager.persist(project2);
	   emanager.flush();
	   emanager.getTransaction().commit();
	   
		
		
	}

}
