/**
 * PersonalBeanService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.atividadefisica.controller;

public interface PersonalBeanService extends javax.xml.rpc.Service {
    public java.lang.String getPersonalBeanPortAddress();

    public br.com.atividadefisica.controller.PersonalBeanRemote getPersonalBeanPort() throws javax.xml.rpc.ServiceException;

    public br.com.atividadefisica.controller.PersonalBeanRemote getPersonalBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
