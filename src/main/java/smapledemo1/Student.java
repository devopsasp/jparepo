package smapledemo1;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
//entity annotation marks for class to be mapped with table 
@Entity
@Table(name="StudentTable")
public class Student {
	@Id
	private int id;
	
	@Column(name="StudentFullName")
	private String studentName;
	
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int id, String studentName, String address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
