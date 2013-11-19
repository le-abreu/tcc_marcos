/**
 * Personal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.atividadefisica.controller;

public class Personal  extends br.com.atividadefisica.controller.Pessoa  implements java.io.Serializable {
    private br.com.atividadefisica.controller.Atividade[] atividades;

    private br.com.atividadefisica.controller.Avaliacao[] avalicoes;

    private java.lang.String curricullum;

    private br.com.atividadefisica.controller.Endereco endereco;

    private java.lang.String graduacao;

    private br.com.atividadefisica.controller.Modalidade[] modalidades;

    private int numCref;

    private br.com.atividadefisica.controller.Telefone telefone;

    public Personal() {
    }

    public Personal(
           java.lang.String cpf,
           java.util.Calendar dataCadastro,
           java.util.Calendar dataNascimento,
           java.lang.String email,
           long id,
           java.lang.String nome,
           java.lang.String rg,
           java.lang.String senha,
           java.lang.String sexo,
           br.com.atividadefisica.controller.Atividade[] atividades,
           br.com.atividadefisica.controller.Avaliacao[] avalicoes,
           java.lang.String curricullum,
           br.com.atividadefisica.controller.Endereco endereco,
           java.lang.String graduacao,
           br.com.atividadefisica.controller.Modalidade[] modalidades,
           int numCref,
           br.com.atividadefisica.controller.Telefone telefone) {
        super(
            cpf,
            dataCadastro,
            dataNascimento,
            email,
            id,
            nome,
            rg,
            senha,
            sexo);
        this.atividades = atividades;
        this.avalicoes = avalicoes;
        this.curricullum = curricullum;
        this.endereco = endereco;
        this.graduacao = graduacao;
        this.modalidades = modalidades;
        this.numCref = numCref;
        this.telefone = telefone;
    }


    /**
     * Gets the atividades value for this Personal.
     * 
     * @return atividades
     */
    public br.com.atividadefisica.controller.Atividade[] getAtividades() {
        return atividades;
    }


    /**
     * Sets the atividades value for this Personal.
     * 
     * @param atividades
     */
    public void setAtividades(br.com.atividadefisica.controller.Atividade[] atividades) {
        this.atividades = atividades;
    }

    public br.com.atividadefisica.controller.Atividade getAtividades(int i) {
        return this.atividades[i];
    }

    public void setAtividades(int i, br.com.atividadefisica.controller.Atividade _value) {
        this.atividades[i] = _value;
    }


    /**
     * Gets the avalicoes value for this Personal.
     * 
     * @return avalicoes
     */
    public br.com.atividadefisica.controller.Avaliacao[] getAvalicoes() {
        return avalicoes;
    }


    /**
     * Sets the avalicoes value for this Personal.
     * 
     * @param avalicoes
     */
    public void setAvalicoes(br.com.atividadefisica.controller.Avaliacao[] avalicoes) {
        this.avalicoes = avalicoes;
    }

    public br.com.atividadefisica.controller.Avaliacao getAvalicoes(int i) {
        return this.avalicoes[i];
    }

    public void setAvalicoes(int i, br.com.atividadefisica.controller.Avaliacao _value) {
        this.avalicoes[i] = _value;
    }


    /**
     * Gets the curricullum value for this Personal.
     * 
     * @return curricullum
     */
    public java.lang.String getCurricullum() {
        return curricullum;
    }


    /**
     * Sets the curricullum value for this Personal.
     * 
     * @param curricullum
     */
    public void setCurricullum(java.lang.String curricullum) {
        this.curricullum = curricullum;
    }


    /**
     * Gets the endereco value for this Personal.
     * 
     * @return endereco
     */
    public br.com.atividadefisica.controller.Endereco getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this Personal.
     * 
     * @param endereco
     */
    public void setEndereco(br.com.atividadefisica.controller.Endereco endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the graduacao value for this Personal.
     * 
     * @return graduacao
     */
    public java.lang.String getGraduacao() {
        return graduacao;
    }


    /**
     * Sets the graduacao value for this Personal.
     * 
     * @param graduacao
     */
    public void setGraduacao(java.lang.String graduacao) {
        this.graduacao = graduacao;
    }


    /**
     * Gets the modalidades value for this Personal.
     * 
     * @return modalidades
     */
    public br.com.atividadefisica.controller.Modalidade[] getModalidades() {
        return modalidades;
    }


    /**
     * Sets the modalidades value for this Personal.
     * 
     * @param modalidades
     */
    public void setModalidades(br.com.atividadefisica.controller.Modalidade[] modalidades) {
        this.modalidades = modalidades;
    }

    public br.com.atividadefisica.controller.Modalidade getModalidades(int i) {
        return this.modalidades[i];
    }

    public void setModalidades(int i, br.com.atividadefisica.controller.Modalidade _value) {
        this.modalidades[i] = _value;
    }


    /**
     * Gets the numCref value for this Personal.
     * 
     * @return numCref
     */
    public int getNumCref() {
        return numCref;
    }


    /**
     * Sets the numCref value for this Personal.
     * 
     * @param numCref
     */
    public void setNumCref(int numCref) {
        this.numCref = numCref;
    }


    /**
     * Gets the telefone value for this Personal.
     * 
     * @return telefone
     */
    public br.com.atividadefisica.controller.Telefone getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Personal.
     * 
     * @param telefone
     */
    public void setTelefone(br.com.atividadefisica.controller.Telefone telefone) {
        this.telefone = telefone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Personal)) return false;
        Personal other = (Personal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.atividades==null && other.getAtividades()==null) || 
             (this.atividades!=null &&
              java.util.Arrays.equals(this.atividades, other.getAtividades()))) &&
            ((this.avalicoes==null && other.getAvalicoes()==null) || 
             (this.avalicoes!=null &&
              java.util.Arrays.equals(this.avalicoes, other.getAvalicoes()))) &&
            ((this.curricullum==null && other.getCurricullum()==null) || 
             (this.curricullum!=null &&
              this.curricullum.equals(other.getCurricullum()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.graduacao==null && other.getGraduacao()==null) || 
             (this.graduacao!=null &&
              this.graduacao.equals(other.getGraduacao()))) &&
            ((this.modalidades==null && other.getModalidades()==null) || 
             (this.modalidades!=null &&
              java.util.Arrays.equals(this.modalidades, other.getModalidades()))) &&
            this.numCref == other.getNumCref() &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAtividades() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtividades());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtividades(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvalicoes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvalicoes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvalicoes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurricullum() != null) {
            _hashCode += getCurricullum().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getGraduacao() != null) {
            _hashCode += getGraduacao().hashCode();
        }
        if (getModalidades() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModalidades());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModalidades(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNumCref();
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Personal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "personal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atividades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atividades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "atividade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avalicoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avalicoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "avaliacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curricullum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curricullum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "endereco"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graduacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "graduacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalidades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modalidades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "modalidade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCref");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numCref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "telefone"));
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
