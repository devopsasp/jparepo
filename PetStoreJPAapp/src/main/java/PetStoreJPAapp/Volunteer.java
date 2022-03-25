package PetStoreJPAapp;
import javax.persistence.Entity;
import javax.persistence.EmbeddedId;

@Entity
public class Volunteer {
	
	@EmbeddedId
	private VolunteerId volunteerId;
	
	private int animalsRescued;
	
	public Volunteer()
	{
		
	}

	public VolunteerId getVolunteerId() {
		return volunteerId;
	}

	public void setVolunteerId(VolunteerId volunteerId) {
		this.volunteerId = volunteerId;
	}

	public int getAnimalsRescued() {
		return animalsRescued;
	}

	public void setAnimalsRescued(int animalsRescued) {
		this.animalsRescued = animalsRescued;
	}
	
	

}
