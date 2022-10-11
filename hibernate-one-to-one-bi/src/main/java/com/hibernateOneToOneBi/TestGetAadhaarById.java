package com.hibernateOneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetAadhaarById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Aadhaar aadhaar = entityManager.find(Aadhaar.class, 2);
		
		if (aadhaar != null) {
			System.out.println();
			System.out.println("AadhaarID     :  " + aadhaar.getId());
			System.out.println("AadhaarNo     :  " + aadhaar.getAadhaarNo());
			System.out.println("FatherName    :  " + aadhaar.getFatherName());
		}

	}

}
