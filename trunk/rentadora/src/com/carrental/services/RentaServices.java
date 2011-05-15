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
	 		 rentaDao.registrarRenta(ren);
			resp = "Se realizo con exito la Renta:"+ren.getCliente()+" Vehiculo:"+ren.getVehiculo().getModelo();

	 	} catch(Exception e){
	 		resp = "No se pudo realizar la renta:";
			e.printStackTrace();
	 	}
	 	
	return resp;
		
	}

}
