package com.ssm.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Weight;
import com.ssm.login.service.IDmService;
import com.ssm.login.service.WeightService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class WeightTest {
	 @Autowired
	    private WeightService weightService=null;
		
		@Test
		public void testSelectWeight() {
			System.out.println("成功");
			ArrayList<Weight> dys=weightService.selectBytDynasty("唐");
			System.out.println(dys.size());
			for(Weight dy:dys) {
				System.out.println(dy.gettDynasty()+"-"+dy.gettJin()+"-"+dy.gettDan()+"-"+dy.gettJun()+"-"+dy.gettLiang()+"-"+dy.gettZhu()+"-"+dy.gettQian()+"-"+dy.gettFen());
			}
		}
}
