package com.ssm.login.service;

import java.util.ArrayList;
import java.util.List;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Weight;

public interface WeightService {
	 ArrayList<Weight> selectBytDynasty(String tDynasty);

	List<Weight> findAll();

	void deleteWeight(int id);

	void saveWeight(Weight weight);
}
