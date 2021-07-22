package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class Participant extends Employee{
	
	@Column(name = "role")
	private final String role = "Participant";

	//Constructors
	public Participant(String empName, String password) {
		super(empName, password);
	}
	
	public Participant() {
		super();
	}
	
	//Getter & Setters
	public String getParticipantName() {
		return super.getEmpName();
	}
	
	public void setParticipantName(String participantName) {
		super.setEmpName(participantName);
	}
	
	public String getParticipantPassword() {
		return super.getPassword();
	}
	
	public void setParticipantPassword(String participantPass) {
		super.setPassword(participantPass);
	}

	public String getRole() {
		return role;
	}

}
