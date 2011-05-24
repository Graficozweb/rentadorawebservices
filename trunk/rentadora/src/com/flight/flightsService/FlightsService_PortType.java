/**
 * FlightsService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flight.flightsService;

public interface FlightsService_PortType extends java.rmi.Remote {
    public java.lang.String reserveSeat(java.lang.String client, com.flight.flightsService.Seat seats) throws java.rmi.RemoteException;
    public java.lang.String paySeat(java.lang.String seat) throws java.rmi.RemoteException;
    public com.flight.flightsService.Flight[] searchFlightByDestiny(java.lang.String destiny) throws java.rmi.RemoteException;
    public com.flight.flightsService.Seat[] getAvailableSeats(java.lang.String flight) throws java.rmi.RemoteException;
}
