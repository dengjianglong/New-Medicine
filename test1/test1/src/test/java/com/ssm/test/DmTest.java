package com.ssm.test;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ssm.login.dao.DmDao;
import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Login;
import com.ssm.login.service.IDmService;
import com.ssm.login.service.LoginService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DmTest {

    @Autowired
    private IDmService dmService=null;
	
	@Test
	public void testSelectDm() {
		System.out.println("成功");
		ArrayList<Dm> dms=dmService.selectByDmName("扁鹊");
		System.out.println(dms.size());
		for(Dm dm:dms) {
			System.out.println(dm.getDmName()+"-"+dm.getDmPrescription());
		}
	}
}
