package DAO;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import persistance.entities.Client;
import persistance.entities.Hotel;
import persistance.entities.Reservation;

public class ReservationDAOimplem implements IReservationDao{

	@Override
	public void add(Reservation R) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.save(R);
		tx.commit();
		s.close();
	}

	@Override
	public List<Reservation> findAll() {
		Session s=Dbsession.getSessionFactory().openSession();	
		List<Reservation> l=s.createQuery("from reservation").list();
		s.close();
		return l;
	}

	@Override
	public void delete(Reservation R) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.delete(R);
		tx.commit();
		s.close();
		
	}

	@Override
	public void update(Reservation R) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.update(R);
		tx.commit();
		s.close();
		
	}

}
