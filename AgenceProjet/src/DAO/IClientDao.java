package DAO;

import java.util.List;

import persistance.entities.Client;

public interface IClientDao {
public void add(Client C); 
public List<Client> findAll();
public void delete(Client C);
public void update(Client C);

}
