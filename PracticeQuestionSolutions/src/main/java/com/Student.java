package com;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String semester;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Teacher teacher;
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student(int studentId, String studentName, String semester,Teacher teacher) {
		super();
		this.teacher=teacher;
		this.studentId = studentId;
		this.studentName = studentName;
		this.semester = semester;
	}
	public Student()
	{
		
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	

}
