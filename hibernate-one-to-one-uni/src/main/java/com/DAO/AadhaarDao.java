package com.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.DTO.Aadhaar;
import com.DTO.Person;

public class AadhaarDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
	

	public void saveAadhaar(Aadhaar a) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(a);
		entityTransaction.commit();

	}

	public void deleteAadhaar(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Aadhaar a = entityManager.find(Aadhaar.class, id);
		entityTransaction.begin();
		entityManager.remove(a);
		entityTransaction.commit();
	}

	public void updateAadhaarById(int id, Aadhaar aadhaar) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Aadhaar a = entityManager.find(Aadhaar.class, id);
		a.setFatherName(aadhaar.getFatherName());
		a.setAadhaarNo(aadhaar.getAadhaarNo());
		entityManager.merge(a);
		entityTransaction.commit();
	}

}
