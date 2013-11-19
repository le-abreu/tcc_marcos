package br.com.atividadefisica.controller;

public class AlunoBeanRemoteProxy implements br.com.atividadefisica.controller.AlunoBeanRemote {
  private String _endpoint = null;
  private br.com.atividadefisica.controller.AlunoBeanRemote alunoBeanRemote = null;
  
  public AlunoBeanRemoteProxy() {
    _initAlunoBeanRemoteProxy();
  }
  
  public AlunoBeanRemoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initAlunoBeanRemoteProxy();
  }
  
  private void _initAlunoBeanRemoteProxy() {
    try {
      alunoBeanRemote = (new br.com.atividadefisica.controller.AlunoBeanServiceLocator()).getAlunoBeanPort();
      if (alunoBeanRemote != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)alunoBeanRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)alunoBeanRemote)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (alunoBeanRemote != null)
      ((javax.xml.rpc.Stub)alunoBeanRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.atividadefisica.controller.AlunoBeanRemote getAlunoBeanRemote() {
    if (alunoBeanRemote == null)
      _initAlunoBeanRemoteProxy();
    return alunoBeanRemote;
  }
  
  public boolean salvarAluno(br.com.atividadefisica.controller.Aluno arg0) throws java.rmi.RemoteException{
    if (alunoBeanRemote == null)
      _initAlunoBeanRemoteProxy();
    return alunoBeanRemote.salvarAluno(arg0);
  }
  
  public br.com.atividadefisica.controller.Aluno loginAluno(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (alunoBeanRemote == null)
      _initAlunoBeanRemoteProxy();
    return alunoBeanRemote.loginAluno(arg0, arg1);
  }
  
  
}