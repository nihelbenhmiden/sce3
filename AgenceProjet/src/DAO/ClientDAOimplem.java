package DAO;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;



import persistance.entities.Client;

public class ClientDAOimplem implements IClientDao {

	@Override
	public void add(Client C) {
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.save(C);
		tx.commit();
		s.close();
		
	}

	@Override
	public List<Client> findAll() {

		Session s=Dbsession.getSessionFactory().openSession();	
		List<Client> l=s.createQuery("from Client").list();
		s.close();
		return l;
		
	}

	@Override
	public void delete(Client C) {
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.delete(C);
		tx.commit();
		s.close();	// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client C) {
		// TODO Auto-generated method stub

		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.update(C);
		tx.commit();
		s.close();
	}

}
