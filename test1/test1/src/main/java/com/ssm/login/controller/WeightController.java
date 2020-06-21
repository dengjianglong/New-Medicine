package com.ssm.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.login.pojo.Doctor;
import com.ssm.login.pojo.Dynasty;
import com.ssm.login.pojo.Weight;
import com.ssm.login.service.DynastyService;
import com.ssm.login.service.WeightService;

@Controller
@RequestMapping("/weight")
public class WeightController {
	@Autowired
	private WeightService weightService = null;
	@RequestMapping("/findAllWeight")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		List<Weight> weight = weightService.findAll();
	
		if(weight != null)
		{
			mv.addObject("weight",weight);
			mv.setViewName("guanli_weight");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteWeight")
	public String deleteWeight(@RequestParam("id") int id) {
		weightService.deleteWeight(id);
	
		return "redirect:findAllWeight.do";
	}
	
	
	@RequestMapping("/saveWeight")
	public String saveeWeight(Weight weight) {
		weightService.saveWeight(weight);
	
		return "redirect:findAllWeight.do";
	}
}
