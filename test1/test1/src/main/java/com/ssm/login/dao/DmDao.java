package com.ssm.login.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.ssm.login.pojo.Dm;
@Repository
public interface DmDao {
	ArrayList<Dm> selectBydmName(@Param("dmName") String dmName);
	
	@Select("select * from t_dm order by dmName")
	List<Dm> selectAll();

	@Select("select * from t_dm")
	List<Dm> findAll();

	@Delete("delete from t_dm where id=#{id}")
	void deleteDm(int id);

	@Insert("insert into t_dm(dmName,dmPrescription) values(#{dmName},#{dmPrescription})")
	void saveDm(Dm dm);
	
}
