package com.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shruti");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Amazon a1=em.find(Amazon.class, 102);
		Amazon a2=em.find(Amazon.class, 104);
		
		et.begin();
		em.remove(a1);
		em.remove(a2);
		et.commit();
		
	}

}
