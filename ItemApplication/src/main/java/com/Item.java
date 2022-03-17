package com;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostRemove;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int itemId;
	private String itemName;
	private float price;
	
	  public Item(String itemName,float price)
	  {
		  this.itemName=itemName;
		  this.price=price;
	  }
	
	
	public Item()
	{
		
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	
	@PrePersist
	public void itemSaved()
	{
		System.out.println("Item is to be saved");
	}
	@PreRemove
	public void itemtoberemoved()
	{
		System.out.println("Item to be removed");
		System.out.println(this.itemName);
	}
	@PostRemove
	public void itemRemoved()
	{
		System.out.println("item removed ");
	}
	
}
