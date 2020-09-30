package com.grouptravelgo.webapp;

public class UserLoginInfo {

	private String login;
    private String psw;
    
    public UserLoginInfo(String login, String psw)
    {
    	this.login 	= login;
    	this.psw	= psw;
    }
    
    public String getLogin() {
	  return login;
	 }
    
	 public void setLogin(String login) {
	  this.login = login;
	 }
	 
	public String getPsw() {
		return psw;
	}
	  
	 public void setPsw(String psw) {
		 this.psw = psw;
	}
    
}
