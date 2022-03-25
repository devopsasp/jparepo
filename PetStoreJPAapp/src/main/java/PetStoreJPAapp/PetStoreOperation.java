package PetStoreJPAapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
public class PetStoreOperation {
	
private EntityManager manager;

   public PetStoreOperation()
   {
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("PetPU");
	   
	   manager=emf.createEntityManager();
   }
   
   
     public void savePetStore(PetStore petstore,Person person)
     {
    	 
    	 manager.getTransaction().begin();
    	 person.setPetstore(petstore);
    	 petstore.setManager(person);
    	 manager.persist(petstore);
    	 manager.flush();
    	 manager.getTransaction().commit();
    	   
    	 
    	 
     }
   
   
   public void savePet(Pet pet)
   {
	   manager.getTransaction().begin();
	   manager.persist(pet);
	   manager.flush();
	   manager.getTransaction().commit();
   }
	
   
   
   public Pet findPet(int id)
   {
	    Pet pet=manager.find(Pet.class,id);
	    return pet;
   }
   
   
   
   public boolean updatePet(int id,Pet pet)
   {
	   Pet pet_to_update=findPet(id);
	   pet_to_update.setPetName(pet.getPetName());
	   pet_to_update.setPetType(pet.getPetType());
	   pet_to_update.setAge(pet.getAge());
	  
	    manager.getTransaction().begin();
	    manager.merge(pet_to_update);
         manager.flush();
	    manager.getTransaction().commit();
	   return true;
   }
   
   
   public boolean removePet(int id)
   {
	   manager.getTransaction().begin();
	   
	   Pet pet=findPet(id);
	   manager.remove(pet);
	   manager.flush();
	   manager.getTransaction().commit();
	   
	   
	   return true;
	  
   }
   
   
   
