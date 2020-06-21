package com.ssm.login.service.impl;

import com.ssm.login.dao.DmDao;
import com.ssm.login.pojo.Dm;
import com.ssm.login.service.IDmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DmServiceImpl implements IDmService {

    @Autowired
    private DmDao dmDao;
    /**
      * 根据医生们查询处方
     * @param dmName
     * @return
     */
    @Override
    public ArrayList<Dm> selectByDmName(String dmName) {
        return dmDao.selectBydmName(dmName);
    }
	@Override
	public List<Dm> selectAll() {
		// TODO Auto-generated method stub
		return dmDao.selectAll();
	}
	@Override
	public List<Dm> findAll() {
		// TODO Auto-generated method stub
		return dmDao.findAll();
	}
	@Override
	public void deleteDm(int id) {
		// TODO Auto-generated method stub
		dmDao.deleteDm(id);
	}
	@Override
	public void saveDm(Dm dm) {
		// TODO Auto-generated method stub
		dmDao.saveDm(dm);
	}
}