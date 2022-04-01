package com.entities;
import javax.persistence.*;
@Entity

public class Subject {
	
     @EmbeddedId
	 private SubjectKey subjectKey;
     private int durationInHour;
     
      public Subject() {}
	public SubjectKey getSubjectKey() {
		return subjectKey;
	}
	public void setSubjectKey(SubjectKey subjectKey) {
		this.subjectKey = subjectKey;
	}
	public int getDurationInHour() {
		return durationInHour;
	}
	public void setDurationInHour(int durationInHour) {
		this.durationInHour = durationInHour;
	}
     
}
