package com.web.sut.pro.entify;

/*
 * @author wp
 * @time 20180607
 * 管理员信息
 
 * 
 * */
public class Shop {
	private int sid;//序号 自增


	private String name;
	private String tele;//电话
	
	
	private String status;//使用状态
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
