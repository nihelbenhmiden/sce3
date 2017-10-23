package persistance;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

public class test {
public void ajouter(Client C){
	
	
	Session s=Dbsession.getSessionFactory().openSession();
	Transaction tx=s.beginTransaction();
	s.save(C);
	tx.commit();
	s.close();	
}

public List<Client> findAll(){
	
	Session s=Dbsession.getSessionFactory().openSession();	
	List<Client> l=s.createQuery("from Client").list();
	
	return l;
	
	
}
public Client findByid(int x){
	Session s=Dbsession.getSessionFactory().openSession();
	Client client=(Client)s.get(Client.class,x);
	
	return client;
	
}
public static void supprimer(Client c){
	
	
	Session s=Dbsession.getSessionFactory().openSession();
	Transaction tx=s.beginTransaction();
	s.delete(c);
	tx.commit();
	s.close();	
}
public void update(Client c){
	
	
	Session s=Dbsession.getSessionFactory().openSession();
	Transaction tx=s.beginTransaction();
	s.update(c);
	tx.commit();
	s.close();	
}
public static void main(String[] args) {
	test t=new test();
	Client c=new Client();
	c.setIdClient(147);
	c.setNom("nihel");
	c.setPrenom("bh");
	c.setAdresse("ariena");
	t.ajouter(c);
	c=t.findByid(147);
	supprimer(c);
	t.ajouter(c);
	c=t.findByid(123);
	c.setNom("nanou");
	t.update(c);
	//System.out.println(c.getNom());
	//List<Client> clients=t.findAll();
     //for(int i=0;i<clients.size();i++){
	//System.out.println(clients.get(i).getNom()+" "+clients.get(i).getPrenom());
}	
}
