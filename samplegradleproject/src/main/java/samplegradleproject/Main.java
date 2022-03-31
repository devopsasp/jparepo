package samplegradleproject;
import javax.persistence.EntityManagerFactory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.entities.Customer;
import com.entities.Item;
import com.entities.Person;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*************************");
		System.out.println("JPA Application");
		System.out.println("************************");
		
		
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("SamplePU");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		/*Person person=new Person();
		person.setPersonId(1);
		person.setPersonName("Edgar Mathew");
		person.setAddress("23 old street");
		person.setEmailId("person@gmail.com");
		person.setAge(23);
		*/
		/*Customer obj=new Customer();
		obj.setCustomerId(1);
		obj.setCustomerName("Peter");
		obj.setAge(30);
		obj.setEmailId("peter@gmail.com");
		obj.setPhoneNo("999333334");
		obj.setAddress("23 old baker street");
		*/
		
		Item obj=new Item();
		obj.setItemId(1);
		obj.setItemName("Oranges");
		obj.setItemPrice(20);
		try {
			File f=new File("f://fruit//orange.jpg");
			byte[] bt=new byte[(int)f.length()];
		    FileInputStream fs=new FileInputStream(f);
		    fs.read(bt);
		    System.out.println(bt);
		   obj.setItemImage(bt);
		   
		}
		catch(Exception e)
		{
			
		}
		entityManager.getTransaction().begin();
		
		entityManager.persist(obj);
		
		entityManager.flush();
		
		entityManager.getTransaction().commit();
		
		
		
		
		
		
		
		
		
		
	}

}
