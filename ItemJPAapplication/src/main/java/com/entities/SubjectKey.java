package com.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SubjectKey  implements Serializable{

	  private String subjectName;
	  private String subjectCode;
	  
	public SubjectKey()
	{
		
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	
	 
}
