package DAO;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import persistance.entities.Client;
import persistance.entities.Hotel;

public class HotzlDAOimplem implements IHotelDao {

	@Override
	public void add(Hotel H) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.save(H);
		tx.commit();
		s.close();
		
	}

	@Override
	public List<Hotel> findAll() {
		Session s=Dbsession.getSessionFactory().openSession();	
		List<Hotel> l=s.createQuery("from Hotel").list();
		s.close();
		return l;
	}

	@Override
	public void delete(Hotel H) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.delete(H);
		tx.commit();
		s.close();
		
	}

	@Override
	public void update(Hotel H) {
		// TODO Auto-generated method stub

		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.update(H);
		tx.commit();
		s.close();
		
	}

}
