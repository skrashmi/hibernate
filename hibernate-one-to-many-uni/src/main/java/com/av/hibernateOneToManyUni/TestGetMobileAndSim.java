package com.av.hibernateOneToManyUni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetMobileAndSim {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Mobile mobile = entityManager.find(Mobile.class, 1);
		System.out.println();
		
		if (mobile != null) 
		{
			
			System.out.println("---------Mobile details---------");
			System.out.println("ID                :   " + mobile.getMobileId());
			System.out.println("Brand             :   " + mobile.getBrand());
			System.out.println("Name              :   " + mobile.getMobileName());
			System.out.println();
			
			List<Sim> list = mobile.getList();
			
			for (Sim s : list) 
			{
				System.out.println();
				System.out.println("---------SIM details--------");
				System.out.println("ID                :   " + s.getSimId());
				System.out.println("Service Provider  :   " + s.getServiceProvider());
				System.out.println("Type              :   " + s.getType());
			}
			
		}

	}

}
