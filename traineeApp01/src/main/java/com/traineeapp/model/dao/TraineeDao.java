package com.traineeapp.model.dao;

import java.util.List;
import java.util.Optional;

import com.traineeapp.model.exceptions.DataAccessException;
import com.traineeapp.model.exceptions.TraineeNotFoundException;

public interface TraineeDao {
	

		public Trainee addTrainee(Trainee trainee);
		public List<Trainee> getAll() throws DataAccessException;
	

}
