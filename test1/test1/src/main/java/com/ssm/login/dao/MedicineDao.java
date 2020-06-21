package com.ssm.login.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Dynasty;
import com.ssm.login.pojo.Medicine;
@Repository
public interface MedicineDao {
	ArrayList<Medicine> selectBymName(@Param("mName") String mName);
	@Select("select * from t_medicine")
	List<Medicine> findAllMedicine();
	
	@Delete("delete from t_medicine where id = #{id}")
	void deleteMedicine(int id);
	
	
	@Insert("insert into t_medicine(mName,mEffect,mSmell,mKind) values(#{mName},#{mEffect},#{mSmell},#{mKind})")
	void saveMedicine(Medicine medicine);
	
	@Select("select * from t_medicine where mName = #{mName}")
	Medicine findByName(String mName);	
}
