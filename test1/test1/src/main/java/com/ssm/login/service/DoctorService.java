package com.ssm.login.service;

import java.util.ArrayList;
import java.util.List;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Doctor;

public interface DoctorService {
	/**
     * ����ҽ���ǲ�ѯ����
     * @param dName
     * @return
     */
	 ArrayList<Doctor> selectByDName(String dName);

	List<Doctor> findAll();

	void deleteDm(int id);

	void saveDm(Doctor doctor);

	Doctor findByName(String dName);
}
