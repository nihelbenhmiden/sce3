package DAO;

import java.util.List;

import persistance.entities.Client;
import persistance.entities.Reservation;

public interface IReservationDao {

		public void add(Reservation R); 
		public List<Reservation> findAll();
		public void delete(Reservation R);
		public void update(Reservation R);
}
