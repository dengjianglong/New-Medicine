package com.ssm.login.pojo;

public class Dm {
	private int id;
	private String dmName;
	private String dmPrescription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDmName() {
		return dmName;
	}
	public void setDmName(String dmName) {
		this.dmName = dmName;
	}
	public String getDmPrescription() {
		return dmPrescription;
	}
	public void setDmPrescription(String dmPrescription) {
		this.dmPrescription = dmPrescription;
	}
	@Override
	public String toString() {
		return "Dm [id=" + id + ", dmName=" + dmName + ", dmPrescription=" + dmPrescription + "]";
	}
	
}
