package com.ssm.login.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Weight;

@Repository
public interface WeightDao {
	ArrayList<Weight> selectBytDynasty(@Param("tWeight") String tWeight);
	@Select("select * from t_weight")
	List<Weight> findAllWeight();
	
	
	@Delete("delete from t_weight where id = #{id}")
	void deleteWeight(int id);
	
	
	@Insert("insert into t_weight(tDynasty,tJin,tDan,tJun,tLiang,tZhu,tQian,tFen) values(#{tDynasty},#{tJin},#{tDan},#{tJun},#{tLiang},#{tZhu},#{tQian},#{tFen})")
	void saveWeight(Weight weight);
}
