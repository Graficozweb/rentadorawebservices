
/**
 * RentadoraMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
        package com.carrental.rentadora;

        /**
        *  RentadoraMessageReceiverInOut message receiver
        */

        public class RentadoraMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        RentadoraSkeletonInterface skel = (RentadoraSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        

            if("registrarReservacionVehiculo".equals(methodName)){
                
                com.carrental.rentadora.RegistrarReservacionVehiculoResponse registrarReservacionVehiculoResponse9 = null;
	                        com.carrental.rentadora.RegistrarReservacionVehiculo wrappedParam =
                                                             (com.carrental.rentadora.RegistrarReservacionVehiculo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.carrental.rentadora.RegistrarReservacionVehiculo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registrarReservacionVehiculoResponse9 =
                                                   
                                                   
                                                         skel.registrarReservacionVehiculo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registrarReservacionVehiculoResponse9, false);
                                    } else 

            if("cancelarReservacion".equals(methodName)){
                
                com.carrental.rentadora.CancelarReservacionResponse cancelarReservacionResponse11 = null;
	                        com.carrental.rentadora.CancelarReservacion wrappedParam =
                                                             (com.carrental.rentadora.CancelarReservacion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.carrental.rentadora.CancelarReservacion.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancelarReservacionResponse11 =
                                                   
                                                   
                                                         skel.cancelarReservacion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancelarReservacionResponse11, false);
                                    } else 

            if("registrarRentaVehiculo".equals(methodName)){
                
                com.carrental.rentadora.RegistrarRentaVehiculoResponse registrarRentaVehiculoResponse13 = null;
	                        com.carrental.rentadora.RegistrarRentaVehiculo wrappedParam =
                                                             (com.carrental.rentadora.RegistrarRentaVehiculo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.carrental.rentadora.RegistrarRentaVehiculo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registrarRentaVehiculoResponse13 =
                                                   
                                                   
                                                         skel.registrarRentaVehiculo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registrarRentaVehiculoResponse13, false);
                                    } else 

            if("consultarVehiculos".equals(methodName)){
                
                com.carrental.rentadora.ConsultarVehiculosResponse consultarVehiculosResponse15 = null;
	                        com.carrental.rentadora.ConsultarVehiculos wrappedParam =
                                                             (com.carrental.rentadora.ConsultarVehiculos)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.carrental.rentadora.ConsultarVehiculos.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               consultarVehiculosResponse15 =
                                                   
                                                   
                                                         skel.consultarVehiculos(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), consultarVehiculosResponse15, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.carrental.rentadora.RegistrarReservacionVehiculo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.carrental.rentadora.RegistrarReservacionVehiculo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.carrental.rentadora.RegistrarReservacionVehiculoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.carrental.rentadora.RegistrarReservacionVehiculoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.carrental.rentadora.CancelarReservacion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.carrental.rentadora.CancelarReservacion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.carrental.rentadora.CancelarReservacionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.carrental.rentadora.CancelarReservacionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.carrental.rentadora.RegistrarRentaVehiculo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.carrental.rentadora.RegistrarRentaVehiculo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.carrental.rentadora.RegistrarRentaVehiculoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.carrental.rentadora.RegistrarRentaVehiculoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.carrental.rentadora.ConsultarVehiculos param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.carrental.rentadora.ConsultarVehiculos.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.carrental.rentadora.ConsultarVehiculosResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.carrental.rentadora.ConsultarVehiculosResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.carrental.rentadora.RegistrarReservacionVehiculoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.carrental.rentadora.RegistrarReservacionVehiculoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.carrental.rentadora.RegistrarReservacionVehiculoResponse wrapregistrarReservacionVehiculo(){
                                com.carrental.rentadora.RegistrarReservacionVehiculoResponse wrappedElement = new com.carrental.rentadora.RegistrarReservacionVehiculoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.carrental.rentadora.CancelarReservacionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.carrental.rentadora.CancelarReservacionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.carrental.rentadora.CancelarReservacionResponse wrapcancelarReservacion(){
                                com.carrental.rentadora.CancelarReservacionResponse wrappedElement = new com.carrental.rentadora.CancelarReservacionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.carrental.rentadora.RegistrarRentaVehiculoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.carrental.rentadora.RegistrarRentaVehiculoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.carrental.rentadora.RegistrarRentaVehiculoResponse wrapregistrarRentaVehiculo(){
                                com.carrental.rentadora.RegistrarRentaVehiculoResponse wrappedElement = new com.carrental.rentadora.RegistrarRentaVehiculoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.carrental.rentadora.ConsultarVehiculosResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.carrental.rentadora.ConsultarVehiculosResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.carrental.rentadora.ConsultarVehiculosResponse wrapconsultarVehiculos(){
                                com.carrental.rentadora.ConsultarVehiculosResponse wrappedElement = new com.carrental.rentadora.ConsultarVehiculosResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.carrental.rentadora.RegistrarReservacionVehiculo.class.equals(type)){
                
                           return com.carrental.rentadora.RegistrarReservacionVehiculo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.carrental.rentadora.RegistrarReservacionVehiculoResponse.class.equals(type)){
                
                           return com.carrental.rentadora.RegistrarReservacionVehiculoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.carrental.rentadora.CancelarReservacion.class.equals(type)){
                
                           return com.carrental.rentadora.CancelarReservacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.carrental.rentadora.CancelarReservacionResponse.class.equals(type)){
                
                           return com.carrental.rentadora.CancelarReservacionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.carrental.rentadora.RegistrarRentaVehiculo.class.equals(type)){
                
                           return com.carrental.rentadora.RegistrarRentaVehiculo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.carrental.rentadora.RegistrarRentaVehiculoResponse.class.equals(type)){
                
                           return com.carrental.rentadora.RegistrarRentaVehiculoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.carrental.rentadora.ConsultarVehiculos.class.equals(type)){
                
                           return com.carrental.rentadora.ConsultarVehiculos.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.carrental.rentadora.ConsultarVehiculosResponse.class.equals(type)){
                
                           return com.carrental.rentadora.ConsultarVehiculosResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    