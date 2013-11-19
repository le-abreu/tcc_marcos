/**
 * Telefone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.atividadefisica.controller;

public class Telefone  implements java.io.Serializable {

    private int ddd;

    private int ddi;

    private long id;

    private java.lang.String numero;

    private java.lang.String operadora;

    public Telefone() {
    }

    public Telefone(
           int ddd,
           int ddi,
           long id,
           java.lang.String numero,
           java.lang.String operadora) {
           this.ddd = ddd;
           this.ddi = ddi;
           this.id = id;
           this.numero = numero;
           this.operadora = operadora;
    }




    /**
     * Gets the ddd value for this Telefone.
     * 
     * @return ddd
     */
    public int getDdd() {
        return ddd;
    }


    /**
     * Sets the ddd value for this Telefone.
     * 
     * @param ddd
     */
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }


    /**
     * Gets the ddi value for this Telefone.
     * 
     * @return ddi
     */
    public int getDdi() {
        return ddi;
    }


    /**
     * Sets the ddi value for this Telefone.
     * 
     * @param ddi
     */
    public void setDdi(int ddi) {
        this.ddi = ddi;
    }


    /**
     * Gets the id value for this Telefone.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Telefone.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the numero value for this Telefone.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Telefone.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the operadora value for this Telefone.
     * 
     * @return operadora
     */
    public java.lang.String getOperadora() {
        return operadora;
    }


    /**
     * Sets the operadora value for this Telefone.
     * 
     * @param operadora
     */
    public void setOperadora(java.lang.String operadora) {
        this.operadora = operadora;
    }



    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Telefone)) return false;
        Telefone other = (Telefone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ddd == other.getDdd() &&
            this.ddi == other.getDdi() &&
            this.id == other.getId() &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.operadora==null && other.getOperadora()==null) || 
             (this.operadora!=null &&
              this.operadora.equals(other.getOperadora())));
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
        _hashCode += getDdd();
        _hashCode += getDdi();
        _hashCode += new Long(getId()).hashCode();
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getOperadora() != null) {
            _hashCode += getOperadora().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Telefone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "telefone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aluno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "aluno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "personal"));
        elemField.setMinOccurs(0);
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
