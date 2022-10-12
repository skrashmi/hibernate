package com.hibernateManyToManyBi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacherAndSubject {

	public static void main(String[] args) {

		Subject subject1 = new Subject();
		subject1.setName("WTA");
		subject1.setDuration(30);

		Subject subject2 = new Subject();
		subject2.setName("DBMS");
		subject2.setDuration(45);

		List<Subject> subjects = new ArrayList<Subject>();

		subjects.add(subject1);
		subjects.add(subject2);

		Teacher teacher1 = new Teacher();
		teacher1.setName("Pradeep");
		teacher1.setSalary(40000);

		teacher1.setSubjects(subjects);
		
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(teacher1);
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityTransaction.commit();

	}

}
