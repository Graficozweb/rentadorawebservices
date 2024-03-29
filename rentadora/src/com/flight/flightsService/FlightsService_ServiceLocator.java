/**
 * FlightsService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flight.flightsService;

public class FlightsService_ServiceLocator extends org.apache.axis.client.Service implements com.flight.flightsService.FlightsService_Service {

    public FlightsService_ServiceLocator() {
    }


    public FlightsService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FlightsService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for flightsServiceSOAP
    private java.lang.String flightsServiceSOAP_address = "http://localhost:8080/flights/services/flightsService";

    public java.lang.String getflightsServiceSOAPAddress() {
        return flightsServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String flightsServiceSOAPWSDDServiceName = "flightsServiceSOAP";

    public java.lang.String getflightsServiceSOAPWSDDServiceName() {
        return flightsServiceSOAPWSDDServiceName;
    }

    public void setflightsServiceSOAPWSDDServiceName(java.lang.String name) {
        flightsServiceSOAPWSDDServiceName = name;
    }

    public com.flight.flightsService.FlightsService_PortType getflightsServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(flightsServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getflightsServiceSOAP(endpoint);
    }

    public com.flight.flightsService.FlightsService_PortType getflightsServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.flight.flightsService.FlightsServiceSOAPStub _stub = new com.flight.flightsService.FlightsServiceSOAPStub(portAddress, this);
            _stub.setPortName(getflightsServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setflightsServiceSOAPEndpointAddress(java.lang.String address) {
        flightsServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.flight.flightsService.FlightsService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.flight.flightsService.FlightsServiceSOAPStub _stub = new com.flight.flightsService.FlightsServiceSOAPStub(new java.net.URL(flightsServiceSOAP_address), this);
                _stub.setPortName(getflightsServiceSOAPWSDDServiceName());
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
        if ("flightsServiceSOAP".equals(inputPortName)) {
            return getflightsServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://flight.com/flightsService/", "flightsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://flight.com/flightsService/", "flightsServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("flightsServiceSOAP".equals(portName)) {
            setflightsServiceSOAPEndpointAddress(address);
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
