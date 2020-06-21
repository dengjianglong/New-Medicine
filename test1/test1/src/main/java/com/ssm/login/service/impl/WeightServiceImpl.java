package com.ssm.login.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.login.dao.DmDao;
import com.ssm.login.dao.WeightDao;
import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Weight;
import com.ssm.login.service.WeightService;

@Service
public class WeightServiceImpl implements WeightService{
	@Autowired
    private WeightDao weightDao;
	@Override
    public ArrayList<Weight> selectBytDynasty(String tDynasty) {
        return weightDao.selectBytDynasty(tDynasty);
    }
	@Override
	public List<Weight> findAll() {
		// TODO Auto-generated method stub
		return weightDao.findAllWeight();
	}
	@Override
	public void deleteWeight(int id) {
		// TODO Auto-generated method stub
		weightDao.deleteWeight(id);
	}
	@Override
	public void saveWeight(Weight weight) {
		// TODO Auto-generated method stub
		weightDao.saveWeight(weight);
	}
}
