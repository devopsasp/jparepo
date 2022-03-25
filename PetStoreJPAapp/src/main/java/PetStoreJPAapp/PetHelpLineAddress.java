package PetStoreJPAapp;
import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PetHelpLineAddress implements Serializable {
	
	private int buildingNo;
	private String street;
	private String city;
	public PetHelpLineAddress()
	{
		
	}
	public int getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
