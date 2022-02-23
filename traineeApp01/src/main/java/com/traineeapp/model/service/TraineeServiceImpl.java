package com.traineeapp.model.service;

import java.util.*;

import com.traineeapp.model.dao.Trainee;
import com.traineeapp.model.dao.TraineeDao;
import com.traineeapp.model.dao.TraineeDaoImpl;
import com.traineeapp.model.exceptions.DataAccessException;

public class TraineeServiceImpl implements TraineeService{

	private TraineeDao traineeDao;
	
	public TraineeServiceImpl() {
		traineeDao = new TraineeDaoImpl();
	}

	public Trainee addTrainee(Trainee trainee) {
	
		return traineeDao.addTrainee(trainee);
	}

	public List<Trainee> getAll() throws DataAccessException {
		List<Trainee> trainees= new ArrayList<Trainee>();
		trainees = traineeDao.getAll();
		return trainees;
	}
	
	

}
