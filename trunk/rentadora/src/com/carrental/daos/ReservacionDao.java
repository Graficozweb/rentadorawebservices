package com.carrental.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.carrental.hibernate.HibernateUtil;
import com.carrental.rentadora.Renta;
import com.carrental.rentadora.Reservacion;
import com.carrental.rentadora.Vehiculo;

public class ReservacionDao {
	
	
	public void cancelarReservacion(int idReservacion) throws Exception {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Reservacion res = new Reservacion();
		
		res.setIdReservacion(idReservacion);
		session.delete(res);
		
		session.getTransaction().commit();
		
	}
	
	public Reservacion getReservacion(int id) throws Exception {
		ArrayList<Reservacion> reservaciones = new ArrayList<Reservacion>();
		//pido la session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//inicio la transaccion de la sesion.
		session.beginTransaction();
		
		String queryString = "FROM Reservacion v where id=" + id;
		
		//creo un objeto tipo query
		Query query = session.createQuery(queryString);
		//lo ejecuto
		reservaciones = (ArrayList<Reservacion>) query.list();
		//ejecuto la transaccion.
		session.getTransaction().commit();
		
		
		return reservaciones.get(0);
		
		
		
	}
	
	

	public void registrarReservacion(Reservacion res){
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
				
		session.save(res);
		
		session.getTransaction().commit();
		
	}
	
	public List<Reservacion> listReserv(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//inicio la transaccion de la sesion.
		session.beginTransaction();
		
		String queryString = "FROM Reservacion r";
		
		//creo un objeto tipo query
		Query query = session.createQuery(queryString);
		//lo ejecuto
		List<Reservacion>  rentas =  query.list();
		//ejecuto la transaccion.
		session.getTransaction().commit();
		
		return rentas;
	}

}
