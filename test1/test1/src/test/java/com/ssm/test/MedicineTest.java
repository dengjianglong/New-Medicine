package com.ssm.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Medicine;
import com.ssm.login.service.IDmService;
import com.ssm.login.service.MedicineService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MedicineTest {
	@Autowired
    private MedicineService medicineService=null;
	@Test
	public void testSelectMedicine() {
		System.out.println("成功");
		ArrayList<Medicine> mes=medicineService.selectBymName("山药");
		System.out.println(mes.size());
		for(Medicine me:mes) {
			System.out.println(me.getmName()+"-"+me.getmEffect()+"-"+me.getmSmell()+"-"+me.getmKind());
		}
	}
}
