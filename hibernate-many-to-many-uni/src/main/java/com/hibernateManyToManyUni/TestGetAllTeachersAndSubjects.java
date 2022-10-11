package com.hibernateManyToManyUni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class TestGetAllTeachersAndSubjects {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Query query = entityManager.createQuery("select t from Teacher t");
	List<Teacher> teachers = query.getResultList();
	System.out.println("\n---------------------------------------------\n");
	
	
	for (Teacher teacher : teachers) {
		
		System.out.println("TeacherID          :   " + teacher.getId());
		System.out.println("TeacherName        :   " + teacher.getName());
		System.out.println("TeacherSalary      :   " + teacher.getSalary());
		System.out.println();
		
		List<Subject> subjects = teacher.getSubjects();
		
		for (Subject s : subjects) 
		{
			System.out.println();
			System.out.println("SubjectID          :   " + s.getId());
			System.out.println("SubjectName        :   " + s.getName());
			System.out.println("SubjectDuration    :   " + s.getDuration());
		}
		System.out.println("\n---------------------------------------------\n");
	}
	}
}
