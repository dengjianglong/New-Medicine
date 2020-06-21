package com.ssm.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.login.pojo.Dm;
import com.ssm.login.pojo.Doctor;
import com.ssm.login.service.DoctorService;
import com.ssm.login.service.IDmService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService = null;
	
	
	@RequestMapping("/findAllDoctor")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		List<Doctor> doctor = doctorService.findAll();
	
		if(doctor != null)
		{
			mv.addObject("doctor",doctor);
			mv.setViewName("guanli_doctor");
		}
		
		return mv;
	}
	
	
	@RequestMapping("/deleteDoctor")
	public String deleteDoctor(@RequestParam("id") int id) {
		doctorService.deleteDm(id);
	
		return "redirect:findAllDoctor.do";
	}
	
	@RequestMapping("/saveDoctor")
	public String saveDoctor(Doctor doctor) {
		doctorService.saveDm(doctor);
	
		return "redirect:findAllDoctor.do";
	}
	

}
