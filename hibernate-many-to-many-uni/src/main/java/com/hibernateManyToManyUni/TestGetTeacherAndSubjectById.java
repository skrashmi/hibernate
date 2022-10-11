package com.hibernateManyToManyUni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class TestGetTeacherAndSubjectById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rashmi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Teacher teacher = entityManager.find(Teacher.class, 2);
		
		if (teacher != null) {
			System.out.println("---------Teacher details---------");
			System.out.println("ID              :   " + teacher.getId());
			System.out.println("Name            :   " + teacher.getName());
			System.out.println("Salary          :   " + teacher.getSalary());
			System.out.println();
			
			List<Subject> subjects = teacher.getSubjects();
			
			for (Subject s : subjects) 
			{
				System.out.println();
				System.out.println("---------Subjects details--------");
				System.out.println("ID          :   " + s.getId());
				System.out.println("Name        :   " + s.getName());
				System.out.println("Duration    :   " + s.getDuration());
			}
			
		}
		

	}

}
