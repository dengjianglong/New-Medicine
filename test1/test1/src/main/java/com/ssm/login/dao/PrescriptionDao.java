package com.ssm.login.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Prescription;
@Repository
public interface PrescriptionDao {
	ArrayList<Prescription> selectBypPrescription(@Param("pPrescription") String pPrescription);
	@Select("select * from t_prescription")
	List<Prescription> findAllPrescription();
	
	
	@Delete("delete from t_prescription where id = #{id}")
	void deletePrescription(int id);
	
	@Insert("insert into t_prescription(pPrescription,pFunction,pCute,pClinical,pSolution,pUse) values(#{pPrescription},#{pFunction},#{pCute},#{pClinical},#{pSolution},#{pUse})")
	void savePrescription(Prescription prescription);
}
