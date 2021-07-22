package com.cg.fms.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.fms.entity.Trainer;

@Service
public interface ITrainerManagementService {
	
	Trainer addTrainer(Trainer trainer);
	Trainer updateTrainer(Trainer trainer, long empId);
	ResponseEntity <Trainer> removeTrainer(long empId);
	Trainer viewTrainer(long empId);
	List <Trainer> viewAllTrainer();
	public List<Trainer> viewAllTrainerBySkill(String Skill);
	
}
