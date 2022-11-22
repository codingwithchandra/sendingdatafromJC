package com.coding_with_chandra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpConttroller {
	
	
	@GetMapping("/load")
	public ModelAndView loadJsp( Employee employee) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("employee");
		
		return mv;
		
	}
	
	
	@PostMapping("/sendData")
	public ModelAndView sendDataFromJC(@ModelAttribute("employee") Employee employee) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("employee");
		System.out.println(employee);
		return mv;
		
	}
	
}
