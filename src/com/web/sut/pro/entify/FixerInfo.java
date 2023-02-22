package com.web.sut.pro.entify;

public class FixerInfo {
	public String wnum;
	public String name;
	
	public String tele;
	public String work;
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public String statu;//0:待工 1：工作中 2：停工中
	public String getWnum() {
		return wnum;
	}
	public void setWnum(String wnum) {
		this.wnum = wnum;
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

}
