package com.hibernateOneToOneBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllPersonAndAadhaar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select p from Person p");
		
		
		List<Person> persons = query.getResultList();
		
		
		System.out.println("-----------------------------------------");
		
		for (Person person : persons) {
			System.out.println();
			System.out.println("PersonID     :  " + person.getId());
			System.out.println("PersonName   :  " + person.getName());
			System.out.println("PersonAge    :  " + person.getAge());
		
			System.out.println();
			System.out.println("AadhaarID    :  " + person.getAadhaar().getId());
			System.out.println("AadhaarNo    :  " + person.getAadhaar().getAadhaarNo());
			System.out.println("FatherName   :  " + person.getAadhaar().getFatherName());
			System.out.println("-----------------------------------------");
		}
		
		
		/*		OR
		 
		Query query = entityManager.createQuery("select a from Aadhaar a");
		List<Aadhaar> aadhaars = query.getResultList();
		System.out.println("-----------------------------------------");
		for (Aadhaar aadhaar : aadhaars) {
			System.out.println();
			System.out.println("PersonID     :  " + aadhaar.getPerson().getId());
			System.out.println("PersonName   :  " + aadhaar.getPerson().getName());
			System.out.println("PersonAge    :  " + aadhaar.getPerson().getAge());
			System.out.println();
			System.out.println("AadhaarID    :  " + aadhaar.getId());
			System.out.println("AadhaarNo    :  " + aadhaar.getAadhaarNo());
			System.out.println("FatherName   :  " + aadhaar.getFatherName());
			System.out.println("-----------------------------------------");
		}
		
		*/
	}

}
