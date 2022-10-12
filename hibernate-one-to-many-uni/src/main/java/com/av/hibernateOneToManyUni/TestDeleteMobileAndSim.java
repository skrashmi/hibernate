package com.av.hibernateOneToManyUni;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteMobileAndSim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile =entityManager.find(Mobile.class, 2);
		
//		List<Sim> sims = mobile.getList();
		
		entityTransaction.begin();
		entityManager.remove(mobile);
//		for (Sim sim : sims) 
//		{
//			entityManager.remove(sim);
//		}
		
		entityTransaction.commit();
		
		

	}

}
