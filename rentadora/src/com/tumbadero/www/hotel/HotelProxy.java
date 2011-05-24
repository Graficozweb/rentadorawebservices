package com.tumbadero.www.hotel;

public class HotelProxy implements com.tumbadero.www.hotel.Hotel_PortType {
  private String _endpoint = null;
  private com.tumbadero.www.hotel.Hotel_PortType hotel_PortType = null;
  
  public HotelProxy() {
    _initHotelProxy();
  }
  
  public HotelProxy(String endpoint) {
    _endpoint = endpoint;
    _initHotelProxy();
  }
  
  private void _initHotelProxy() {
    try {
      hotel_PortType = (new com.tumbadero.www.hotel.Hotel_ServiceLocator()).gethotelSOAP();
      if (hotel_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hotel_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hotel_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hotel_PortType != null)
      ((javax.xml.rpc.Stub)hotel_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.tumbadero.www.hotel.Hotel_PortType getHotel_PortType() {
    if (hotel_PortType == null)
      _initHotelProxy();
    return hotel_PortType;
  }
  
  public com.tumbadero.www.hotel.Habitacion[] consultarHabitacion(boolean libre) throws java.rmi.RemoteException{
    if (hotel_PortType == null)
      _initHotelProxy();
    return hotel_PortType.consultarHabitacion(libre);
  }
  
  public java.lang.String reservarHabitacion(com.tumbadero.www.hotel.Reservacion reservacion) throws java.rmi.RemoteException{
    if (hotel_PortType == null)
      _initHotelProxy();
    return hotel_PortType.reservarHabitacion(reservacion);
  }
  
  public java.lang.String registrarCliente(com.tumbadero.www.hotel.Cliente cliente) throws java.rmi.RemoteException{
    if (hotel_PortType == null)
      _initHotelProxy();
    return hotel_PortType.registrarCliente(cliente);
  }
  
  public java.lang.String comprarPassDate(com.tumbadero.www.hotel.PassDate passDate) throws java.rmi.RemoteException{
    if (hotel_PortType == null)
      _initHotelProxy();
    return hotel_PortType.comprarPassDate(passDate);
  }
  
  
}