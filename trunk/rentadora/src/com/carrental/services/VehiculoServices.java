package com.carrental.services;

import java.util.ArrayList;

import com.carrental.daos.VehiculoDao;
import com.carrental.rentadora.Vehiculo;

public class VehiculoServices {
	
	private VehiculoDao vehiculoDao;
	
	public VehiculoServices() {
		vehiculoDao = new VehiculoDao();
	}
	
	public ArrayList<Vehiculo> consultarVehiculos(int anio, String modelo, int numper, float precio) {
		String condicion = "";
		
		if (anio > 0) {
			condicion += " WHERE v.anioModelo LIKE '%"+anio+"%'";
		} 
		
		
		
		if (!modelo.isEmpty()) {
			if (condicion.isEmpty()) {
				condicion += " WHERE UPPER(v.modelo) LIKE '%" + modelo.toUpperCase() +"%'";
			} else {
				condicion += " OR UPPER(v.modelo) LIKE '%" +  modelo.toUpperCase() +"%'";
			}
		}
		
		if (numper > 0) {
			if (condicion.isEmpty()) {
				condicion += " WHERE v.numper =" + numper ;
			} else {
				condicion += " OR v.numper =" + numper;
			}
		}
		
		if (precio > 0) {
			if (condicion.isEmpty()) {
				condicion += " WHERE v.precioPorDia =" + precio ;
			} else {
				condicion += " OR v.precioPorDia =" + precio;
			}
		}
		
		
		return vehiculoDao.consultarVehiculos(condicion);
	}

}
