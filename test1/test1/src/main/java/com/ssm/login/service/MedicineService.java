package com.ssm.login.service;

import java.util.ArrayList;
import java.util.List;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Medicine;

public interface MedicineService {
	ArrayList<Medicine> selectBymName(String mName);

	List<Medicine> findAll();

	void deleteMedicine(int id);

	void saveMedicine(Medicine medicine);

	Medicine findByName(String mName);
}
