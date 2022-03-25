package PetStoreJPAapp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;
@Entity

public class PetStore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int petStoreId;
	
	private String petStoreName;
	
	private String petStoreAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Person manager;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Pet> petList;
	
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<Customer> customeList;
	
	
	
	public List<Customer> getCustomeList() {
		return customeList;
	}



	public void setCustomeList(List<Customer> customeList) {
		this.customeList = customeList;
	}



	public List<Pet> getPetList() {
		return petList;
	}



	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}



	public PetStore()
	{
		
	}
	
	 
	
	public Person getManager() {
		return manager;
	}



	public void setManager(Person manager) {
		this.manager = manager;
	}



	public int getPetStoreId() {
		return petStoreId;
	}
	public void setPetStoreId(int petStoreId) {
		this.petStoreId = petStoreId;
	}
	public String getPetStoreName() {
		return petStoreName;
	}
	public void setPetStoreName(String petStoreName) {
		this.petStoreName = petStoreName;
	}
	public String getPetStoreAddress() {
		return petStoreAddress;
	}
	public void setPetStoreAddress(String petStoreAddress) {
		this.petStoreAddress = petStoreAddress;
	}
	
	
	

}
