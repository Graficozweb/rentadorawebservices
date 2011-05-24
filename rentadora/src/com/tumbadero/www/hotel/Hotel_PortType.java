/**
 * Hotel_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tumbadero.www.hotel;

public interface Hotel_PortType extends java.rmi.Remote {
    public com.tumbadero.www.hotel.Habitacion[] consultarHabitacion(boolean libre) throws java.rmi.RemoteException;
    public java.lang.String reservarHabitacion(com.tumbadero.www.hotel.Reservacion reservacion) throws java.rmi.RemoteException;
    public java.lang.String registrarCliente(com.tumbadero.www.hotel.Cliente cliente) throws java.rmi.RemoteException;
    public java.lang.String comprarPassDate(com.tumbadero.www.hotel.PassDate passDate) throws java.rmi.RemoteException;
}
