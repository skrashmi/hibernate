package com.hibernateOneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class, 2);
		
		if (person != null) {
			System.out.println();
			System.out.println("PersonID     :  " + person.getId());
			System.out.println("PersonName   :  " + person.getName());
			System.out.println("PersonAge    :  " + person.getAge());
		}

	}

}
