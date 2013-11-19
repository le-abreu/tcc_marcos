/**
 * Aluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.atividadefisica.controller;

public class Aluno  extends br.com.atividadefisica.controller.Pessoa  implements java.io.Serializable {
    private br.com.atividadefisica.controller.Anamnese anamnese;

    private br.com.atividadefisica.controller.Atividade[] atividades;

    private br.com.atividadefisica.controller.Endereco endereco;

    private br.com.atividadefisica.controller.Avaliacao[] listaAvaliacao;

    private br.com.atividadefisica.controller.Telefone telefone;

    public Aluno() {
    }

    public Aluno(
           java.lang.String cpf,
           java.util.Calendar dataCadastro,
           java.util.Calendar dataNascimento,
           java.lang.String email,
           long id,
           java.lang.String nome,
           java.lang.String rg,
           java.lang.String senha,
           java.lang.String sexo,
           br.com.atividadefisica.controller.Anamnese anamnese,
           br.com.atividadefisica.controller.Atividade[] atividades,
           br.com.atividadefisica.controller.Endereco endereco,
           br.com.atividadefisica.controller.Avaliacao[] listaAvaliacao,
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
        this.anamnese = anamnese;
        this.atividades = atividades;
        this.endereco = endereco;
        this.listaAvaliacao = listaAvaliacao;
        this.telefone = telefone;
    }


    /**
     * Gets the anamnese value for this Aluno.
     * 
     * @return anamnese
     */
    public br.com.atividadefisica.controller.Anamnese getAnamnese() {
        return anamnese;
    }


    /**
     * Sets the anamnese value for this Aluno.
     * 
     * @param anamnese
     */
    public void setAnamnese(br.com.atividadefisica.controller.Anamnese anamnese) {
        this.anamnese = anamnese;
    }


    /**
     * Gets the atividades value for this Aluno.
     * 
     * @return atividades
     */
    public br.com.atividadefisica.controller.Atividade[] getAtividades() {
        return atividades;
    }


    /**
     * Sets the atividades value for this Aluno.
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
     * Gets the endereco value for this Aluno.
     * 
     * @return endereco
     */
    public br.com.atividadefisica.controller.Endereco getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this Aluno.
     * 
     * @param endereco
     */
    public void setEndereco(br.com.atividadefisica.controller.Endereco endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the listaAvaliacao value for this Aluno.
     * 
     * @return listaAvaliacao
     */
    public br.com.atividadefisica.controller.Avaliacao[] getListaAvaliacao() {
        return listaAvaliacao;
    }


    /**
     * Sets the listaAvaliacao value for this Aluno.
     * 
     * @param listaAvaliacao
     */
    public void setListaAvaliacao(br.com.atividadefisica.controller.Avaliacao[] listaAvaliacao) {
        this.listaAvaliacao = listaAvaliacao;
    }

    public br.com.atividadefisica.controller.Avaliacao getListaAvaliacao(int i) {
        return this.listaAvaliacao[i];
    }

    public void setListaAvaliacao(int i, br.com.atividadefisica.controller.Avaliacao _value) {
        this.listaAvaliacao[i] = _value;
    }


    /**
     * Gets the telefone value for this Aluno.
     * 
     * @return telefone
     */
    public br.com.atividadefisica.controller.Telefone getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Aluno.
     * 
     * @param telefone
     */
    public void setTelefone(br.com.atividadefisica.controller.Telefone telefone) {
        this.telefone = telefone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aluno)) return false;
        Aluno other = (Aluno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.anamnese==null && other.getAnamnese()==null) || 
             (this.anamnese!=null &&
              this.anamnese.equals(other.getAnamnese()))) &&
            ((this.atividades==null && other.getAtividades()==null) || 
             (this.atividades!=null &&
              java.util.Arrays.equals(this.atividades, other.getAtividades()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.listaAvaliacao==null && other.getListaAvaliacao()==null) || 
             (this.listaAvaliacao!=null &&
              java.util.Arrays.equals(this.listaAvaliacao, other.getListaAvaliacao()))) &&
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
        if (getAnamnese() != null) {
            _hashCode += getAnamnese().hashCode();
        }
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
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getListaAvaliacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAvaliacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAvaliacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "aluno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anamnese");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anamnese"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "anamnese"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atividades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atividades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "atividade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "endereco"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "avaliacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
