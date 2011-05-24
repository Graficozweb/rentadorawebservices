/**
 * Flight.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flight.flightsService;

public class Flight  implements java.io.Serializable {
    private int flightID;

    private java.lang.String destiny;

    private java.lang.String type;

    private java.lang.String fligthClass;

    public Flight() {
    }

    public Flight(
           int flightID,
           java.lang.String destiny,
           java.lang.String type,
           java.lang.String fligthClass) {
           this.flightID = flightID;
           this.destiny = destiny;
           this.type = type;
           this.fligthClass = fligthClass;
    }


    /**
     * Gets the flightID value for this Flight.
     * 
     * @return flightID
     */
    public int getFlightID() {
        return flightID;
    }


    /**
     * Sets the flightID value for this Flight.
     * 
     * @param flightID
     */
    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }


    /**
     * Gets the destiny value for this Flight.
     * 
     * @return destiny
     */
    public java.lang.String getDestiny() {
        return destiny;
    }


    /**
     * Sets the destiny value for this Flight.
     * 
     * @param destiny
     */
    public void setDestiny(java.lang.String destiny) {
        this.destiny = destiny;
    }


    /**
     * Gets the type value for this Flight.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Flight.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the fligthClass value for this Flight.
     * 
     * @return fligthClass
     */
    public java.lang.String getFligthClass() {
        return fligthClass;
    }


    /**
     * Sets the fligthClass value for this Flight.
     * 
     * @param fligthClass
     */
    public void setFligthClass(java.lang.String fligthClass) {
        this.fligthClass = fligthClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Flight)) return false;
        Flight other = (Flight) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.flightID == other.getFlightID() &&
            ((this.destiny==null && other.getDestiny()==null) || 
             (this.destiny!=null &&
              this.destiny.equals(other.getDestiny()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.fligthClass==null && other.getFligthClass()==null) || 
             (this.fligthClass!=null &&
              this.fligthClass.equals(other.getFligthClass())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getFlightID();
        if (getDestiny() != null) {
            _hashCode += getDestiny().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getFligthClass() != null) {
            _hashCode += getFligthClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Flight.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flight.com/flightsService/", "Flight"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "flightID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destiny");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "destiny"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fligthClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "fligthClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
