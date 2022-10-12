package com.av.hibernateOneToManyUni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateMobileAndSim {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = entityManager.find(Mobile.class, 3);
		
		mobile.setBrand("MI");
		mobile.setMobileName("A2");
		
		Sim sim1 = new Sim();
		sim1.setServiceProvider("Jio");
		sim1.setType("4G");
		 
		Sim sim2 = new Sim();
		sim2.setServiceProvider("BSNL");
		sim2.setType("3G");
		
		List<Sim> list = mobile.getList();
		//add both objects to list
		list.add(sim1);
		list.add(sim2);
		
		
		//set the list
		mobile.setList(list);
		
		
		
		entityTransaction.begin();
		entityManager.merge(mobile);
		entityManager.merge(sim1);
		entityManager.merge(sim2);
		
		entityTransaction.commit();
		
		
		

	}

}
