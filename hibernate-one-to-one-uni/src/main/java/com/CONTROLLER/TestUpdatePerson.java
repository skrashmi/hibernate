package com.CONTROLLER;

import com.DAO.PersonDao;
import com.DTO.Aadhaar;
import com.DTO.Person;

public class TestUpdatePerson {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Farooq");
		person.setAge(41);

		Aadhaar aadhar=new Aadhaar();
		aadhar.setFatherName("Sathwik");
		aadhar.setAadhaarNo("1112 5552 3434");
		PersonDao persondao=new PersonDao();
		
		persondao.updatePersonById(1, person, aadhar);
		}
}
