package com.operation;

import javax.persistence.*;

import com.entities.CustomerKey;
import com.entities.Customer;
public class CustomerApp {
	
	public static void main(String args[])
	{
		EntityManagerFactory efac=Persistence.createEntityManagerFactory("ItemPU");
		EntityManager emanager=efac.createEntityManager();
		CustomerKey key=new CustomerKey();
		key.setCustomerName("Edgar Rice");
		key.setCustomerEmail("edgar47@gmail.com");
		key.setDigitalSignature("#ccFF998345$$");
		
		Customer obj=new Customer();
	     obj.setCustomerKey(key);
	     obj.setAddress("North Wellingnton street 23");
	     obj.setPhoneNo("9988333353");

	     emanager.getTransaction().begin();
	     emanager.persist(obj);
	     emanager.flush();
	     emanager.getTransaction().commit();
	}

}
