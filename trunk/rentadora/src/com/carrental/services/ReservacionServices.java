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
			resp = "Se canceló con exito la reservación:" + idReservacion;
		} catch (Exception e) {
			resp = "No se pudo cancelar la reservación:" + idReservacion;
			e.printStackTrace();
		}
		
		return resp;
	}

}
