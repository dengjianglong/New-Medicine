package com.ssm.login.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.login.dao.PrescriptionDao;
import com.ssm.login.pojo.Prescription;
import com.ssm.login.service.PrescriptionService;
@Service
public class PrescriptionServiceImpl implements PrescriptionService{
		@Autowired
	    private PrescriptionDao prescriptionDao;
	    /**
	      * 根据医生们查询处方
	     * @param dmName
	     * @return
	     */
	    @Override
	    public ArrayList<Prescription> selectBypPrescription(String pPrescription) {
	        return prescriptionDao.selectBypPrescription(pPrescription);
	    }
		@Override
		public List<Prescription> findAll() {
			// TODO Auto-generated method stub
			return prescriptionDao.findAllPrescription();
		}
		@Override
		public void deletePrescription(int id) {
			// TODO Auto-generated method stub
			prescriptionDao.deletePrescription(id);
		}
		@Override
		public void savePrescription(Prescription prescription) {
			// TODO Auto-generated method stub
			prescriptionDao.savePrescription(prescription);
		}
}
