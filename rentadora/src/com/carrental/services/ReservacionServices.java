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
			resp = "Se canceló con exito la reservación:" + idReservacion;
		} catch (Exception e) {
			resp = "No se pudo cancelar la reservación:" + idReservacion;
			e.printStackTrace();
		}
		
		return resp;
	}
	
	public String registrarReservacion(Reservacion res){
	 String resp="";
	 
	 	try{
	 		 reservacionDao.registrarReservacion(res);
			resp = "Se realizo con exito la reservación:"+res.getCliente();

	 	} catch(Exception e){
	 		resp = "No se pudo realizar la reservación:";
			e.printStackTrace();
	 	}
	 	
	return resp;
	
	}
	

}
