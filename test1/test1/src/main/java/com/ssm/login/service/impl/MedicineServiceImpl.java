package com.ssm.login.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.login.dao.DmDao;
import com.ssm.login.dao.MedicineDao;
import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Medicine;
import com.ssm.login.service.MedicineService;
@Service
public class MedicineServiceImpl implements MedicineService{
	@Autowired
	private MedicineDao medicinedao;
	@Override
    public ArrayList<Medicine> selectBymName(String mName) {
        return medicinedao.selectBymName(mName);
    }
	@Override
	public List<Medicine> findAll() {
		// TODO Auto-generated method stub
		return medicinedao.findAllMedicine();
	}
	@Override
	public void deleteMedicine(int id) {
		// TODO Auto-generated method stub
		medicinedao.deleteMedicine(id);
	}
	@Override
	public void saveMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		medicinedao.saveMedicine(medicine);
	}
	@Override
	public Medicine findByName(String mName) {
		// TODO Auto-generated method stub
		return medicinedao.findByName(mName);
	}
}
