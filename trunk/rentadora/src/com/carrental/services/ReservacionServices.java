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
			System.out.println("[Car Rental]: Registrando nueva cancelacion de reserviacion...");
			System.out.println("[Car Rental]: numero de reservacion "+idReservacion);
			reservacionDao.cancelarReservacion(idReservacion);
			resp = "Se canceló con exito la reservación:" + idReservacion;
			System.out.println("[Car Rental]: "+resp);
		} catch (Exception e) {
			resp = "No se pudo cancelar la reservación:" + idReservacion;
			System.out.println("[Car Rental]: "+resp);
			e.printStackTrace();
		}
		
		return resp;
	}
	
	public String registrarReservacion(Reservacion res){
	 String resp="";
	 
	 	try{
	 		System.out.println("[Car Rental]: Registrando nueva RESERVACION...");
	 		System.out.println("[Car Rental]: Datos de la reservacion --> cliente:" + res.getCliente() + ", Vehiculo:" + res.getVehiculo().getModelo() == null? "":res.getVehiculo().getModelo());
	 		 
	 		 reservacionDao.registrarReservacion(res);
			resp = "Se realizo con exito la reservación:"+res.getCliente();
			System.out.println("[Car Rental]: "+resp);
	 	} catch(Exception e){
	 		resp = "No se pudo realizar la reservación:";
	 		System.out.println("[Car Rental]: "+resp);
			e.printStackTrace();
	 	}
	 	
	return resp;
	
	}
	

}
