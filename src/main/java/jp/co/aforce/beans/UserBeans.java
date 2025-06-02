package jp.co.aforce.beans;

import java.io.Serializable;

public class UserBeans implements Serializable{
	//外から変えられないようにprivateを使用
	private String MEMBER_id;
	private String PASSWORD;
	private String LAST_NAME;
	
	public void setMEMBER_id(String MEMBER_id) {
		this.MEMBER_id = MEMBER_id;
	}
	public String getMEMBER_id() {
		return MEMBER_id;
	}
	
	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setLAST_NAME(String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}

}
