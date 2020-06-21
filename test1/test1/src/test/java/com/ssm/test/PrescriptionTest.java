package com.ssm.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Prescription;
import com.ssm.login.service.IDmService;
import com.ssm.login.service.PrescriptionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class PrescriptionTest {
	@Autowired
    private PrescriptionService prescriptionService=null;
	
	@Test
	public void testSelectPrescription() {
		System.out.println("成功");
		ArrayList<Prescription> pre=prescriptionService.selectBypPrescription("小青龙汤");
		System.out.println(pre.size());
		for(Prescription pr:pre) {
			System.out.println(pr.getpPrescription()+"-"+pr.getpFunction()+"-"+pr.getpCute()+"-"+pr.getpClinical()+"-"+pr.getpSolution()+"-"+pr.getpUse());
		}
	}
}
