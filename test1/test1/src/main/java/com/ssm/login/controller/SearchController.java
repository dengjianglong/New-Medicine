package com.ssm.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Medicine;
import com.ssm.login.service.DoctorService;
import com.ssm.login.service.MedicineService;
@RequestMapping("/search")
@Controller
public class SearchController {

	@Autowired
	private MedicineService medicineService = null;
	
	@Autowired
	private DoctorService doctorService = null;
	
	@RequestMapping("/medicine")
	public ModelAndView findAll(@RequestParam("mName") String mName) {
		ModelAndView mv = new ModelAndView();
		Medicine medicine =  medicineService.findByName(mName);
	
		if(medicine!=null)
		{
			mv.addObject("medicine",medicine);
			mv.setViewName("zhongyao");
		}
		
		return mv;
	}
	
	@RequestMapping("/md")
	public ModelAndView test(@RequestParam("mName") String mName) {
		ModelAndView mv = new ModelAndView();
		Medicine medicine =  medicineService.findByName(mName);
		System.out.println(medicine);
		mv.addObject("medicine",medicine);
		mv.setViewName("zhongyao");
		return mv;
	}
	
	@RequestMapping("/my")
	public ModelAndView testmy(@RequestParam("dName") String dName) {
		ModelAndView mv = new ModelAndView();
		System.out.println(doctorService.findByName(dName));
		mv.addObject("doctor",doctorService.findByName(dName));
		mv.setViewName("mingyi");
		return mv;
	}
	
	@RequestMapping("/mingyi")
	public String mingyi() {
		return "mingyi";
	}
	
	@RequestMapping("/zhongyao")
	public String zhongyao() {
		return "zhongyao";
	}
	
	@RequestMapping("/jiliang")
	public String jiliang() {
		return "jiliang";
	}
	
	@RequestMapping("/yaofang")
	public String yaofang() {
		return "yaofang";
	}
}
