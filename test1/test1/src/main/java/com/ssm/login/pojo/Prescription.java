package com.ssm.login.pojo;

public class Prescription {
	private int id;
	private String pPrescription;
	private String pFunction;
	private String pCute;
	private String pClinical;
	private String pSolution;
	private String pUse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpPrescription() {
		return pPrescription;
	}
	public void setpPrescription(String pPrescription) {
		this.pPrescription = pPrescription;
	}
	public String getpFunction() {
		return pFunction;
	}
	public void setpFunction(String pFunction) {
		this.pFunction = pFunction;
	}
	public String getpCute() {
		return pCute;
	}
	public void setpCute(String pCute) {
		this.pCute = pCute;
	}
	public String getpClinical() {
		return pClinical;
	}
	public void setpClinical(String pClinical) {
		this.pClinical = pClinical;
	}
	public String getpSolution() {
		return pSolution;
	}
	public void setpSolution(String pSolution) {
		this.pSolution = pSolution;
	}
	public String getpUse() {
		return pUse;
	}
	public void setpUse(String pUse) {
		this.pUse = pUse;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", pPrescription=" + pPrescription + ", pFunction=" + pFunction + ", pCute="
				+ pCute + ", pClinical=" + pClinical + ", pSolution=" + pSolution + ", pUse=" + pUse + "]";
	}	
}
