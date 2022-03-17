package com;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Person {

	 @Id
	 @GeneratedValue(strategy=GenerationType.TABLE,generator="table-generator")
	 @TableGenerator(name="table-generator",table="my_person_key",pkColumnName="pk_id",
	 valueColumnName="seq_value")
	private int personId;
	private String personName;
	private String personAddress;
	public Person()
	{
		
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
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
	
}
