package com.carrental.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.carrental.hibernate.HibernateUtil;
import com.carrental.rentadora.Renta;
import com.carrental.rentadora.Vehiculo;

public class RentaDao {

	public void registrarRenta(Renta ren){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
				
		session.save(ren);
		
		session.getTransaction().commit();
	}
	
	public List<Renta> listRenta() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//inicio la transaccion de la sesion.
		session.beginTransaction();
		
		String queryString = "FROM Renta r";
		
		//creo un objeto tipo query
		Query query = session.createQuery(queryString);
		//lo ejecuto
		List<Renta>  rentas =  query.list();
		//ejecuto la transaccion.
		session.getTransaction().commit();
		
		return rentas;
	}
	
	
	
}
