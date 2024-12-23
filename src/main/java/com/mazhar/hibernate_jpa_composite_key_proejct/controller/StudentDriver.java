package com.mazhar.hibernate_jpa_composite_key_proejct.controller;

import com.mazhar.hibernate_jpa_composite_key_proejct.composite.StudentId;
import com.mazhar.hibernate_jpa_composite_key_proejct.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("composite-key").createEntityManager();
		EntityTransaction st = em.getTransaction();
		
		
		StudentId studentId = new StudentId(77788, "mazharansari1997@gmail.com", 765766780);
		Student student =  new Student(studentId, "Mo Mazhar Ansari");
		
		
		st.begin();
		em.persist(student);
		st.commit();
	}
}
