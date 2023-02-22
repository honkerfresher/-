package com.web.sut.pro.entify;

/*
 * @author wp
 * @time 20180607
 * 管理员信息
 
 * 
 * */
public class User {
	private int sid;//序号 自增

	private String account;//账号工号
	private String password;//密码
	private String name;//管理员名字-------------name
	private String tele;//电话
	private String reg_date;//创建时间
	private String rid;//角色编号
	private String secrid;//第二角色
	public String getSecrid() {
		return secrid;
	}
	public void setSecrid(String secrid) {
		this.secrid = secrid;
	}
	private String status;//使用状态
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
