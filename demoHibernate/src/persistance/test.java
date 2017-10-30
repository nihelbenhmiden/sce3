package persistance;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

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
	s.close();
	return l;
	
	
}
public Client findByid(int x){
	Session s=Dbsession.getSessionFactory().openSession();
	Client client=(Client)s.get(Client.class,x);
	s.close();
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
public List<Client> findbycritere(String Nom){
	Session s=Dbsession.getSessionFactory().openSession();
	Criteria crt=s.createCriteria(Client.class);
	Criterion c=Restrictions.eq("nom",Nom);
	crt.add(c);
	s.close();
	return crt.list();
}
public static void main(String[] args) {
	test t=new test();
	Client c=new Client();
	c.setIdClient(2166);
	c.setNom("nihel");
	c.setPrenom("ben messao");
	c.setAdresse("ariena");
	t.ajouter(c);
	c=t.findByid(147);
	supprimer(c);
	t.ajouter(c);
	c=t.findByid(123);
	c.setNom("nanou");
	t.update(c);
	List<Client> L;
	L=t.findbycritere("nihel");
	for (int i = 0; i<L.size();i++){
	
		System.out.print(L.get(i).getPrenom()+"--");
	}
	//System.out.println(c.getNom());
	//List<Client> clients=t.findAll();
     //for(int i=0;i<clients.size();i++){
	//System.out.println(clients.get(i).getNom()+" "+clients.get(i).getPrenom());
}	
}
