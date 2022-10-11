package com.hibernateOneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonAndAadhaar {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("Yuvraj");
		person.setAge(22);
		
		Aadhaar aadhaar = new Aadhaar();
		aadhaar.setFatherName("Roshan");
		aadhaar.setAadhaarNo("9899 6789 2222");
		
		person.setAadhaar(aadhaar);
		aadhaar.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(aadhaar);
		entityTransaction.commit();
		
		

	}

}
