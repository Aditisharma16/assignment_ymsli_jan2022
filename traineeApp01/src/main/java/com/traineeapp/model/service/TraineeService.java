package com.traineeapp.model.service;

import java.util.List;

import com.traineeapp.model.dao.Trainee;
import com.traineeapp.model.exceptions.DataAccessException;

public interface TraineeService {
		public Trainee addTrainee(Trainee trainee);
		public List<Trainee> getAll() throws DataAccessException;

	}


