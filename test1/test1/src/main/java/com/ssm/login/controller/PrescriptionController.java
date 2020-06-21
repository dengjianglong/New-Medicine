package com.ssm.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.login.pojo.Doctor;
import com.ssm.login.pojo.Dynasty;
import com.ssm.login.pojo.Prescription;
import com.ssm.login.service.DynastyService;
import com.ssm.login.service.PrescriptionService;

@Controller
@RequestMapping("/prescription")
public class PrescriptionController {
	@Autowired
	private PrescriptionService prescriptionService = null;
	@RequestMapping("/findAllPrescription")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		List<Prescription> prescription = prescriptionService.findAll();
	
		if(prescription != null)
		{
			mv.addObject("prescription",prescription);
			mv.setViewName("guanli_prescription");
		}
		
		return mv;
	}
	
	@RequestMapping("/deletePrescription")
	public String deletePrescription(@RequestParam("id") int id) {
		prescriptionService.deletePrescription(id);
	
		return "redirect:findAllPrescription.do";
	}
	
	@RequestMapping("/savePrescription")
	public String savePrescription(Prescription prescription) {
		prescriptionService.savePrescription(prescription);
	
		return "redirect:findAllPrescription.do";
	}
}
