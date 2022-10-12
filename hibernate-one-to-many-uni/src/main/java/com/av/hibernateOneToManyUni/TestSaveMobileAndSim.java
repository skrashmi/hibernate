package com.av.hibernateOneToManyUni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileAndSim {

	public static void main(String[] args) {
	
		Sim sim1 = new Sim();
		sim1.setServiceProvider("Airtel");
		sim1.setType("4G");
		
		Sim sim2 = new Sim();
		sim2.setServiceProvider("BSNL");
		sim2.setType("3G");
		
		List<Sim> list = new ArrayList<Sim>();
		//add both objects to list
		list.add(sim1);
		list.add(sim2);
		
		Mobile mobile = new Mobile();
		mobile.setBrand("Realme");
		mobile.setMobileName("8 pro");
		//set the list
		mobile.setList(list);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(mobile);
		entityTransaction.commit();

	}

}
