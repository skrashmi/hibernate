package com.hibernateOneToManyBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetSimByID {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adarsh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Sim sim = entityManager.find(Sim.class, 2);
		System.out.println("------------------------------------");
		if (sim != null) {
			System.out.println();
			System.out.println("SimID                :   " + sim.getSimId());
			System.out.println("SimService Provider  :   " + sim.getServiceProvider());
			System.out.println("SimType              :   " + sim.getType());
			System.out.println();
			System.out.println("MobileID             :   " + sim.getMobile().getMobileId());
			System.out.println("MobileBrand          :   " + sim.getMobile().getBrand());
			System.out.println("MobileName           :   " + sim.getMobile().getMobileName());
		}

	}

}
