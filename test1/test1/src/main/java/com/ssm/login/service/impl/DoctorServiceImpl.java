package com.ssm.login.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.login.dao.DmDao;
import com.ssm.login.dao.DoctorDao;
import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Doctor;
import com.ssm.login.pojo.Dynasty;
import com.ssm.login.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService{
	 @Autowired
	    private DoctorDao doctorDao;
	    /**
	      * 查询医生信息
	     * @param dmName
	     * @return
	     */
	    @Override
	    public ArrayList<Doctor> selectByDName(String dName) {
	        return doctorDao.selectBydName(dName);
	    }
	    @Override
		public List<Doctor> findAll() {
			// TODO Auto-generated method stub
			return doctorDao.findAllDoctor();
		}
		@Override
		public void deleteDm(int id) {
			// TODO Auto-generated method stub
			doctorDao.deleteDoctor(id);
		}
		@Override
		public void saveDm(Doctor doctor) {
			// TODO Auto-generated method stub
			doctorDao.saveDoctor(doctor);
		}
		@Override
		public Doctor findByName(String dName) {
			// TODO Auto-generated method stub
			return doctorDao.findByName(dName);
		}


}
