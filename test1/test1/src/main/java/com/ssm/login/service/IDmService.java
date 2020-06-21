package com.ssm.login.service;

import java.util.ArrayList;
import java.util.List;

import com.ssm.login.pojo.Dm;

public interface IDmService {
	 /**
     * ����ҽ���ǲ�ѯ����
     * @param dmName
     * @return
     */
    ArrayList<Dm> selectByDmName(String dmName);

	List<Dm> selectAll();

	List<Dm> findAll();

	void deleteDm(int id);

	void saveDm(Dm dm);
    
    
}
