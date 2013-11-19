/**
 * PersonalBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.atividadefisica.controller;

public class PersonalBeanServiceLocator extends org.apache.axis.client.Service implements br.com.atividadefisica.controller.PersonalBeanService {

    public PersonalBeanServiceLocator() {
    }


    public PersonalBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonalBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonalBeanPort
    private java.lang.String PersonalBeanPort_address = "http://localhost:9500/EjbSistemaPersonal/PersonalBean";

    public java.lang.String getPersonalBeanPortAddress() {
        return PersonalBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonalBeanPortWSDDServiceName = "PersonalBeanPort";

    public java.lang.String getPersonalBeanPortWSDDServiceName() {
        return PersonalBeanPortWSDDServiceName;
    }

    public void setPersonalBeanPortWSDDServiceName(java.lang.String name) {
        PersonalBeanPortWSDDServiceName = name;
    }

    public br.com.atividadefisica.controller.PersonalBeanRemote getPersonalBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonalBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonalBeanPort(endpoint);
    }

    public br.com.atividadefisica.controller.PersonalBeanRemote getPersonalBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.atividadefisica.controller.PersonalBeanServiceSoapBindingStub _stub = new br.com.atividadefisica.controller.PersonalBeanServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonalBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonalBeanPortEndpointAddress(java.lang.String address) {
        PersonalBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.atividadefisica.controller.PersonalBeanRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.atividadefisica.controller.PersonalBeanServiceSoapBindingStub _stub = new br.com.atividadefisica.controller.PersonalBeanServiceSoapBindingStub(new java.net.URL(PersonalBeanPort_address), this);
                _stub.setPortName(getPersonalBeanPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PersonalBeanPort".equals(inputPortName)) {
            return getPersonalBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "PersonalBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "PersonalBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonalBeanPort".equals(portName)) {
            setPersonalBeanPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
