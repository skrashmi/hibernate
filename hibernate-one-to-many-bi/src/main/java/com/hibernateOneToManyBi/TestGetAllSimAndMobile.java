package com.hibernateOneToManyBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllSimAndMobile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adarsh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select s from Sim s");

		List<Sim> sims = query.getResultList();
		System.out.println("\n---------------------------------------------\n");

		for (Sim sim : sims) {

			System.out.println("SimID                :   " + sim.getSimId());
			System.out.println("SimService Provider  :   " + sim.getServiceProvider());
			System.out.println("SimType              :   " + sim.getType());
			System.out.println();
			System.out.println("MobileID             :   " + sim.getMobile().getMobileId());
			System.out.println("MobileBrand          :   " + sim.getMobile().getBrand());
			System.out.println("MobileName           :   " + sim.getMobile().getMobileName());
			System.out.println();

			System.out.println("\n---------------------------------------------\n");

		}

	}

}
