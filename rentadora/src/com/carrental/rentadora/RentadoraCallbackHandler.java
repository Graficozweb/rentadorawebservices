
/**
 * RentadoraCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package com.carrental.rentadora;

    /**
     *  RentadoraCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class RentadoraCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public RentadoraCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public RentadoraCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for registrarReservacionVehiculo method
            * override this method for handling normal response from registrarReservacionVehiculo operation
            */
           public void receiveResultregistrarReservacionVehiculo(
                    com.carrental.rentadora.RegistrarReservacionVehiculoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registrarReservacionVehiculo operation
           */
            public void receiveErrorregistrarReservacionVehiculo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelarReservacion method
            * override this method for handling normal response from cancelarReservacion operation
            */
           public void receiveResultcancelarReservacion(
                    com.carrental.rentadora.CancelarReservacionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelarReservacion operation
           */
            public void receiveErrorcancelarReservacion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registrarRentaVehiculo method
            * override this method for handling normal response from registrarRentaVehiculo operation
            */
           public void receiveResultregistrarRentaVehiculo(
                    com.carrental.rentadora.RegistrarRentaVehiculoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registrarRentaVehiculo operation
           */
            public void receiveErrorregistrarRentaVehiculo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarVehiculos method
            * override this method for handling normal response from consultarVehiculos operation
            */
           public void receiveResultconsultarVehiculos(
                    com.carrental.rentadora.ConsultarVehiculosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarVehiculos operation
           */
            public void receiveErrorconsultarVehiculos(java.lang.Exception e) {
            }
                


    }
    