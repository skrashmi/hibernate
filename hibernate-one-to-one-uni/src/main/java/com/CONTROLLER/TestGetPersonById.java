package com.CONTROLLER;

import com.DAO.PersonDao;

public class TestGetPersonById {

	public static void main(String[] args) {
		PersonDao personDao = new PersonDao();
		personDao.getPersonById(2);

	}

}
