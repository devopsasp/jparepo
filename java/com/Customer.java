package com;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
@Entity
@IdClass(CustomerId.class)
public class Customer {
	
	
	
	@Id private String customerName;
	@Id private String customerEmail;
	
	private String address;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer( String customerName, String address) {
		super();

		this.customerName = customerName;
		this.address = address;
	}
	
	
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
