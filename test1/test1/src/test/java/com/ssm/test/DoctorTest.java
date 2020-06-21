package com.ssm.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Doctor;
import com.ssm.login.service.DoctorService;
import com.ssm.login.service.IDmService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DoctorTest {
	@Autowired
    private DoctorService doctorService=null;
	@Test
	public void testSelectDoctor() {
		System.out.println("成功");
		ArrayList<Doctor> doc=doctorService.selectByDName("扁鹊");
		System.out.println(doc.size());
		for(Doctor doctor:doc) {
			System.out.println(doctor.getdName()+"-"+doctor.getdBrief()+"-"+doctor.getdPic());
		}
	}
}
