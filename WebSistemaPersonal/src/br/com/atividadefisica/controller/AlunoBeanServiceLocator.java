/**
 * AlunoBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.atividadefisica.controller;

public class AlunoBeanServiceLocator extends org.apache.axis.client.Service implements br.com.atividadefisica.controller.AlunoBeanService {

    public AlunoBeanServiceLocator() {
    }


    public AlunoBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AlunoBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AlunoBeanPort
    private java.lang.String AlunoBeanPort_address = "http://localhost:9500/EjbSistemaPersonal/AlunoBean";

    public java.lang.String getAlunoBeanPortAddress() {
        return AlunoBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AlunoBeanPortWSDDServiceName = "AlunoBeanPort";

    public java.lang.String getAlunoBeanPortWSDDServiceName() {
        return AlunoBeanPortWSDDServiceName;
    }

    public void setAlunoBeanPortWSDDServiceName(java.lang.String name) {
        AlunoBeanPortWSDDServiceName = name;
    }

    public br.com.atividadefisica.controller.AlunoBeanRemote getAlunoBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AlunoBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAlunoBeanPort(endpoint);
    }

    public br.com.atividadefisica.controller.AlunoBeanRemote getAlunoBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.atividadefisica.controller.AlunoBeanServiceSoapBindingStub _stub = new br.com.atividadefisica.controller.AlunoBeanServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAlunoBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAlunoBeanPortEndpointAddress(java.lang.String address) {
        AlunoBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.atividadefisica.controller.AlunoBeanRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.atividadefisica.controller.AlunoBeanServiceSoapBindingStub _stub = new br.com.atividadefisica.controller.AlunoBeanServiceSoapBindingStub(new java.net.URL(AlunoBeanPort_address), this);
                _stub.setPortName(getAlunoBeanPortWSDDServiceName());
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
        if ("AlunoBeanPort".equals(inputPortName)) {
            return getAlunoBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "AlunoBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller.atividadefisica.com.br/", "AlunoBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AlunoBeanPort".equals(portName)) {
            setAlunoBeanPortEndpointAddress(address);
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
