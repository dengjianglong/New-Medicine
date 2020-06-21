package com.ssm.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.login.pojo.Doctor;
import com.ssm.login.pojo.Dynasty;
import com.ssm.login.pojo.Medicine;
import com.ssm.login.service.DynastyService;
import com.ssm.login.service.MedicineService;
@Controller
@RequestMapping("/medicine")
public class MedicineController {
	@Autowired
	private MedicineService medicineService = null;
	

	@RequestMapping("/findAllMedicine")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		List<Medicine> medicine = medicineService.findAll();
	
		if(medicine != null)
		{
			mv.addObject("medicine",medicine);
			mv.setViewName("guanli_medicine");
		}
		
		return mv;
	}
	
	
	
	@RequestMapping("/deleteMedicine")
	public String deleteDynasty(@RequestParam("id") int id) {
		medicineService.deleteMedicine(id);
	
		return "redirect:findAllMedicine.do";
	}
	
	@RequestMapping("/saveMedicine")
	public String saveMedicine(Medicine medicine) {
		medicineService.saveMedicine(medicine);
	
		return "redirect:findAllMedicine.do";
	}
	
	
	@RequestMapping("/search")
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
}
