package Bean;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import DAO.ClientDAOimplem;
import DAO.IClientDao;

import persistance.entities.Client;

//@ManagedBean
@ApplicationScoped
@ManagedBean(name="ClientManagedBean")
public class ClientManagedBean{
	Client selectClient=new Client();
	public Client getSelectClient() {
		
		return selectClient;
	}

	public void setSelectClient(Client selectClient) {
		this.selectClient = selectClient;
	}
	List<Client> listClient;
public List<Client> getListClient() {
	listClient=dao.findAll();
		return listClient;
	}

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}
Client C=new Client();
IClientDao dao=new ClientDAOimplem();
public Client getC() {
	return C;
}

public void setC(Client c) {
	C = c;
}
public void ajouter(ActionEvent e){
	dao.add(C);
}
public void supprimer(ActionEvent e){
	
	dao.delete(selectClient);
}
public String modifier(){
	return "modif";
}
public void modif2(){
	dao.update(selectClient);
}


}
