/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package petstoreapp;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManager;

import com.PetStore;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    
    //private static EntityManager entityManager;
    public static void main(String args[])
    {
    	System.out.println("###########################");
    	System.out.println("Java Persistence API");
    	System.out.println("########################");
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("PetPU");
    	EntityManager entityManager=emf.createEntityManager();
    	PetStore petstore=new PetStore();
    	
    	petstore.setPetStoreName("My Happy Pet Store Chennai");
    	petstore.setAddress("23 old baker street");
    	entityManager.getTransaction().begin();
    	entityManager.persist(petstore);
    	entityManager.flush();
    	entityManager.getTransaction().commit();
    	
    	
    	
    	
    }
    
}