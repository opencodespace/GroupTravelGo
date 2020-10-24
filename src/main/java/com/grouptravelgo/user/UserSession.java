package com.grouptravelgo.user;

import org.springframework.data.mongodb.core.index.Indexed;

import com.grouptravelgo.common.MemberPrivileges;

public class UserSession {
	
	@Indexed(unique=true)
	private String 	login;
	@Indexed(unique=true)
    private String 	session;
    private final MemberPrivileges		privilege;
    
    public UserSession(String login, String session)
    {
    	this.login 		= login;
    	this.session 	= session;
    	this.privilege 	= MemberPrivileges.PRIV_LVL_USER;
    }
    
    public String getLogin()
    {
    	return login;
    }
    
    public void setLogin(String login)
    {
    	this.login = login;
    }
    
    public String getSession()
    {
    	return session;
    }
    
    public void setSession(String session)
    {
    	this.session = session;
    }
    
    public MemberPrivileges getPrivilege()
    {
    	return privilege;
    }
    
	@Override
	public String toString() {
	    StringBuilder str = new StringBuilder();
	    str.append("login:- " + getLogin() + ", session:- " + getSession() + ", privilege:- " + getPrivilege());
	    return str.toString();
	}
}
