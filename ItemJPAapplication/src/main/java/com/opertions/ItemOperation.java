package com.opertions;
import com.entities.*;
import javax.persistence.*;
import java.util.List;
public class ItemOperation {
	
	  EntityManager entityManager;
	
	     public ItemOperation()
	     {
	    	 EntityManagerFactory entityFactory=
	    			 Persistence.createEntityManagerFactory("ItemPU");

	     
	     entityManager=entityFactory.createEntityManager();
	     
	     
	     }
	  
	
	     public void saveItem(Item item)
	     {
	    	 
	    	 entityManager.getTransaction().begin();
	    	 entityManager.persist(item);
	    	 entityManager.flush();
	    	 entityManager.getTransaction().commit();
	    	 entityManager.detach(item);
	    	 
	    	 
	     }
	     
	     public void findItem(int id)
	     {
	    	 
	    	Item item=entityManager.find(Item.class,id);
	    	System.out.println(item.getItemName());
	    	System.out.println(item.getPrice());
	    	System.out.println(item.getQuantityAvailable());
	    	 
	     }
	     
	     public void printAllItems()
	     {
	    	 
	    	 
	    	 Query query=entityManager.createQuery("select i from Item i");
	    	 
	    	 
	    	 System.out.println("*************************************");
	    	 List<Item> itemList=query.getResultList();
	    	 for(Item item:itemList)
	    	 {
	    		 System.out.println("#####################################");
	    		 System.out.println(item.getItemId());
	    		 System.out.println(item.getItemName());
	    		 System.out.println(item.getPrice());
	    		 System.out.println(item.getQuantityAvailable());
	    	 }
	    	 
	    	 
	     }
	     
	     public void updateItem(int id,Item item)
	     {
	    	 
	    	 entityManager.getTransaction().begin();
	    	 Item item_to_be_updated=entityManager.find(Item.class, id);
	    	 
	    	 item_to_be_updated.setItemName(item.getItemName());
	    	 item_to_be_updated.setPrice(item.getPrice());
	    	 item_to_be_updated.setQuantityAvailable(item.getQuantityAvailable());
	    	 
	    	  entityManager.merge(item_to_be_updated);
	    	  entityManager.flush();
	    	  entityManager.getTransaction().commit();
	    	 
	    	 
	     }
	     public void deleteItem(int id)
	     {
	    	 
	    	 
	    	 Item item_to_be_deleted=entityManager.find(Item.class, id);
	    	 entityManager.getTransaction().begin();
	    	 entityManager.remove(item_to_be_deleted);
	    	 entityManager.flush();
	    	 entityManager.getTransaction().commit();
	    	 
	    	 
	    	 
	     }
	     
	     
	     
	     public void viewNameAndQuantity()
	     {
	    	 
	     String query="Select i.itemName,i.quantityAvailable from Item i";
	     
	     Query jpaquery=entityManager.createQuery(query);
	    	 
	     List<Object[]> elementlist=jpaquery.getResultList();
	     
	     for(Object[] o:elementlist)
	     {
	    	 System.out.println("#############################");
	    	 System.out.println(o[0]);
	    	 System.out.println(o[1]);
	     }
	    	 
	     }
	     
	     
	     
	     
	     public void viewItemByPrice()
	     {
	    	 
	    	  String query="Select i from Item i where i.price > 40";
	    	  Query jpaquery=entityManager.createQuery(query);
	    	  List<Item> itemlist=jpaquery.getResultList();
	    	  for(Item i:itemlist )
	    	  {
	    		  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
	    		  System.out.println(i.getItemName());
	    		  System.out.println(i.getPrice());
	    		  System.out.println(i.getQuantityAvailable());
	    	  }
	    	 
	     }
	     
	     public void viewItemByQuantity()
	     {
	    	 
	    	  String query="Select i from Item i where i.quantityAvailable <> 10";
	    	  Query jpaquery=entityManager.createQuery(query);
	    	  List<Item> itemlist=jpaquery.getResultList();
	    	  for(Item i:itemlist )
	    	  {
	    		  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
	    		  System.out.println(i.getItemName());
	    		  System.out.println(i.getPrice());
	    		  System.out.println(i.getQuantityAvailable());
	    	  }
	    	 
	     }
	     
	     
	     public void viewItemByPriceParam(float price)
	     {
	    	 
	    	    String query="select i from Item i where i.price > :itemprice";
	    	    
	    	    Query jpaquery=entityManager.createQuery(query);
	    	    
	    	    jpaquery.setParameter("itemprice", price);
	    	    
	    	    List<Item> itemlist =jpaquery.getResultList();
	    	    
	    	    for(Item item:itemlist)
	    	    {
	    	    	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	    	    	System.out.println(item.getItemName());
	    	    	System.out.println(item.getPrice());
	    	    	System.out.println(item.getQuantityAvailable());
	    	    }
	     }
	     
	     
	     
	     
	     public void viewItemByPriceAndQuantityParam(float price ,int quantity)
	     {
	    	 
	    	    String query="select i from Item i where i.price > ?1 and i.quantityAvailable > ?2";
	    	    
	    	    Query jpaquery=entityManager.createQuery(query);
	    	    
	    	    jpaquery.setParameter(1, price);
	    	    jpaquery.setParameter(2, quantity);
	    	    
	    	    List<Item> itemlist =jpaquery.getResultList();
	    	    
	    	    for(Item item:itemlist)
	    	    {
	    	    	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	    	    	System.out.println(item.getItemName());
	    	    	System.out.println(item.getPrice());
	    	    	System.out.println(item.getQuantityAvailable());
	    	    }
	     }
	     
	     
	     
	     
	     
	     
	     public void viewOrderByName()
	     {
	    	 String query="select i from Item i order by i.itemName";
	    	 
	    	 Query jpaquery=entityManager.createQuery(query);
	    	 
	    	 List<Item> itemlist=jpaquery.getResultList();
	    	 for(Item item:itemlist)
	    	 {
	    		 System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	    		 System.out.println(item.getItemName());
	    		 System.out.println(item.getPrice());
	    		 System.out.println(item.getQuantityAvailable());
	    	 }
	    	 
	    	 
	    	 
	     }
	     
	     
	     
	     
	     
	     
	     public void viewGroupByCity()
	     {
	    	// String query="select count(i.itemName),i.city from Item i group by i.city";
	    	 
	    	 String query="select avg(i.price),i.city from Item i group by i.city";
	    	 Query jpaquery=entityManager.createQuery(query);
	    	 
	    	 List<Object[]> elementlist=jpaquery.getResultList();
	    	 for(Object[] o : elementlist)
	    	 {
	    		 System.out.println("###############################");
	    		 System.out.println(o[0]);
	    		 System.out.println(o[1]);
	    		 
	    	 }
	    	 
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     

}
