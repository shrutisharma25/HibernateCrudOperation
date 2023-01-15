package com.amazon;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDataByName {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shruti");
		EntityManager em=emf.createEntityManager();

		Query query=em.createQuery("select emp from Amazon emp where emp.ename=?1");
		query.setParameter(1, "DEF");

		List<Amazon> amazon=query.getResultList();

		for (Amazon a : amazon) {

			System.out.println("Employee Id:-"+a.getEid());
			System.out.println("Employee Designation:-"+a.getDesignation());
			System.out.println("Employee Name:-"+a.getEname());
			System.out.println("Employee Gender:-"+a.getGender());
			System.out.println("Employee Salary:-"+a.getSalary());
			System.out.println("                     ************************");

		}

	}

}
