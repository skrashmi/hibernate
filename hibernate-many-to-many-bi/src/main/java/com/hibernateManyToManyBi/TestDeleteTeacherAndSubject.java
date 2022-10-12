package com.hibernateManyToManyBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteTeacherAndSubject {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Teacher teacher = entityManager.find(Teacher.class, 3);
		List<Subject> subjects = teacher.getSubjects();
		
		entityTransaction.begin();
		
		entityManager.remove(teacher);
		for (Subject subject : subjects) {
			entityManager.remove(subject);
		}
		entityTransaction.commit();
	}

}
