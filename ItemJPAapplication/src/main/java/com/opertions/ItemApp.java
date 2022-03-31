package com.opertions;
import com.entities.*;
public class ItemApp {

	public static void main(String[] args) {

		  ItemOperation obj=new ItemOperation();
		  obj.saveItem(new Item(1,"Coffee",23,10,"Chennai"));
		  obj.saveItem(new Item(2,"Black Coffee",45,15,"Chennai"));
		  obj.saveItem(new Item(3,"Espresso",50,19,"Delhi"));
		  obj.saveItem(new Item(4,"Latte",49,11,"Mumbai"));
		  obj.saveItem(new Item(5,"Arabica",36,12,"Mumbai"));
		  obj.saveItem(new Item(6,"Robusta",52,13,"Delhi"));
		  obj.saveItem(new Item(7,"Cappuccino",22,18,"Agra"));
		  obj.saveItem(new Item(8,"Americano",11,20,"Agra"));
		  obj.saveItem(new Item(9,"Doppio",12,22,"Chennai"));
		  
		  obj.findItem(1);
		  obj.findItem(2);
		  obj.findItem(3);
		  obj.findItem(4);

		  
	
		  
		   obj.viewGroupByCity();
		  
		 // obj.deleteItem(3);
		  
		  
		  
		  
		  
		  
	}
	
	

	
	

}
