package com.ssm.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.login.pojo.Doctor;
import com.ssm.login.pojo.Dynasty;
import com.ssm.login.service.DoctorService;
import com.ssm.login.service.DynastyService;
@Controller
@RequestMapping("/dynasty")
public class DynastyController {
	@Autowired
	private DynastyService dynastyService = null;
	@RequestMapping("/findAllDynasty")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		List<Dynasty> dynasty = dynastyService.findAll();
	
		if(dynasty != null)
		{
			mv.addObject("dynasty",dynasty);
			mv.setViewName("guanli_dynasty");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteDynasty")
	public String deleteDynasty(@RequestParam("id") int id) {
		dynastyService.deleteDynasty(id);
	
		return "redirect:findAllDynasty.do";
	}
	
	@RequestMapping("/saveDynasty")
	public String saveDynasty(Dynasty dynasty) {
		dynastyService.savedynasty(dynasty);
	
		return "redirect:findAllDynasty.do";
	}
	
}
