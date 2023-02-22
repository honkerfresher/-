package com.web.sut.pro.entify;

/**
 * 角色表
 * */
public class RoleInfo {
	private int sid;//序号
	private String keyid;//唯一标识
	private String role;//角色名称
	private String describe;//角色描述
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getKeyid() {
		return keyid;
	}
	public void setKeyid(String keyid) {
		this.keyid = keyid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
}
