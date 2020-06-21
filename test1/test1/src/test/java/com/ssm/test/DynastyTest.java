package com.ssm.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.login.pojo.Doctor;
import com.ssm.login.pojo.Dynasty;
import com.ssm.login.service.DoctorService;
import com.ssm.login.service.DynastyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DynastyTest {
	@Autowired
    private DynastyService dynastyService=null;
	@Test
	public void testSelectDynasty() {
		System.out.println("成功");
		ArrayList<Dynasty> dy=dynastyService.selectByDyName("山药");
		System.out.println(dy.size());
		for(Dynasty dynasty:dy) {
			System.out.println(dynasty.getDyName()+"-"+dynasty.getQin()+"-"+dynasty.getSanguo()+"-"+dynasty.getSui()+"-"+dynasty.getTang()+"-"+dynasty.getYuan()+"-"+dynasty.getQing());
		}
	}
}
