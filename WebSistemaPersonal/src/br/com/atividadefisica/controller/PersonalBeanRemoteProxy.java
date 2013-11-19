package br.com.atividadefisica.controller;

public class PersonalBeanRemoteProxy implements br.com.atividadefisica.controller.PersonalBeanRemote {
  private String _endpoint = null;
  private br.com.atividadefisica.controller.PersonalBeanRemote personalBeanRemote = null;
  
  public PersonalBeanRemoteProxy() {
    _initPersonalBeanRemoteProxy();
  }
  
  public PersonalBeanRemoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonalBeanRemoteProxy();
  }
  
  private void _initPersonalBeanRemoteProxy() {
    try {
      personalBeanRemote = (new br.com.atividadefisica.controller.PersonalBeanServiceLocator()).getPersonalBeanPort();
      if (personalBeanRemote != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personalBeanRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personalBeanRemote)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personalBeanRemote != null)
      ((javax.xml.rpc.Stub)personalBeanRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.atividadefisica.controller.PersonalBeanRemote getPersonalBeanRemote() {
    if (personalBeanRemote == null)
      _initPersonalBeanRemoteProxy();
    return personalBeanRemote;
  }
  
  public br.com.atividadefisica.controller.Personal loginPersonal(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (personalBeanRemote == null)
      _initPersonalBeanRemoteProxy();
    return personalBeanRemote.loginPersonal(arg0, arg1);
  }
  
  public boolean salvarPersonal(br.com.atividadefisica.controller.Personal arg0) throws java.rmi.RemoteException{
    if (personalBeanRemote == null)
      _initPersonalBeanRemoteProxy();
    return personalBeanRemote.salvarPersonal(arg0);
  }
  
  
}