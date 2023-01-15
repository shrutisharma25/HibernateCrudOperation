package com.amazon;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Amazon {

	@Id
	private int eid;
	private String ename;
	private double salary;
	private String designation;
	private String gender;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Amazon [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", gender=" + gender + "]";
	}



}
