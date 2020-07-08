package com.Varun.login.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
 
	@Id
	@GeneratedValue
	@Column(name="USERID")
	private Integer USERID;
	@Column(name="USERNAME")
	private String USERNAME;
	@Column(name="PASSWORD")
	private String PASSWORD;
	public User() {
		
	}
	public Integer getUSERID() {
		return USERID;
	}
	public void setUSERID(Integer uSERID) {
		USERID = uSERID;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
}
