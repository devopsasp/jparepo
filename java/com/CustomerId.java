package com;
import java.io.Serializable;
public class CustomerId implements Serializable{
	private String customerName;
	private String customerEmail;
	
	public CustomerId()
	{
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	

}
