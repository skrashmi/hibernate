package com.hibernateOneToManyBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteMobileAndSim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adarsh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = entityManager.find(Mobile.class, 2);
		
		List<Sim> sims = mobile.getList();
		
		entityTransaction.begin();
		
		for (Sim sim : sims) {
			entityManager.remove(sim);
		}

		entityManager.remove(mobile);
		
		entityTransaction.commit();
 

	}

}
