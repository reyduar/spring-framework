package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	GoalRepository goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}
//Metodo que usaba sin JpaReository
//	public List<Goal> findAllGoals() {
//		return goalRepository.loadAll();
//	}
	
	public List<Goal> findAllGoals() {
	return goalRepository.findAll();
}

	public List<GoalReport> findAllGoalReports() {
		return goalRepository.findAllGoalReports();
	}

}
