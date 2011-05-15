package com.carrental.services;

import com.carrental.daos.ReservacionDao;
import com.carrental.rentadora.Reservacion;

public class ReservacionServices {
	
	private ReservacionDao reservacionDao;
	
	public ReservacionServices() {
		reservacionDao = new ReservacionDao();
	}
	
	
	public String cancelarReservacion(int idReservacion) {
		String resp = "";
		
		try {
			reservacionDao.cancelarReservacion(idReservacion);
			resp = "Se cancel� con exito la reservaci�n:" + idReservacion;
		} catch (Exception e) {
			resp = "No se pudo cancelar la reservaci�n:" + idReservacion;
			e.printStackTrace();
		}
		
		return resp;
	}
	
	public String registrarReservacion(Reservacion res){
	 String resp="";
	 
	 	try{
	 		 reservacionDao.registrarReservacion(res);
			resp = "Se realizo con exito la reservaci�n:"+res.getCliente();

	 	} catch(Exception e){
	 		resp = "No se pudo realizar la reservaci�n:";
			e.printStackTrace();
	 	}
	 	
	return resp;
	
	}
	

}
