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
			Reservacion res = reservacionDao.getReservacion(idReservacion);
			new  VehiculoServices().liberarVehiculo(res.getVehiculo().getIdVehiculo());
			reservacionDao.cancelarReservacion(idReservacion);
			resp = "Se cancel� con exito la reservaci�n:" + idReservacion;
			System.out.println("[Car Rental]: "+resp);
		} catch (Exception e) {
			resp = "No se pudo cancelar la reservaci�n: " + idReservacion + " " + e.getMessage();
			System.out.println("[Car Rental]: "+resp);
			e.printStackTrace();
		}
		
		return resp;
	}
	
	public String registrarReservacion(Reservacion res){
	 String resp="";
	 
	 	try{
	 		System.out.println("[Car Rental]: Registrando nueva RESERVACION...");
	 		System.out.println("[Car Rental]: Datos de la reservacion --> cliente:" + res.getCliente());
	 		 new VehiculoServices().rentarVehiculo(res.getVehiculo().getIdVehiculo());
	 		 reservacionDao.registrarReservacion(res);
			resp = "Se realizo con exito la reservaci�n: "+res.getCliente() +  " numero:"+ res.getIdReservacion();
			System.out.println("[Car Rental]: "+resp);
	 	} catch(Exception e){
	 		resp = "No se pudo realizar la reservaci�n:"+e.getMessage();;
	 		System.out.println("[Car Rental]: "+resp);
			e.printStackTrace();
	 	}
	 	
	return resp;
	
	}
	

}
