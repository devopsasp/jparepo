/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PetStoreJPAapp;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    
        
    
    
      public static void main(String args[])
      {
    	  System.out.println("********************");
    	  
    	  PetStoreOperation operation=new PetStoreOperation();
    	  
    	  Pet pet1=new Pet();
    	  pet1.setPetName("Willy");
    	  pet1.setPetType("Dog");
    	  pet1.setAge(3);
    	  
    	  Pet pet2=new Pet();
    	  pet2.setPetName("Jerry");
    	  pet2.setPetType("Goat");
    	  pet2.setAge(4);
    	  
    	  Pet pet3=new Pet();
    	  pet3.setPetName("Milly");
    	  pet3.setPetType("Gold Fish");
    	  pet3.setAge(2);
    	  
    	  
    	  
    	  Pet pet4=new Pet();
    	  pet4.setPetName("Harry");
    	  pet4.setPetType("Cat");
    	  pet4.setAge(2);
    	  
    	  Pet pet5=new Pet();
    	  pet5.setPetName("Janice");
    	  pet5.setPetType("Cat");
    	  pet5.setAge(3);
    	  
    	  Pet pet6=new Pet();
    	  pet6.setPetName("Sam");
    	  pet6.setPetType("Donkey");
    	  pet6.setAge(4);
    	  
    	  
    	  
    	  PetStore petstore=new PetStore();
    	  
    	  pet1.setPetstore(petstore);
    	  pet2.setPetstore(petstore);
    	  pet3.setPetstore(petstore);
    	  pet4.setPetstore(petstore);
    	  pet5.setPetstore(petstore);
    	  pet6.setPetstore(petstore);
    	  
List<Pet> petlist=new ArrayList();
    	  
    	  
    	  petlist.add(pet1);
    	  petlist.add(pet2);
    	  petlist.add(pet3);
    	  petlist.add(pet4);
    	  petlist.add(pet5);
    	  petlist.add(pet6);
    	  
    	  
    	  petstore.setPetList(petlist);

    	  
    	  
    	  
    	  petstore.setPetStoreAddress("23 old street");
    	  petstore.setPetStoreName("Happy Pets PetStore");
    	  Person manager=new Person();
    	  
    	  
    	  
    	  
    	  manager.setAddress("55 new street");
    	  manager.setPersonName("Jason Todd");
    	  
    	  
    	  Customer customer1=new Customer();
    	  customer1.setCustomerName("Peter Err");
    	  customer1.setCustomerEmail("petererr@gmail.com");
          customer1.setAddress("23 new railway street");
          
          Customer customer2=new Customer();
          customer2.setCustomerName("Jason Roe");
          customer2.setCustomerEmail("jasonro22@gmail.com");
          customer2.setAddress("66 chat street");
          
          
    	    List<PetStore> petstorelist=new ArrayList();
    	    petstorelist.add(petstore);
    	    customer1.setPetStoreList(petstorelist);
    	    customer2.setPetStoreList(petstorelist);
    	  
    	     List<Customer> customerlist=new ArrayList();
    	     customerlist.add(customer1);
    	     customerlist.add(customer2);
    	  
    	  
    	  
    	  
    	  petstore.setCustomeList(customerlist);
    	  
    	  
    	  operation.savePetStore(petstore, manager);
    	  
    	  
    	 
    	  
    	  operation.PetStoreAndViewPetQuery(pet4);
    	  
    	  /*
          operation.savePet(pet1);
          operation.savePet(pet2);
          operation.savePet(pet3);
          operation.savePet(pet4);
          operation.savePet(pet5);
          operation.savePet(pet6);
          
          
          
          
          
          operation.UpdatePet(4,14);
          
          */
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
          
          
          
          
          
             	    
  
      }
}
