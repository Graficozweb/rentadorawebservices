package com.carrental.daos;

import org.hibernate.Query;
import org.hibernate.Session;

import com.carrental.hibernate.HibernateUtil;
import com.carrental.rentadora.Reservacion;

public class ReservacionDao {
	
	
	public void cancelarReservacion(int idReservacion) throws Exception {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Reservacion res = new Reservacion();
		
		res.setIdReservacion(idReservacion);
		session.delete(res);
		
		session.getTransaction().commit();
		
	}
	
	

	public void registrarReservacion(Reservacion res){
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
				
		session.save(res);
		
		session.getTransaction().commit();
		
	}

}
