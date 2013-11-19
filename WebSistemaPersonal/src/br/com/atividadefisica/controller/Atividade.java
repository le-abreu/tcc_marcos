/**
 * Atividade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.atividadefisica.controller;

public class Atividade  implements java.io.Serializable {
    private br.com.atividadefisica.controller.Aluno aluno;

    private java.util.Calendar dataHoraFim;

    private java.util.Calendar dataHoraInicio;

    private java.lang.String descricao;

    private long id;

    private br.com.atividadefisica.controller.Modalidade modalidade;

    private java.lang.String nome;

    private java.lang.String objTreino;

    private br.com.atividadefisica.controller.Personal personal;

    public Atividade() {
    }

    public Atividade(
           br.com.atividadefisica.controller.Aluno aluno,
           java.util.Calendar dataHoraFim,
           java.util.Calendar dataHoraInicio,
           java.lang.String descricao,
           long id,
           br.com.atividadefisica.controller.Modalidade modalidade,
           java.lang.String nome,
           java.lang.String objTreino,
           br.com.atividadefisica.controller.Personal personal) {
           this.aluno = aluno;
           this.dataHoraFim = dataHoraFim;
           this.dataHoraInicio = dataHoraInicio;
           this.descricao = descricao;
           this.id = id;
           this.modalidade = modalidade;
           this.nome = nome;
           this.objTreino = objTreino;
           this.personal = personal;
    }


    /**
     * Gets the aluno value for this Atividade.
     * 
     * @return aluno
     */
    public br.com.atividadefisica.controller.Aluno getAluno() {
        return aluno;
    }


    /**
     * Sets the aluno value for this Atividade.
     * 
     * @param aluno
     */
    public void setAluno(br.com.atividadefisica.controller.Aluno aluno) {
        this.aluno = aluno;
    }


    /**
     * Gets the dataHoraFim value for this Atividade.
     * 
     * @return dataHoraFim
     */
    public java.util.Calendar getDataHoraFim() {
        return dataHoraFim;
    }


    /**
     * Sets the dataHoraFim value for this Atividade.
     * 
     * @param dataHoraFim
     */
    public void setDataHoraFim(java.util.Calendar dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }


    /**
     * Gets the dataHoraInicio value for this Atividade.
     * 
     * @return dataHoraInicio
     */
    public java.util.Calendar getDataHoraInicio() {
        return dataHoraInicio;
    }


    /**
     * Sets the dataHoraInicio value for this Atividade.
     * 
     * @param dataHoraInicio
     */
    public void setDataHoraInicio(java.util.Calendar dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }


    /**
     * Gets the descricao value for this Atividade.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Atividade.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the id value for this Atividade.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Atividade.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the modalidade value for this Atividade.
     * 
     * @return modalidade
     */
    public br.com.atividadefisica.controller.Modalidade getModalidade() {
        return modalidade;
    }


    /**
     * Sets the modalidade value for this Atividade.
     * 
     * @param modalidade
     */
    public void setModalidade(br.com.atividadefisica.controller.Modalidade modalidade) {
        this.modalidade = modalidade;
    }


    /**
     * Gets the nome value for this Atividade.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Atividade.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the objTreino value for this Atividade.
     * 
     * @return objTreino
     */
    public java.lang.String getObjTreino() {
        return objTreino;
    }


    /**
     * Sets the objTreino value for this Atividade.
     * 
     * @param objTreino
     */
    public void setObjTreino(java.lang.String objTreino) {
        this.objTreino = objTreino;
    }


    /**
     * Gets the personal value for this Atividade.
     * 
     * @return personal
     */
    public br.com.atividadefisica.controller.Personal getPersonal() {
        return personal;
    }


    /**
     * Sets the personal value for this Atividade.
     * 
     * @param personal
     */
    public void setPersonal(br.com.atividadefisica.controller.Personal personal) {
        this.personal = personal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Atividade)) return false;
        Atividade other = (Atividade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aluno==null && other.getAluno()==null) || 
             (this.aluno!=null &&
              this.aluno.equals(other.getAluno()))) &&
            ((this.dataHoraFim==null && other.getDataHoraFim()==null) || 
             (this.dataHoraFim!=null &&
              this.dataHoraFim.equals(other.getDataHoraFim()))) &&
            ((this.dataHoraInicio==null && other.getDataHoraInicio()==null) || 
             (this.dataHoraInicio!=null &&
              this.dataHoraInicio.equals(other.getDataHoraInicio()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.id == other.getId() &&
            ((this.modalidade==null && other.getModalidade()==null) || 
             (this.modalidade!=null &&
              this.modalidade.equals(other.getModalidade()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.objTreino==null && other.getObjTreino()==null) || 
             (this.objTreino!=null &&
              this.objTreino.equals(other.getObjTreino()))) &&
            ((this.personal==null && other.getPersonal()==null) || 
             (this.personal!=null &&
              this.personal.equals(other.getPersonal())));
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
        if (getAluno() != null) {
            _hashCode += getAluno().hashCode();
        }
        if (getDataHoraFim() != null) {
            _hashCode += getDataHoraFim().hashCode();
        }
        if (getDataHoraInicio() != null) {
            _hashCode += getDataHoraInicio().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getModalidade() != null) {
            _hashCode += getModalidade().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getObjTreino() != null) {
            _hashCode += getObjTreino().hashCode();
        }
        if (getPersonal() != null) {
            _hashCode += getPersonal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Atividade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "atividade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aluno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "aluno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHoraFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataHoraFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHoraInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataHoraInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "modalidade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objTreino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objTreino"));
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
