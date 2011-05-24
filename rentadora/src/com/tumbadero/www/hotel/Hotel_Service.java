/**
 * Hotel_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tumbadero.www.hotel;

public interface Hotel_Service extends javax.xml.rpc.Service {
    public java.lang.String gethotelSOAPAddress();

    public com.tumbadero.www.hotel.Hotel_PortType gethotelSOAP() throws javax.xml.rpc.ServiceException;

    public com.tumbadero.www.hotel.Hotel_PortType gethotelSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
