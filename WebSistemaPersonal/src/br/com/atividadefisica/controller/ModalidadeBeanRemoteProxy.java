package br.com.atividadefisica.controller;

public class ModalidadeBeanRemoteProxy implements br.com.atividadefisica.controller.ModalidadeBeanRemote {
  private String _endpoint = null;
  private br.com.atividadefisica.controller.ModalidadeBeanRemote modalidadeBeanRemote = null;
  
  public ModalidadeBeanRemoteProxy() {
    _initModalidadeBeanRemoteProxy();
  }
  
  public ModalidadeBeanRemoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initModalidadeBeanRemoteProxy();
  }
  
  private void _initModalidadeBeanRemoteProxy() {
    try {
      modalidadeBeanRemote = (new br.com.atividadefisica.controller.ModalidadeBeanServiceLocator()).getModalidadeBeanPort();
      if (modalidadeBeanRemote != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)modalidadeBeanRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)modalidadeBeanRemote)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (modalidadeBeanRemote != null)
      ((javax.xml.rpc.Stub)modalidadeBeanRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.atividadefisica.controller.ModalidadeBeanRemote getModalidadeBeanRemote() {
    if (modalidadeBeanRemote == null)
      _initModalidadeBeanRemoteProxy();
    return modalidadeBeanRemote;
  }
  
  public br.com.atividadefisica.controller.Modalidade[] getModalidades(java.lang.String arg0) throws java.rmi.RemoteException{
    if (modalidadeBeanRemote == null)
      _initModalidadeBeanRemoteProxy();
    return modalidadeBeanRemote.getModalidades(arg0);
  }
  
  
}