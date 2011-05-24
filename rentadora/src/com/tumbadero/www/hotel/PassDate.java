/**
 * PassDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tumbadero.www.hotel;

public class PassDate  implements java.io.Serializable {
    private int idPassDate;

    private boolean piscina;

    private boolean buffet;

    private boolean jacuzzi;

    private boolean gimnasio;

    private boolean deportivo;

    private float precio;

    public PassDate() {
    }

    public PassDate(
           int idPassDate,
           boolean piscina,
           boolean buffet,
           boolean jacuzzi,
           boolean gimnasio,
           boolean deportivo,
           float precio) {
           this.idPassDate = idPassDate;
           this.piscina = piscina;
           this.buffet = buffet;
           this.jacuzzi = jacuzzi;
           this.gimnasio = gimnasio;
           this.deportivo = deportivo;
           this.precio = precio;
    }


    /**
     * Gets the idPassDate value for this PassDate.
     * 
     * @return idPassDate
     */
    public int getIdPassDate() {
        return idPassDate;
    }


    /**
     * Sets the idPassDate value for this PassDate.
     * 
     * @param idPassDate
     */
    public void setIdPassDate(int idPassDate) {
        this.idPassDate = idPassDate;
    }


    /**
     * Gets the piscina value for this PassDate.
     * 
     * @return piscina
     */
    public boolean isPiscina() {
        return piscina;
    }


    /**
     * Sets the piscina value for this PassDate.
     * 
     * @param piscina
     */
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }


    /**
     * Gets the buffet value for this PassDate.
     * 
     * @return buffet
     */
    public boolean isBuffet() {
        return buffet;
    }


    /**
     * Sets the buffet value for this PassDate.
     * 
     * @param buffet
     */
    public void setBuffet(boolean buffet) {
        this.buffet = buffet;
    }


    /**
     * Gets the jacuzzi value for this PassDate.
     * 
     * @return jacuzzi
     */
    public boolean isJacuzzi() {
        return jacuzzi;
    }


    /**
     * Sets the jacuzzi value for this PassDate.
     * 
     * @param jacuzzi
     */
    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }


    /**
     * Gets the gimnasio value for this PassDate.
     * 
     * @return gimnasio
     */
    public boolean isGimnasio() {
        return gimnasio;
    }


    /**
     * Sets the gimnasio value for this PassDate.
     * 
     * @param gimnasio
     */
    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }


    /**
     * Gets the deportivo value for this PassDate.
     * 
     * @return deportivo
     */
    public boolean isDeportivo() {
        return deportivo;
    }


    /**
     * Sets the deportivo value for this PassDate.
     * 
     * @param deportivo
     */
    public void setDeportivo(boolean deportivo) {
        this.deportivo = deportivo;
    }


    /**
     * Gets the precio value for this PassDate.
     * 
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }


    /**
     * Sets the precio value for this PassDate.
     * 
     * @param precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassDate)) return false;
        PassDate other = (PassDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idPassDate == other.getIdPassDate() &&
            this.piscina == other.isPiscina() &&
            this.buffet == other.isBuffet() &&
            this.jacuzzi == other.isJacuzzi() &&
            this.gimnasio == other.isGimnasio() &&
            this.deportivo == other.isDeportivo() &&
            this.precio == other.getPrecio();
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
        _hashCode += getIdPassDate();
        _hashCode += (isPiscina() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBuffet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isJacuzzi() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGimnasio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeportivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Float(getPrecio()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PassDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tumbadero.com/hotel/", "PassDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPassDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPassDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piscina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "piscina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buffet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buffet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jacuzzi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jacuzzi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gimnasio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gimnasio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deportivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deportivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
