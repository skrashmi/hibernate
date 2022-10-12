package com.hibernateOneToManyBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetMobileByID {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adarsh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Mobile mobile = entityManager.find(Mobile.class, 2);
		System.out.println("-----------------------------------------");
		if (mobile != null) {
			System.out.println();
			System.out.println("MobileID                :   " + mobile.getMobileId());
			System.out.println("MobileBrand             :   " + mobile.getBrand());
			System.out.println("MobileName              :   " + mobile.getMobileName());
			System.out.println();
			
			List<Sim> list = mobile.getList();
			
			for (Sim s : list) 
			{
				System.out.println();
				System.out.println("SimID                :   " + s.getSimId());
				System.out.println("SimService Provider  :   " + s.getServiceProvider());
				System.out.println("SimType              :   " + s.getType());
			}
			System.out.println("-----------------------------------------");
		}

	}

}
