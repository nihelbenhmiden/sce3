package Bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import persistance.entities.Reservation;
import DAO.IReservationDao;
import DAO.ReservationDAOimplem;
@ManagedBean(name="ReservationManagedBean")
public class ReservationManagedBean {
IReservationDao resrvation=new ReservationDAOimplem();
Reservation R=new Reservation();
List<Reservation> listR;
public IReservationDao getResrvation() {
	return resrvation;
}
public void setResrvation(IReservationDao resrvation) {
	this.resrvation = resrvation;
}
public Reservation getR() {
	return R;
}
public void setR(Reservation r) {
	R = r;
}
public List<Reservation> getListR() {
	return listR;
}
public void setListR(List<Reservation> listR) {
	this.listR = listR;
}
public void ajout(ActionEvent e){
	resrvation.add(R);
}
public void update(ActionEvent a){
	resrvation.update(R);
}
public void delete(ActionEvent a){
	resrvation.delete(R);
}
}