   public void ViewAllPets()
   {
	     //select * from Pet
	     String query="select p from Pet p ";
	     Query petquery=manager.createQuery(query);
	     List<Pet> petlist=petquery.getResultList();
	     for(Pet p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p.getPetName());
	    	 System.out.println("Pet Type "+p.getPetType());
	    	 System.out.println("Pet Age "+p.getAge());
	        System.out.println("*****************************");
	     }
	     
	    
   }
   
   public void ViewAllPetNames()
   {
	     //select * from Pet
	     String query="select p.petName,p.age from Pet p ";
	     Query petquery=manager.createQuery(query);
	     List<Object[]> petlist=petquery.getResultList();
	     for(Object[] p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p[0]);
	    	 System.out.println("Pet Age "+p[1]);
	    	
	        System.out.println("*****************************");
	     }
	     
	    
   }
   
   
   public void ViewAllPetsByAge(int age)
   {
	     //select * from Pet where age > 3
	     String query="select p from Pet p where p.age > :petage ";
	     Query petquery=manager.createQuery(query);
	     petquery.setParameter("petage", age);
	     List<Pet> petlist=petquery.getResultList();
	     for(Pet p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p.getPetName());
	    	 System.out.println("Pet Type "+p.getPetType());
	    	 System.out.println("Pet Age "+p.getAge());
	        System.out.println("*****************************");
	     }
	     
	    
   }
   
   
   
   
   public void ViewAllPetsThatAreNot(String pettype)
   {
	     //select * from Pet where age > 3
	     String query="select p from Pet p where p.petType <> :petType ";
	     Query petquery=manager.createQuery(query);
	     petquery.setParameter("petType", pettype);
	     List<Pet> petlist=petquery.getResultList();
	     for(Pet p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p.getPetName());
	    	 System.out.println("Pet Type "+p.getPetType());
	    	 System.out.println("Pet Age "+p.getAge());
	        System.out.println("*****************************");
	     }
	     
	    
   }
   
   
   
   public void ViewAllPetsByNameAndAge(String name,int age)
   {
	     //select * from Pet where age > 3
	     String query="select p from Pet p where p.petName=?1 and p.age > ?2 ";
	     Query petquery=manager.createQuery(query);
	     petquery.setParameter(1, name);
	     petquery.setParameter(2,age);
	     List<Pet> petlist=petquery.getResultList();
	     for(Pet p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p.getPetName());
	    	 System.out.println("Pet Type "+p.getPetType());
	    	 System.out.println("Pet Age "+p.getAge());
	        System.out.println("*****************************");
	     }
	     
	    
   }
   
   
   
   
   
   
   public void ViewByNameOrder()
   {
	     //select * from Pet order by petName
	     String query="select p from Pet p order by p.petName  DESC";
	     Query petquery=manager.createQuery(query);
	     
	     List<Pet> petlist=petquery.getResultList();
	     for(Pet p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p.getPetName());
	    	 System.out.println("Pet Type "+p.getPetType());
	    	 System.out.println("Pet Age "+p.getAge());
	        System.out.println("*****************************");
	     }
	     
	    
   }
   
   
   
   
   
   
   public void ViewAllPetsGroupByType()
   {
	     //select * from Pet where age > 3
	     String query="select count(p.petName),p.petType from Pet p group by p.petType ";
	     Query petquery=manager.createQuery(query);
	    
	     List<Object[]> petlist=petquery.getResultList();
	     for(Object[] p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Count "+p[0]);
	    	 System.out.println("Pet Type "+p[1]);
	        System.out.println("*****************************");
	     }
	     
	    
   }
   
   
   
   public void  ViewNamedQuery(String query)
   {
	   
	   Query petquery=manager.createNamedQuery(query);
	
	   List<Pet> petlist=petquery.getResultList();
	     for(Pet p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p.getPetName());
	    	 System.out.println("Pet Type "+p.getPetType());
	    	 System.out.println("Pet Age "+p.getAge());
	        System.out.println("*****************************");
	     }
	
	   
	   
   }
   
   
   public void UpdatePet(int age ,int id)
   {
	   manager.getTransaction().begin();
	   Query query=manager.createNamedQuery("pet.update");
	   query.setParameter("petage", age);
	   query.setParameter("petid", id);
	   int i=query.executeUpdate();
	   manager.flush();
	   manager.getTransaction().commit();
	   System.out.println("rows updated "+i);
	   
	   
	   
	   
   }
   
   
   
   public void PetStoreAndPetQuery()
   {
	   String query ="Select p from PetStore p where p.manager.personName='Jason Todd'";
	   Query petquery=manager.createQuery(query);
	 
	     List<PetStore> petlist=petquery.getResultList();
	     for(PetStore p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p.getPetStoreAddress());
	    	 System.out.println("Pet Type "+p.getPetStoreName());
	    	 System.out.println("Pet Age "+p.getPetStoreId());
	    	 System.out.println("Pet Store Manager name "+p.getManager().getPersonName());
	        System.out.println("*****************************");
	     }
	   
	   
   }
   
   
   
   
   
   
   
   
   public void PetStoreAndViewPetQuery(Pet pet)
   {
	   String query ="Select p from PetStore p where :petobj MEMBER OF p.petList";
	   Query petquery=manager.createQuery(query);
	   petquery.setParameter("petobj", pet);
	 
	     List<PetStore> petlist=petquery.getResultList();
	     for(PetStore p:petlist)
	     {
	    	 System.out.println("***************************");
	    	 System.out.println("Pet Name "+p.getPetStoreAddress());
	    	 System.out.println("Pet Type "+p.getPetStoreName());
	    	 System.out.println("Pet Age "+p.getPetStoreId());
	    	 System.out.println("Pet Store Manager name "+p.getManager().getPersonName());
	    	 for(Pet plist : p.getPetList())
	    	 {
	    		 System.out.println(plist.getPetName());
	    		 System.out.println(plist.getAge());
	    	 }
	        System.out.println("*****************************");
	     }
	   
	   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

}
