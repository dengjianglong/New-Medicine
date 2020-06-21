package com.ssm.login.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Login;
import com.ssm.login.service.IDmService;
import com.ssm.login.service.LoginService;
@Controller
@RequestMapping("/dm")
public class DmController {
	@Autowired
	private IDmService iDmService = null;
	
	@RequestMapping("/findDm")
	public ModelAndView dm(String dmName) {
		ModelAndView mv = new ModelAndView();
		ArrayList<Dm> d=iDmService.selectByDmName(dmName);
		if(d!=null)
		{
			mv.addObject("dmName",d);
			mv.setViewName("main");
		}
		else
			mv.setViewName("fail");
		return mv;
	}	
	
	
	@RequestMapping("/findAllDM")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		List<Dm> dm = iDmService.findAll();
	
		if(dm!=null)
		{
			mv.addObject("dm",dm);
			mv.setViewName("guanli_dm");
		}
		
		return mv;
	}
	
	
	@RequestMapping("/deleteDm")
	public String deleteDm(@RequestParam("id") int id) {
		iDmService.deleteDm(id);
	
		return "redirect:findAllDM.do";
	}
	
	
	@RequestMapping("/saveDm")
	public String saveDm(Dm dm) {
		iDmService.saveDm(dm);
	
		return "redirect:findAllDM.do";
	}
	
	
}
