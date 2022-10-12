package com.hibernateOneToManyBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllMobileAndSim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adarsh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select m from Mobile m");
		
		List<Mobile> mobiles = query.getResultList();
		System.out.println("\n---------------------------------------------\n");
		
		
		for (Mobile mobile : mobiles) {
			
			System.out.println("MobileID             :   " + mobile.getMobileId());
			System.out.println("MobileBrand          :   " + mobile.getBrand());
			System.out.println("MobileName           :   " + mobile.getMobileName());
			System.out.println();
			
			List<Sim> list = mobile.getList();
			
			for (Sim sim : list) 
			{
				System.out.println();
				System.out.println("SimID                :   " + sim.getSimId());
				System.out.println("SimService Provider  :   " + sim.getServiceProvider());
				System.out.println("SimType              :   " + sim.getType());
			}
			System.out.println("\n---------------------------------------------\n");
			
		}


	}

}
