package com.hibernateOneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdatePersonAndAadhaar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = entityManager.find(Person.class, 1);
		
		person.setAge(50);
		person.setName("Vikas");
		
		person.getAadhaar().setAadhaarNo("3333 5555 6666");
		person.getAadhaar().setFatherName("Rajesh");
		
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();

	}

}
