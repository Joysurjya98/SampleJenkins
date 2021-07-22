package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends Employee{
	
	@Column(name = "role")
	private final String role = "Admin";

	//Constructors
	public Admin(String empName, String password) {
		super(empName, password);
	}
	
	public Admin() {
		super();
	}

	//Getters & Setters
	public String getAdminName() {
		return super.getEmpName();
	}
	
	public void setAdminName(String adminName) {
		super.setEmpName(adminName);
	}
	
	public String getAdminPassword() {
		return super.getPassword();
	}
	
	public void setAdminPassword(String adminPass) {
		super.setPassword(adminPass);
	}
	
	public String getRole() {
		return role;
	}

}
