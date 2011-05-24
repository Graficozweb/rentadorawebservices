/**
 * Reservacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tumbadero.www.hotel;

public class Reservacion  implements java.io.Serializable {
    private int idReservacion;

    private com.tumbadero.www.hotel.Cliente cliente;

    private java.util.Date fecha;

    private com.tumbadero.www.hotel.Habitacion habitacion;

    public Reservacion() {
    }

    public Reservacion(
           int idReservacion,
           com.tumbadero.www.hotel.Cliente cliente,
           java.util.Date fecha,
           com.tumbadero.www.hotel.Habitacion habitacion) {
           this.idReservacion = idReservacion;
           this.cliente = cliente;
           this.fecha = fecha;
           this.habitacion = habitacion;
    }


    /**
     * Gets the idReservacion value for this Reservacion.
     * 
     * @return idReservacion
     */
    public int getIdReservacion() {
        return idReservacion;
    }


    /**
     * Sets the idReservacion value for this Reservacion.
     * 
     * @param idReservacion
     */
    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }


    /**
     * Gets the cliente value for this Reservacion.
     * 
     * @return cliente
     */
    public com.tumbadero.www.hotel.Cliente getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this Reservacion.
     * 
     * @param cliente
     */
    public void setCliente(com.tumbadero.www.hotel.Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the fecha value for this Reservacion.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Reservacion.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the habitacion value for this Reservacion.
     * 
     * @return habitacion
     */
    public com.tumbadero.www.hotel.Habitacion getHabitacion() {
        return habitacion;
    }


    /**
     * Sets the habitacion value for this Reservacion.
     * 
     * @param habitacion
     */
    public void setHabitacion(com.tumbadero.www.hotel.Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reservacion)) return false;
        Reservacion other = (Reservacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idReservacion == other.getIdReservacion() &&
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.habitacion==null && other.getHabitacion()==null) || 
             (this.habitacion!=null &&
              this.habitacion.equals(other.getHabitacion())));
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
        _hashCode += getIdReservacion();
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getHabitacion() != null) {
            _hashCode += getHabitacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reservacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tumbadero.com/hotel/", "Reservacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idReservacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idReservacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tumbadero.com/hotel/", "Cliente"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("habitacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "habitacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tumbadero.com/hotel/", "Habitacion"));
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
