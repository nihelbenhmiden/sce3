package Bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import DAO.HotzlDAOimplem;
import DAO.IHotelDao;
import persistance.entities.Hotel;
@ManagedBean(name="HotelManagedBean")
public class HotelManagedBean {
	Hotel h=new Hotel();
	IHotelDao dao1=new HotzlDAOimplem();
	List<Hotel> ListH;
public IHotelDao getDao1() {
		return dao1;
	}

	public void setDao1(IHotelDao dao1) {
		this.dao1 = dao1;
	}

	public List<Hotel> getListH() {
		this.ListH=dao1.findAll();
		return ListH;
	}

	public void setListH(List<Hotel> listH) {
		
		ListH = listH;
	}



public Hotel getH() {
	return h;
}

public void setH(Hotel h) {
	this.h= h;
}
public void ajouterH(ActionEvent e){
	dao1.add(h);
}

}
