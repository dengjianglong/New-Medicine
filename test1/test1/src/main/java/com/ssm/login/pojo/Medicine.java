package com.ssm.login.pojo;

public class Medicine {
	private int id;
	private String mName;
	private String mEffect;
	private String mSmell;
	private String mKind;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmEffect() {
		return mEffect;
	}
	public void setmEffect(String mEffect) {
		this.mEffect = mEffect;
	}
	public String getmSmell() {
		return mSmell;
	}
	public void setmSmell(String mSmell) {
		this.mSmell = mSmell;
	}
	public String getmKind() {
		return mKind;
	}
	public void setmKind(String mKind) {
		this.mKind = mKind;
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", mName=" + mName + ", mEffect=" + mEffect + ", mSmell=" + mSmell + ", mKind="
				+ mKind + "]";
	}
	
}
