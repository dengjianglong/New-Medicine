package com.ssm.login.dao;


import org.springframework.stereotype.Repository;

import com.ssm.login.pojo.Login;


@Repository
public interface LoginDao {
	
	public Login getLogin(Login login);
}
