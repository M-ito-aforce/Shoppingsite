package jp.co.aforce.beans;

import java.io.Serializable;

public class User_beans implements Serializable{
	private String MEMBER_id;
	private String PASSWORD;
	private String LAST_NAME;
	
	
	public String getMEMBER_id() {
		return MEMBER_id;
	}
	public void setMEMBER_id(String MEMBER_id) {
		this.MEMBER_id = MEMBER_id;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}

}
