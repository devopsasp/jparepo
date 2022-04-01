package com.operation;
import javax.persistence.*;
import com.entities.*;
public class StudentApp {
	public static void main(String args[])
	{
EntityManagerFactory efac=Persistence.createEntityManagerFactory("ItemPU");
EntityManager manager=efac.createEntityManager();
Student student=new Student();
student.setStudentName("Peter Jones");


SubjectKey key=new SubjectKey();
key.setSubjectCode("MAT");
key.setSubjectName("Maths");

Subject subject=new Subject();
subject.setSubjectKey(key);
subject.setDurationInHour(2);


manager.getTransaction().begin();
manager.persist(student);
manager.persist(subject);
manager.flush();
manager.getTransaction().commit();
	}

}
