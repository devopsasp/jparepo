package PetStoreJPAapp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PetHelpLine {

	@Id
	@GeneratedValue
	private int helpLineId;
	private String helpLineNumber;
	private String helpLineName;
	private PetHelpLineAddress helpLineAddress;
	
	
	public PetHelpLine()
	{
		
	}
	
	
	
	public PetHelpLineAddress getHelpLineAddress() {
		return helpLineAddress;
	}



	public void setHelpLineAddress(PetHelpLineAddress helpLineAddress) {
		this.helpLineAddress = helpLineAddress;
	}



	public int getHelpLineId() {
		return helpLineId;
	}
	public void setHelpLineId(int helpLineId) {
		this.helpLineId = helpLineId;
	}
	public String getHelpLineNumber() {
		return helpLineNumber;
	}
	public void setHelpLineNumber(String helpLineNumber) {
		this.helpLineNumber = helpLineNumber;
	}
	public String getHelpLineName() {
		return helpLineName;
	}
	public void setHelpLineName(String helpLineName) {
		this.helpLineName = helpLineName;
	}
	
	
}
