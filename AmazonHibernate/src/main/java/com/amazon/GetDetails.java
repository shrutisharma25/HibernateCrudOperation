package com.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shruti");
		EntityManager em=emf.createEntityManager();
		
		Amazon amazon=em.find(Amazon.class,101);
		System.out.println("Employee Id:-"+amazon.getEid());
		System.out.println("Employee Designation:-"+amazon.getDesignation());
		System.out.println("Employee Name:-"+amazon.getEname());
		System.out.println("Employee Gender:-"+amazon.getGender());
		System.out.println("Employee Salary:-"+amazon.getSalary());
		
	}

}
