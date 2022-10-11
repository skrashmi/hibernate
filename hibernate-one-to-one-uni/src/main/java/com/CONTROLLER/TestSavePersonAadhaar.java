package com.CONTROLLER;

import com.DAO.AadhaarDao;
import com.DAO.PersonDao;
import com.DTO.Aadhaar;
import com.DTO.Person;

public class TestSavePersonAadhaar {

	public static void main(String[] args) {
		
		PersonDao personDao = new PersonDao();
		AadhaarDao aadhaarDao = new AadhaarDao();
		
		Aadhaar a = new Aadhaar();
		a.setFatherName("Ram");
		a.setAadhaarNo("5678 4321 9876");
		aadhaarDao.saveAadhaar(a);
		
		
		Person p = new Person();
		p.setName("Sham");
		p.setAge(32);
		p.setAadhaar(a);
		personDao.savePerson(p);
		
		
		
		

	}

}
