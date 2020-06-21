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
@Repository
public interface DoctorDao {
	ArrayList<Doctor> selectBydName(@Param("dName") String dName);

	
	@Select("select * from t_doctor")
	List<Doctor> findAllDoctor();


	@Delete("delete from t_doctor where id = #{id}")
	void deleteDoctor(int id);


	@Insert("insert into t_doctor(dName,dBrief,dPic,dplace,dbirth) values(#{dName},#{dBrief},#{dPic},#{dplace},#{dbirth})")
	void saveDoctor(Doctor doctor);


	@Select("select * from t_doctor where dName = #{dName}")
	Doctor findByName(String dName);
}
