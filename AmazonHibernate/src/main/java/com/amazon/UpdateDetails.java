package com.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shruti");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Amazon a1=em.find(Amazon.class, 101);
		a1.setSalary(95000);
		Amazon a2=em.find(Amazon.class, 103);
		a2.setSalary(45000);
		
		Amazon a3=em.find(Amazon.class, 101);
		a3.setDesignation("Phython Develeoper");
		
		Amazon a4=em.find(Amazon.class, 101);
		a4.setEname("DEF");
				
		et.begin();
		em.merge(a1);
		em.merge(a2);
		em.merge(a3);
		em.merge(a4);
		et.commit();
		
	}

}
