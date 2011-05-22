package com.carrental.services;

import com.carrental.daos.RentaDao;
import com.carrental.rentadora.Renta;

public class RentaServices {
	
	private RentaDao rentaDao;
		
	
	public RentaServices() {
		
		this.rentaDao = new RentaDao();
		
	}



	public String registrarRenta(Renta ren){
		
		String resp="";
		 
	 	try{
	 		System.out.println("[Car Rental]: Registrando nueva renta...");
	 		System.out.println("[Car Rental]: Datos de la renta --> cliente:" + ren.getCliente() + ", Vehiculo:" + ren.getVehiculo().getModelo() == null? "":ren.getVehiculo().getModelo());
	 		 rentaDao.registrarRenta(ren);
			resp = "Se realizo con exito la Renta:"+ren.getCliente()+" Vehiculo:"+ren.getVehiculo().getModelo() == null? "":ren.getVehiculo().getModelo();
			System.out.println("[Car Rental]: "+resp);
	 	} catch(Exception e){
	 		resp = "No se pudo realizar la renta:";
	 		System.out.println("[Car Rental]: "+resp);
			e.printStackTrace();
	 	}
	 	
	return resp;
		
	}

}
