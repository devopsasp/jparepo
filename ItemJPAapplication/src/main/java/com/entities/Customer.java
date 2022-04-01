package com.entities;

import javax.persistence.*;
@Entity
public class Customer {
	@EmbeddedId
	private CustomerKey customerKey;
	
	private String address;
	private String phoneNo;
	
   public Customer() {}

public CustomerKey getCustomerKey() {
	return customerKey;
}

public void setCustomerKey(CustomerKey customerKey) {
	this.customerKey = customerKey;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
   
   
}
