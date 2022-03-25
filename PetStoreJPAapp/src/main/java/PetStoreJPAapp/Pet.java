package PetStoreJPAapp;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.TableGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@NamedQueries({
	@NamedQuery(name="pet.findall",query="select p from Pet p")
	,
	
@NamedQuery(name="pet.orderbyname",query="select p from Pet p order by p.petName")
	
,
@NamedQuery(name="pet.update",
query="update Pet p set p.age= :petage where p.petId= :petid")	
})

public class Pet {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	

	private int petId;
	
	private String petName;
	private String petType;
	private int age;
	
	@ManyToOne
	PetStore petstore;
	
	
	
	public Pet()
	{
		
	}
	
	
	
	public PetStore getPetstore() {
		return petstore;
	}



	public void setPetstore(PetStore petstore) {
		this.petstore = petstore;
	}



	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@PrePersist
	public void NewPetCreated()
	{
		System.out.println("Pet to be saved to be db "+this.getPetName() );
		System.out.println(this.getPetType());
	}
	
	@PostPersist
public void NewPetSaved()
{
 System.out.println(this.getPetName()+" Saved");		
}
	
	
}







