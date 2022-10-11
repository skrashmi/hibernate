package com.hibernateOneToOneBi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aadhaar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fatherName;
	private String aadhaarNo;
	
	/*
	 * since this is bi-directional, foreign key columns created in both aadhaar and person table, to avoid that duplicate columns @JoinColumns is used 
	 * */
	
	@OneToOne
	@JoinColumn	//to join two foreign key columns
	Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Aadhaar()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	

}
