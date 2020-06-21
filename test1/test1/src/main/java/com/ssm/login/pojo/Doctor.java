package com.ssm.login.pojo;

public class Doctor {
	private int id;
	private String dName;
	private String dBrief;
	private String dPic;
	private String dplace;
	private String dbirth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdBrief() {
		return dBrief;
	}
	public void setdBrief(String dBrief) {
		this.dBrief = dBrief;
	}
	public String getdPic() {
		return dPic;
	}
	public void setdPic(String dPic) {
		this.dPic = dPic;
	}
	public String getDplace() {
		return dplace;
	}
	public void setDplace(String dplace) {
		this.dplace = dplace;
	}
	public String getDbirth() {
		return dbirth;
	}
	public void setDbirth(String dbirth) {
		this.dbirth = dbirth;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", dName=" + dName + ", dBrief=" + dBrief + ", dPic=" + dPic + ", dplace=" + dplace
				+ ", dbirth=" + dbirth + "]";
	}
	

	
}
