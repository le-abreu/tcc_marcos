/**
 * PersonalBeanRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.atividadefisica.controller;

public interface PersonalBeanRemote extends java.rmi.Remote {
    public br.com.atividadefisica.controller.Personal loginPersonal(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public boolean salvarPersonal(br.com.atividadefisica.controller.Personal arg0) throws java.rmi.RemoteException;
}
