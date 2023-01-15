package com.amazon;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllDetails {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shruti");
		EntityManager em=emf.createEntityManager();

		Query query=em.createQuery("select emp from Amazon emp");
		List<Amazon> emp=query.getResultList();

		for (Amazon amazon : emp) {

			System.out.println("Enployee Id:-"+amazon.getEid());
			System.out.println("Enployee Designation:-"+amazon.getDesignation());
			System.out.println("Enployee Name:-"+amazon.getEname());
			System.out.println("Enployee Gender:-"+amazon.getGender());
			System.out.println("Enployee Salary:-"+amazon.getSalary());
			System.out.println("      ************************");

		}
	}


}
