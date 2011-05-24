/**
 * Seat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flight.flightsService;

public class Seat  implements java.io.Serializable {
    private int seatID;

    private int flight;

    private java.lang.String seatPosition;

    private double seatCost;

    private java.lang.String seatClass;

    public Seat() {
    }

    public Seat(
           int seatID,
           int flight,
           java.lang.String seatPosition,
           double seatCost,
           java.lang.String seatClass) {
           this.seatID = seatID;
           this.flight = flight;
           this.seatPosition = seatPosition;
           this.seatCost = seatCost;
           this.seatClass = seatClass;
    }


    /**
     * Gets the seatID value for this Seat.
     * 
     * @return seatID
     */
    public int getSeatID() {
        return seatID;
    }


    /**
     * Sets the seatID value for this Seat.
     * 
     * @param seatID
     */
    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }


    /**
     * Gets the flight value for this Seat.
     * 
     * @return flight
     */
    public int getFlight() {
        return flight;
    }


    /**
     * Sets the flight value for this Seat.
     * 
     * @param flight
     */
    public void setFlight(int flight) {
        this.flight = flight;
    }


    /**
     * Gets the seatPosition value for this Seat.
     * 
     * @return seatPosition
     */
    public java.lang.String getSeatPosition() {
        return seatPosition;
    }


    /**
     * Sets the seatPosition value for this Seat.
     * 
     * @param seatPosition
     */
    public void setSeatPosition(java.lang.String seatPosition) {
        this.seatPosition = seatPosition;
    }


    /**
     * Gets the seatCost value for this Seat.
     * 
     * @return seatCost
     */
    public double getSeatCost() {
        return seatCost;
    }


    /**
     * Sets the seatCost value for this Seat.
     * 
     * @param seatCost
     */
    public void setSeatCost(double seatCost) {
        this.seatCost = seatCost;
    }


    /**
     * Gets the seatClass value for this Seat.
     * 
     * @return seatClass
     */
    public java.lang.String getSeatClass() {
        return seatClass;
    }


    /**
     * Sets the seatClass value for this Seat.
     * 
     * @param seatClass
     */
    public void setSeatClass(java.lang.String seatClass) {
        this.seatClass = seatClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seat)) return false;
        Seat other = (Seat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.seatID == other.getSeatID() &&
            this.flight == other.getFlight() &&
            ((this.seatPosition==null && other.getSeatPosition()==null) || 
             (this.seatPosition!=null &&
              this.seatPosition.equals(other.getSeatPosition()))) &&
            this.seatCost == other.getSeatCost() &&
            ((this.seatClass==null && other.getSeatClass()==null) || 
             (this.seatClass!=null &&
              this.seatClass.equals(other.getSeatClass())));
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
        _hashCode += getSeatID();
        _hashCode += getFlight();
        if (getSeatPosition() != null) {
            _hashCode += getSeatPosition().hashCode();
        }
        _hashCode += new Double(getSeatCost()).hashCode();
        if (getSeatClass() != null) {
            _hashCode += getSeatClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Seat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flight.com/flightsService/", "Seat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "seatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "flight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "seatPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "seatCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.com/flightsService/", "seatClass"));
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
