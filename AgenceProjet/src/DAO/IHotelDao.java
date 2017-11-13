package DAO;

import java.util.List;

import persistance.entities.Client;
import persistance.entities.Hotel;

public interface IHotelDao {
	public void add(Hotel H); 
	public List<Hotel> findAll();
	public void delete(Hotel H);
	public void update(Hotel H);
}
