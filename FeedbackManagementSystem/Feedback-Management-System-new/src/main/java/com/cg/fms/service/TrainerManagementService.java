package com.cg.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.fms.entity.Trainer;
import com.cg.fms.exception.EmployeeNotFoundException;
import com.cg.fms.repository.ITrainerManagementRepository;

@Service
public class TrainerManagementService implements ITrainerManagementService {

	@Autowired
	private ITrainerManagementRepository trainermanagementrepository;
	
	@Override
	public Trainer addTrainer(Trainer trainer) {
		return trainermanagementrepository.save(trainer);
	}

	@Override
	public Trainer updateTrainer(Trainer trainer, long trainerId) {
		Trainer existingtrainer = this.trainermanagementrepository.getById(trainer.getEmployeeId());
		existingtrainer.setEmpName(trainer.getEmpName());
		existingtrainer.setPassword(trainer.getPassword());
		return this.trainermanagementrepository.save(existingtrainer);
	}

	@Override
	public ResponseEntity <Trainer> removeTrainer(long trainerId) {
		Trainer existingtrainer = this.trainermanagementrepository.findById(trainerId)
				.orElseThrow(() -> new EmployeeNotFoundException("Trainer not found with id " + trainerId));
		this.trainermanagementrepository.delete(existingtrainer);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<Trainer> viewAllTrainer() {
		return this.trainermanagementrepository.findAll();
	}
	
	@Override
	public Trainer viewTrainer(long trainerId) {
		return this.trainermanagementrepository.findById(trainerId)
				.orElseThrow(() -> new EmployeeNotFoundException("Trainer not found with id " + trainerId));
	}

	@Override
	public List <Trainer> viewAllTrainerBySkill(String Skill) {
		return this.trainermanagementrepository.viewAllTrainerBySkill(Skill);
	}

}
