package com.hibernateManyToManyUni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacherAndSubject {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher teacher = entityManager.find(Teacher.class, 1);

		teacher.setName("Nagesh");
		teacher.setSalary(40000);

		List<Subject> subjects = teacher.getSubjects();
		
		entityTransaction.begin();
		
		
		
		for (Subject subject : subjects) {
			entityManager.remove(subject);
		}

		

		Subject subject1 = new Subject();
		subject1.setName("CO");
		subject1.setDuration(30);

		Subject subject2 = new Subject();
		subject2.setName("DSA");
		subject2.setDuration(45);

		List<Subject> subjects2 = new ArrayList<Subject>();

		subjects2.add(subject1);
		subjects2.add(subject2);

		teacher.setSubjects(subjects2);

		
		
		entityManager.merge(subject1);
		entityManager.merge(subject2);
		entityManager.merge(teacher);
		entityTransaction.commit();

	}

}
