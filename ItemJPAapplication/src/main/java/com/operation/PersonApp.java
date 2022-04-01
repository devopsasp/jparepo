package com.operation;
import javax.persistence.*;
import com.entities.*;
public class PersonApp {

	public static void main(String[] args) {
		
		
		EntityManagerFactory efac=Persistence.createEntityManagerFactory("ItemPU");
		EntityManager em=efac.createEntityManager();
		
		PersonKey key=new PersonKey();
		
		key.setPersonName("Peter James");
		key.setPersonEmail("peterjames23@gmail.com");
		
		
		Person person=new Person();
		person.setPersonEmail(key.getPersonEmail());
		person.setPersonName(key.getPersonName());
		
		person.setAddress("23 old baker street");
		
		em.getTransaction().begin();
		em.persist(person);
		em.flush();
		em.getTransaction().commit();
		
		// TODO Auto-generated method stub

	}

}
