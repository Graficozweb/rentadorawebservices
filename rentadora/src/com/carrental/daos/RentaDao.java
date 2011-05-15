package com.carrental.daos;

import org.hibernate.Query;
import org.hibernate.Session;

import com.carrental.hibernate.HibernateUtil;
import com.carrental.rentadora.Renta;

public class RentaDao {

	public void registrarRenta(Renta ren){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
				
		session.save(ren);
		
		session.getTransaction().commit();
	}
	
	
	
}
