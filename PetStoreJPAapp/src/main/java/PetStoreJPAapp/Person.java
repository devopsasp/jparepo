package PetStoreJPAapp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
@Entity
public class Person {

	@Id
	@GeneratedValue
	private int personId;
	private String personName;
	private String address;
	
	@OneToOne
	PetStore petstore;
	
	
	
	public Person()
	{
		
	}
	
	
	
	public PetStore getPetstore() {
		return petstore;
	}



	public void setPetstore(PetStore petstore) {
		this.petstore = petstore;
	}



	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
