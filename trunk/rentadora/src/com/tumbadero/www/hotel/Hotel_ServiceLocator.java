/**
 * Hotel_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tumbadero.www.hotel;

public class Hotel_ServiceLocator extends org.apache.axis.client.Service implements com.tumbadero.www.hotel.Hotel_Service {

    public Hotel_ServiceLocator() {
    }


    public Hotel_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Hotel_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for hotelSOAP
    private java.lang.String hotelSOAP_address = "http://localhost:8080/hotel/services/hotel";

    public java.lang.String gethotelSOAPAddress() {
        return hotelSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String hotelSOAPWSDDServiceName = "hotelSOAP";

    public java.lang.String gethotelSOAPWSDDServiceName() {
        return hotelSOAPWSDDServiceName;
    }

    public void sethotelSOAPWSDDServiceName(java.lang.String name) {
        hotelSOAPWSDDServiceName = name;
    }

    public com.tumbadero.www.hotel.Hotel_PortType gethotelSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(hotelSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return gethotelSOAP(endpoint);
    }

    public com.tumbadero.www.hotel.Hotel_PortType gethotelSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tumbadero.www.hotel.HotelSOAPStub _stub = new com.tumbadero.www.hotel.HotelSOAPStub(portAddress, this);
            _stub.setPortName(gethotelSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void sethotelSOAPEndpointAddress(java.lang.String address) {
        hotelSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tumbadero.www.hotel.Hotel_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tumbadero.www.hotel.HotelSOAPStub _stub = new com.tumbadero.www.hotel.HotelSOAPStub(new java.net.URL(hotelSOAP_address), this);
                _stub.setPortName(gethotelSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("hotelSOAP".equals(inputPortName)) {
            return gethotelSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.tumbadero.com/hotel/", "hotel");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.tumbadero.com/hotel/", "hotelSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("hotelSOAP".equals(portName)) {
            sethotelSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
