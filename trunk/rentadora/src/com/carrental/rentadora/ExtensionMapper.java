
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:19:26 CET)
 */

        
            package com.carrental.rentadora;
        
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://carrental.com/rentadora/".equals(namespaceURI) &&
                  "Renta".equals(typeName)){
                   
                            return  com.carrental.rentadora.Renta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://carrental.com/rentadora/".equals(namespaceURI) &&
                  "vehiculo".equals(typeName)){
                   
                            return  com.carrental.rentadora.Vehiculo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://carrental.com/rentadora/".equals(namespaceURI) &&
                  "Reservacion".equals(typeName)){
                   
                            return  com.carrental.rentadora.Reservacion.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    