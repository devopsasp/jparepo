package com.entities;
import javax.persistence.*;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="mytablegenerator")
	@TableGenerator(name="mytablegenerator",table="itemtable",pkColumnName="mykey",
	valueColumnName="seq_value"
			
			)
	
	private int itemId;
	private String itemName;
	private float price;
	private int quantityAvailable;
	private String city;
	
	public Item() {}

	
	
	
public Item( String itemName, float price, int quantityAvailable, String city) {
		super();
	
		this.itemName = itemName;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
		this.city = city;
	}












	public String getCity() {
	return city;
}




public void setCity(String city) {
	this.city = city;
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

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	
	
	
	@PostPersist
	public void itemSaved()
	{
		System.out.println("#################");
		System.out.println(this.getItemName()+" with item id "+this.getItemId()+" saved");
		System.out.print("########################");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
