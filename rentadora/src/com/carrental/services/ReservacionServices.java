package com.carrental.services;

import com.carrental.daos.ReservacionDao;

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

}
