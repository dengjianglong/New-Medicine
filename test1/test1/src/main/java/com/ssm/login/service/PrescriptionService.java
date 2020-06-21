package com.ssm.login.service;

import java.util.ArrayList;
import java.util.List;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Prescription;

public interface PrescriptionService {
	ArrayList<Prescription> selectBypPrescription(String pPrescription);

	List<Prescription> findAll();

	void deletePrescription(int id);

	void savePrescription(Prescription prescription);
}
