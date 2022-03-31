package com.entities;
import javax.persistence.*;

import org.hibernate.annotations.Type;


@Entity
public class Item {

	@Id
	private int itemId;
	private String itemName;
	private float itemPrice;
	
	//@Type(type="org.hibernate.type.BlobType")
	//@Lob
	private byte[] itemImage;

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

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public byte[] getItemImage() {
		return itemImage;
	}

	public void setItemImage(byte[] itemImage) {
		this.itemImage = itemImage;
	}
	
	
	
	
}
