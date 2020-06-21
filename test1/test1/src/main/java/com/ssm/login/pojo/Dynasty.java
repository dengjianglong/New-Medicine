package com.ssm.login.pojo;

public class Dynasty {
	private int id;
	private String dyName;
	
	private String qin;
	
	private String sanguo;
	
	private String sui;
	private String tang;
	
	private String yuan;
	
	private String qing;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDyName() {
		return dyName;
	}
	public void setDyName(String dyName) {
		this.dyName = dyName;
	}
	
	public String getQin() {
		return qin;
	}
	public void setQin(String qin) {
		this.qin = qin;
	}
	
	public String getSanguo() {
		return sanguo;
	}
	public void setSanguo(String sanguo) {
		this.sanguo = sanguo;
	}
	
	public String getSui() {
		return sui;
	}
	public void setSui(String sui) {
		this.sui = sui;
	}
	public String getTang() {
		return tang;
	}
	public void setTang(String tang) {
		this.tang = tang;
	}
	
	public String getYuan() {
		return yuan;
	}
	public void setYuan(String yuan) {
		this.yuan = yuan;
	}
	
	public String getQing() {
		return qing;
	}
	public void setQing(String qing) {
		this.qing = qing;
	}
	@Override
	public String toString() {
		return "Dynasty [id=" + id + ", dyName=" + dyName + ",  qin=" + qin + ",  sanguo=" + sanguo + ",   sui=" + sui + ", tang=" + tang
				+ ", yuan=" + yuan + ",qing=" + qing + "]";
	}

	
}
