package com.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shruti");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Amazon amazon1=new Amazon();
		amazon1.setEid(101);
		amazon1.setEname("ABC");
		amazon1.setSalary(80000.00);
		amazon1.setDesignation("Java Developer");
		amazon1.setGender("Male");
		
		Amazon amazon2=new Amazon();
		amazon2.setEid(102);
		amazon2.setEname("ABC");
		amazon2.setSalary(80000.00);
		amazon2.setDesignation("Java Developer");
		amazon2.setGender("Male");
		
		Amazon amazon3=new Amazon();
		amazon3.setEid(103);
		amazon3.setEname("ABC");
		amazon3.setSalary(80000.00);
		amazon3.setDesignation("Java Developer");
		amazon3.setGender("Male");
		
		Amazon amazon4=new Amazon();
		amazon4.setEid(104);
		amazon4.setEname("ABC");
		amazon4.setSalary(80000.00);
		amazon4.setDesignation("Java Developer");
		amazon4.setGender("Male");
		
		Amazon amazon5=new Amazon();
		amazon5.setEid(105);
		amazon5.setEname("ABC");
		amazon5.setSalary(80000.00);
		amazon5.setDesignation("Java Developer");
		amazon5.setGender("Male");
		
		et.begin();
		em.persist(amazon1);
		em.persist(amazon2);
		em.persist(amazon3);
		em.persist(amazon4);
		em.persist(amazon5);
		et.commit();
		
		
	}

}
