package com.ssm.login.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Doctor;
import com.ssm.login.pojo.Dynasty;

@Repository
public interface DynastyDao {
	ArrayList<Dynasty> selectBydyName(@Param("dyName") String dyName);
	@Select("select * from t_dynasty")
	List<Dynasty> findAllDynasty();
	
	
	@Delete("delete from t_dynasty where id = #{id}")
	void deleteDynasty(int id);
	
	@Insert("insert into t_dynasty(dyName,qin,sanguo,sui,tang,yuan,qing) values(#{dyName},#{qin},#{sanguo},#{sui},#{tang},#{yuan},#{qing})")
	void saveDynasty(Dynasty dynasty);	
}
