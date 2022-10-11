package com.CONTROLLER;

import com.DAO.PersonDao;

public class TestDeletePerson {

	public static void main(String[] args) {
		PersonDao personDao = new PersonDao();
		personDao.deletePerson(2);

	}

}
