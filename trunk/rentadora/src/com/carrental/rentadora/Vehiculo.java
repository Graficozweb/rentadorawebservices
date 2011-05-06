
/**
 * Vehiculo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:19:26 CET)
 */

package com.carrental.rentadora;


/**
 *  Vehiculo bean class
 */

public  class Vehiculo
implements org.apache.axis2.databinding.ADBBean{
	/* This type was generated from the piece of schema that had
                name = vehiculo
                Namespace URI = http://carrental.com/rentadora/
                Namespace Prefix = ns1
	 */


	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if(namespace.equals("http://carrental.com/rentadora/")){
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}



	/**
	 * field for IdVehiculo
	 */


	protected int localIdVehiculo ;


	/**
	 * Auto generated getter method
	 * @return int
	 */
	public  int getIdVehiculo(){
		return localIdVehiculo;
	}



	/**
	 * Auto generated setter method
	 * @param param IdVehiculo
	 */
	public void setIdVehiculo(int param){

		this.localIdVehiculo=param;


	}


	/**
	 * field for AnioModelo
	 */


	protected int localAnioModelo ;


	/**
	 * Auto generated getter method
	 * @return int
	 */
	public  int getAnioModelo(){
		return localAnioModelo;
	}



	/**
	 * Auto generated setter method
	 * @param param AnioModelo
	 */
	public void setAnioModelo(int param){

		this.localAnioModelo=param;


	}


	/**
	 * field for PrecioPorDia
	 */


	protected float localPrecioPorDia ;


	/**
	 * Auto generated getter method
	 * @return float
	 */
	public  float getPrecioPorDia(){
		return localPrecioPorDia;
	}



	/**
	 * Auto generated setter method
	 * @param param PrecioPorDia
	 */
	public void setPrecioPorDia(float param){

		this.localPrecioPorDia=param;


	}


	/**
	 * field for EstaRentado
	 */


	protected boolean localEstaRentado ;


	/**
	 * Auto generated getter method
	 * @return boolean
	 */
	public  boolean getEstaRentado(){
		return localEstaRentado;
	}



	/**
	 * Auto generated setter method
	 * @param param EstaRentado
	 */
	public void setEstaRentado(boolean param){

		this.localEstaRentado=param;


	}


	/**
	 * field for Modelo
	 */


	protected java.lang.String localModelo ;


	/**
	 * Auto generated getter method
	 * @return java.lang.String
	 */
	public  java.lang.String getModelo(){
		return localModelo;
	}



	/**
	 * Auto generated setter method
	 * @param param Modelo
	 */
	public void setModelo(java.lang.String param){

		this.localModelo=param;


	}


	/**
	 * field for Numper
	 */


	protected int localNumper ;


	/**
	 * Auto generated getter method
	 * @return int
	 */
	public  int getNumper(){
		return localNumper;
	}



	/**
	 * Auto generated setter method
	 * @param param Numper
	 */
	public void setNumper(int param){

		this.localNumper=param;


	}


	/**
	 * field for Numserial
	 */


	protected java.lang.String localNumserial ;


	/**
	 * Auto generated getter method
	 * @return java.lang.String
	 */
	public  java.lang.String getNumserial(){
		return localNumserial;
	}



	/**
	 * Auto generated setter method
	 * @param param Numserial
	 */
	public void setNumserial(java.lang.String param){

		this.localNumserial=param;


	}


	/**
	 * isReaderMTOMAware
	 * @return true if the reader supports MTOM
	 */
	public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
		boolean isReaderMTOMAware = false;

		try{
			isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
		}catch(java.lang.IllegalArgumentException e){
			isReaderMTOMAware = false;
		}
		return isReaderMTOMAware;
	}


	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement (
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



		org.apache.axiom.om.OMDataSource dataSource =
			new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

			public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				Vehiculo.this.serialize(parentQName,factory,xmlWriter);
			}
		};
		return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
				parentQName,factory,dataSource);

	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory,
			org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
	throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
		serialize(parentQName,factory,xmlWriter,false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory,
			org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
			boolean serializeType)
	throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




		java.lang.String prefix = null;
		java.lang.String namespace = null;


		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();

		if ((namespace != null) && (namespace.trim().length() > 0)) {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
			} else {
				if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		} else {
			xmlWriter.writeStartElement(parentQName.getLocalPart());
		}

		if (serializeType){


			java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://carrental.com/rentadora/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
						namespacePrefix+":vehiculo",
						xmlWriter);
			} else {
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
						"vehiculo",
						xmlWriter);
			}


		}

		namespace = "";
		if (! namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix,"idVehiculo", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace,"idVehiculo");
			}

		} else {
			xmlWriter.writeStartElement("idVehiculo");
		}

		if (localIdVehiculo==java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException("idVehiculo cannot be null!!");

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdVehiculo));
		}

		xmlWriter.writeEndElement();

		namespace = "";
		if (! namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix,"anioModelo", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace,"anioModelo");
			}

		} else {
			xmlWriter.writeStartElement("anioModelo");
		}

		if (localAnioModelo==java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException("anioModelo cannot be null!!");

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAnioModelo));
		}

		xmlWriter.writeEndElement();

		namespace = "";
		if (! namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix,"precioPorDia", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace,"precioPorDia");
			}

		} else {
			xmlWriter.writeStartElement("precioPorDia");
		}

		if (java.lang.Float.isNaN(localPrecioPorDia)) {

			throw new org.apache.axis2.databinding.ADBException("precioPorDia cannot be null!!");

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrecioPorDia));
		}

		xmlWriter.writeEndElement();

		namespace = "";
		if (! namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix,"estaRentado", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace,"estaRentado");
			}

		} else {
			xmlWriter.writeStartElement("estaRentado");
		}

		if (false) {

			throw new org.apache.axis2.databinding.ADBException("estaRentado cannot be null!!");

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstaRentado));
		}

		xmlWriter.writeEndElement();

		namespace = "";
		if (! namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix,"modelo", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace,"modelo");
			}

		} else {
			xmlWriter.writeStartElement("modelo");
		}


		if (localModelo==null){
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("modelo cannot be null!!");

		}else{


			xmlWriter.writeCharacters(localModelo);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		if (! namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix,"numper", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace,"numper");
			}

		} else {
			xmlWriter.writeStartElement("numper");
		}

		if (localNumper==java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException("numper cannot be null!!");

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumper));
		}

		xmlWriter.writeEndElement();

		namespace = "";
		if (! namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix,"numserial", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace,"numserial");
			}

		} else {
			xmlWriter.writeStartElement("numserial");
		}


		if (localNumserial==null){
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("numserial cannot be null!!");

		}else{


			xmlWriter.writeCharacters(localNumserial);

		}

		xmlWriter.writeEndElement();

		xmlWriter.writeEndElement();


	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
			java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);

		}

		xmlWriter.writeAttribute(namespace,attName,attValue);

	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace,java.lang.String attName,
			java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
		if (namespace.equals(""))
		{
			xmlWriter.writeAttribute(attName,attValue);
		}
		else
		{
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}
	}


	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}
	/**
	 *  method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix,namespaceURI);
			}

			if (prefix.trim().length() > 0){
				xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}


	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);

		if (prefix == null) {
			prefix = generatePrefix(namespace);

			while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}

			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}

		return prefix;
	}



	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
	throws org.apache.axis2.databinding.ADBException{



		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();


		elementList.add(new javax.xml.namespace.QName("",
		"idVehiculo"));

		elementList.add(
				org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdVehiculo));

		elementList.add(new javax.xml.namespace.QName("",
				"anioModelo"));

		elementList.add(
				org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAnioModelo));

		elementList.add(new javax.xml.namespace.QName("",
		"precioPorDia"));

		elementList.add(
				org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrecioPorDia));

		elementList.add(new javax.xml.namespace.QName("",
				"estaRentado"));

		elementList.add(
				org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstaRentado));

		elementList.add(new javax.xml.namespace.QName("",
		"modelo"));

		if (localModelo != null){
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelo));
		} else {
			throw new org.apache.axis2.databinding.ADBException("modelo cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("",
		"numper"));

		elementList.add(
				org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumper));

		elementList.add(new javax.xml.namespace.QName("",
				"numserial"));

		if (localNumserial != null){
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumserial));
		} else {
			throw new org.apache.axis2.databinding.ADBException("numserial cannot be null!!");
		}


		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



	}



	/**
	 *  Factory class that keeps the parse method
	 */
	public static class Factory{




		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 *                If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static Vehiculo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
			Vehiculo object =
				new Vehiculo();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix ="";
			java.lang.String namespaceuri ="";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();


				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
					java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
					"type");
					if (fullTypeName!=null){
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1){
							nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix==null?"":nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

						if (!"vehiculo".equals(type)){
							//find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (Vehiculo)com.carrental.rentadora.ExtensionMapper.getTypeObject(
									nsUri,type,reader);
						}


					}


				}




				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();




				reader.next();


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("","idVehiculo").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setIdVehiculo(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				}  // End of if for expected property start element

				else{
					// A start element we are not expecting indicates an invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("","anioModelo").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setAnioModelo(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				}  // End of if for expected property start element

				else{
					// A start element we are not expecting indicates an invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("","precioPorDia").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setPrecioPorDia(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));

					reader.next();

				}  // End of if for expected property start element

				else{
					// A start element we are not expecting indicates an invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("","estaRentado").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setEstaRentado(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

					reader.next();

				}  // End of if for expected property start element

				else{
					// A start element we are not expecting indicates an invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("","modelo").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setModelo(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				}  // End of if for expected property start element

				else{
					// A start element we are not expecting indicates an invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("","numper").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setNumper(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				}  // End of if for expected property start element

				else{
					// A start element we are not expecting indicates an invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("","numserial").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setNumserial(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				}  // End of if for expected property start element

				else{
					// A start element we are not expecting indicates an invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}//end of factory class



}

