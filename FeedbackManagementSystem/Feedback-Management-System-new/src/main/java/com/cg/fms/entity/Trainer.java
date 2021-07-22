package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trainer")
public class Trainer extends Employee{

	@Column(name = "role")
	private final String role = "Trainer";
	
	@Column(name = "skill")
	private String skill;

	//Constructors
	public Trainer(String empName, String password, String skill) {
		super(empName, password);
		this.skill=skill;
	}
	
	public Trainer() {
		super();
	}

	//Getters & Setters
	public String TrainerName() {
		return super.getEmpName();
	}
	
	public void setTrainerName(String trainerName) {
		super.setEmpName(trainerName);
	}
	
	public String getTrainerPassword() {
		return super.getPassword();
	}
	
	public void setTrainerPassword(String trainerPass) {
		super.setPassword(trainerPass);
	}
	
	public String getRole() {
		return role;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}
