package com.grouptravelgo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserSignupInfo {

	@Id
	private String id;
	@Indexed(unique = true)
	private String login;
	@Indexed(unique = true)
	private String email;
	private String psw;
	private String firstName;
	private String lastName;

	public UserSignupInfo(String login, String psw, String email, String firstName, String lastName) {
		super();
		this.login = login;
		this.psw = psw;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Id:- " + getId() + ", Login:- " + getLogin() + ", Email:- " + getEmail());
		return str.toString();
	}
}
