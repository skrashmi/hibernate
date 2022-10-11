package com.hibernateOneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeletePersonAndAadhaar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = entityManager.find(Person.class, 3);
		
		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(person.getAadhaar());
		
		entityTransaction.commit();
	}

}
