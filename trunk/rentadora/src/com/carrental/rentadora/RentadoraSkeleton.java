
/**
 * RentadoraSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
package com.carrental.rentadora;

import java.util.ArrayList;

import com.carrental.services.ReservacionServices;
import com.carrental.services.VehiculoServices;

/**
 *  RentadoraSkeleton java skeleton for the axisService
 */
public class RentadoraSkeleton implements RentadoraSkeletonInterface{


	/**
	 * Auto generated method signature
	 * 
	 * @param registrarReservacionVehiculo0
	 */

	public com.carrental.rentadora.RegistrarReservacionVehiculoResponse registrarReservacionVehiculo
	(
			com.carrental.rentadora.RegistrarReservacionVehiculo registrarReservacionVehiculo0
	)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#registrarReservacionVehiculo");
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param cancelarReservacion2
	 */

	public com.carrental.rentadora.CancelarReservacionResponse 
		cancelarReservacion(com.carrental.rentadora.CancelarReservacion request){
		int id = request.getIdReservacion();
		
		ReservacionServices servicio = new ReservacionServices();
		
		String respuesta = servicio.cancelarReservacion(id);
		
		CancelarReservacionResponse response = new CancelarReservacionResponse();
		
		response.setMensaje(respuesta);
		
		return response;
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param registrarRentaVehiculo4
	 */

	public com.carrental.rentadora.RegistrarRentaVehiculoResponse registrarRentaVehiculo
	(
			com.carrental.rentadora.RegistrarRentaVehiculo registrarRentaVehiculo4
	)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#registrarRentaVehiculo");
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param consultarVehiculos6
	 */

	public com.carrental.rentadora.ConsultarVehiculosResponse consultarVehiculos(com.carrental.rentadora.ConsultarVehiculos request) {
		
		int anio = request.getAnioModelo();
		String modelo = request.getModelo();
		int numper = request.getNumper();
		float precio = request.getPrecioPorDia();
		System.out.println(anio + " " + modelo + " " + numper + " " + precio);
		
		VehiculoServices servicio = new VehiculoServices();
		
		ConsultarVehiculosResponse response = new ConsultarVehiculosResponse();
		ArrayList<Vehiculo> vehiculosList = servicio.consultarVehiculos(anio, modelo, numper, precio);
		
		Vehiculo [] vehiculosArray = new Vehiculo[vehiculosList.size()];
		for (int i = 0; i < vehiculosList.size(); i++) {
			vehiculosArray[i] = vehiculosList.get(i);
		}
		response.setVehiculos(vehiculosArray);
		
		return response;
		//throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#consultarVehiculos");
	}

}
