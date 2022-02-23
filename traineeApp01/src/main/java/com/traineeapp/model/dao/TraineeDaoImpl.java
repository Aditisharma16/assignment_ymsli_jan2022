package com.traineeapp.model.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.traineeapp.model.factory.HibernateSessionFactory;
import com.traineeapp.model.exceptions.DataAccessException;

public class TraineeDaoImpl implements TraineeDao {

	private SessionFactory factory;

	public TraineeDaoImpl() {
		factory = HibernateSessionFactory.getSessionFactory();
	}

	public Trainee addTrainee(Trainee trainee) {
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(trainee);

			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			throw new DataAccessException(ex);
		}
		session.close();
		return trainee;

	}

	public List<Trainee> getAll() {
		Session session = factory.openSession();
		List<Trainee> trainees = session.createQuery("select t from Trainee t", Trainee.class).getResultList();
		session.close();
		return trainees;
	}

}
