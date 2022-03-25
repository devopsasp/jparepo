package PetStoreJPAapp;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class VolunteerId implements Serializable{
	
	private String volunteerName;
	private String volunteerEmail;
	public VolunteerId()
	{
		
	}
	public String getVolunteerName() {
		return volunteerName;
	}
	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}
	public String getVolunteerEmail() {
		return volunteerEmail;
	}
	public void setVolunteerEmail(String volunteerEmail) {
		this.volunteerEmail = volunteerEmail;
	}

	
	

}
