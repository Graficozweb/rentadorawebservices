package com.carrental.daos;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;

import com.carrental.hibernate.HibernateUtil;
import com.carrental.rentadora.Vehiculo;

public class VehiculoDao {
	
	public ArrayList<Vehiculo> consultarVehiculos(String condicion) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		//pido la session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//inicio la transaccion de la sesion.
		session.beginTransaction();
		
		String queryString = "FROM Vehiculo v" + condicion;
		
		//creo un objeto tipo query
		Query query = session.createQuery(queryString);
		//lo ejecuto
		vehiculos = (ArrayList<Vehiculo>) query.list();
		//ejecuto la transaccion.
		session.getTransaction().commit();
		
		return vehiculos;
	}
	
	public void rentarVehiculo(int id) throws Exception {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		//pido la session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//inicio la transaccion de la sesion.
		session.beginTransaction();
		
		String queryString = "FROM Vehiculo v where id=" + id;
		
		//creo un objeto tipo query
		Query query = session.createQuery(queryString);
		//lo ejecuto
		vehiculos = (ArrayList<Vehiculo>) query.list();
		//ejecuto la transaccion.
		session.getTransaction().commit();
		
		
		Vehiculo v = vehiculos.get(0);
		
		if (v.getEstaRentado()) {
			throw new Exception("El vehiculo ya esta rentado/reservado");
		}
		
		v.setEstaRentado(true);
		
		Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
		//inicio la transaccion de la sesion.
		session2.beginTransaction();
		
		session2.update(v);
		session2.getTransaction().commit();
		
		
	}
	
	public void liberarVehiculo(int id) throws Exception {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		//pido la session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//inicio la transaccion de la sesion.
		session.beginTransaction();
		
		String queryString = "FROM Vehiculo v where id=" + id;
		
		//creo un objeto tipo query
		Query query = session.createQuery(queryString);
		//lo ejecuto
		vehiculos = (ArrayList<Vehiculo>) query.list();
		//ejecuto la transaccion.
		session.getTransaction().commit();
		
		
		Vehiculo v = vehiculos.get(0);
		
		if (!v.getEstaRentado()) {
			throw new Exception("El vehiculo no está rentado/reservado");
		}
		
		v.setEstaRentado(false);
		
		Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
		//inicio la transaccion de la sesion.
		session2.beginTransaction();
		
		session2.update(v);
		session2.getTransaction().commit();
		
		
	}
	
	

}
