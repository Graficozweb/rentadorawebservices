/**
 * Habitacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tumbadero.www.hotel;

public class Habitacion  implements java.io.Serializable {
    private int idHabitacion;

    private java.lang.String tipo;

    private java.lang.String tamanio;

    private int capacidad;

    private float precioNoche;

    private boolean libre;

    public Habitacion() {
    }

    public Habitacion(
           int idHabitacion,
           java.lang.String tipo,
           java.lang.String tamanio,
           int capacidad,
           float precioNoche,
           boolean libre) {
           this.idHabitacion = idHabitacion;
           this.tipo = tipo;
           this.tamanio = tamanio;
           this.capacidad = capacidad;
           this.precioNoche = precioNoche;
           this.libre = libre;
    }


    /**
     * Gets the idHabitacion value for this Habitacion.
     * 
     * @return idHabitacion
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }


    /**
     * Sets the idHabitacion value for this Habitacion.
     * 
     * @param idHabitacion
     */
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }


    /**
     * Gets the tipo value for this Habitacion.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Habitacion.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the tamanio value for this Habitacion.
     * 
     * @return tamanio
     */
    public java.lang.String getTamanio() {
        return tamanio;
    }


    /**
     * Sets the tamanio value for this Habitacion.
     * 
     * @param tamanio
     */
    public void setTamanio(java.lang.String tamanio) {
        this.tamanio = tamanio;
    }


    /**
     * Gets the capacidad value for this Habitacion.
     * 
     * @return capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }


    /**
     * Sets the capacidad value for this Habitacion.
     * 
     * @param capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    /**
     * Gets the precioNoche value for this Habitacion.
     * 
     * @return precioNoche
     */
    public float getPrecioNoche() {
        return precioNoche;
    }


    /**
     * Sets the precioNoche value for this Habitacion.
     * 
     * @param precioNoche
     */
    public void setPrecioNoche(float precioNoche) {
        this.precioNoche = precioNoche;
    }


    /**
     * Gets the libre value for this Habitacion.
     * 
     * @return libre
     */
    public boolean isLibre() {
        return libre;
    }


    /**
     * Sets the libre value for this Habitacion.
     * 
     * @param libre
     */
    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Habitacion)) return false;
        Habitacion other = (Habitacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idHabitacion == other.getIdHabitacion() &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.tamanio==null && other.getTamanio()==null) || 
             (this.tamanio!=null &&
              this.tamanio.equals(other.getTamanio()))) &&
            this.capacidad == other.getCapacidad() &&
            this.precioNoche == other.getPrecioNoche() &&
            this.libre == other.isLibre();
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
        _hashCode += getIdHabitacion();
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getTamanio() != null) {
            _hashCode += getTamanio().hashCode();
        }
        _hashCode += getCapacidad();
        _hashCode += new Float(getPrecioNoche()).hashCode();
        _hashCode += (isLibre() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Habitacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tumbadero.com/hotel/", "Habitacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idHabitacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idHabitacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tamanio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tamanio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capacidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precioNoche");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precioNoche"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "libre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
