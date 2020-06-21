package com.ssm.login.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.login.dao.DmDao;
import com.ssm.login.dao.DynastyDao;
import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Doctor;
import com.ssm.login.pojo.Dynasty;
import com.ssm.login.service.DynastyService;
@Service
public class DynastyServiceImpl implements DynastyService{
	 @Autowired
	    private DynastyDao dynastyDao;
	    /**
	      * 根据医生们查询处方
	     * @param dmName
	     * @return
	     */
	    @Override
	    public ArrayList<Dynasty> selectByDyName(String dyName) {
	        return dynastyDao.selectBydyName(dyName);
	    }
		@Override
		public List<Dynasty> findAll() {
			// TODO Auto-generated method stub
			return dynastyDao.findAllDynasty();
		}
		@Override
		public void deleteDynasty(int id) {
			// TODO Auto-generated method stub
			dynastyDao.deleteDynasty(id);
		}
		@Override
		public void savedynasty(Dynasty dynasty) {
			// TODO Auto-generated method stub
			dynastyDao.saveDynasty(dynasty);
		}

}
