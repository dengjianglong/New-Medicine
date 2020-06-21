package com.ssm.login.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.login.pojo.Login;
import com.ssm.login.service.IDmService;
import com.ssm.login.service.LoginService;

@Controller
@RequestMapping("/login")
//鍙互閰嶇疆鏁版嵁妯″瀷鐨勫悕绉板拰绫诲瀷锛屼袱鑰呭彇鎴栧叧绯�
public class LoginController {
	
	@Autowired
	private LoginService loginService = null;
	
	@Autowired
	private IDmService dm = null;
	
	@RequestMapping("/login")
	public ModelAndView login(Login login) {
		ModelAndView mv = new ModelAndView();
		Login l = loginService.getLogin(login);
		if(l!=null)
		{
		  System.out.println(l);
		  mv.addObject("login", l); 
		  mv.setViewName("main");
		}
		else
			mv.setViewName("fail");
		return mv;
	}
	
	@RequestMapping("/manager")
	public String manager() {
		return "login";
	}
	
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/test")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();
		
		ArrayList<String> array = new ArrayList<>();
		array.add("zhangsan");
		array.add("lisi");
		array.add("wangwu");
		mv.addObject("main",array);
		mv.addObject("dm",dm.selectAll());
		mv.setViewName("test2");
		return mv;
	}
	
}
