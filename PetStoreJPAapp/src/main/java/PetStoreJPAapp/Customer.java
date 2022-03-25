package PetStoreJPAapp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;

@Entity
@IdClass(CustomerId.class)
public class Customer {
	
	
   @Id
   private String customerEmail;
   @Id	
   private String customerName;
	
	private String address;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<PetStore> petStoreList;
	

	public Customer()
	{
		
	}
	
	
	
	public List<PetStore> getPetStoreList() {
		return petStoreList;
	}





	public void setPetStoreList(List<PetStore> petStoreList) {
		this.petStoreList = petStoreList;
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
