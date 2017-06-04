package com.rahul.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	//define controller method to show form
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	//define controller method to process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
	//put the data to the model
	@RequestMapping("/processFormVersion2")
	public String processFormVersion2(HttpServletRequest request, Model model) {
		
		//get the name of the user
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result = "Great job done :" + name;
		
		//add the result to model
		model.addAttribute("message", result);
		
		return "process-form";
	}
}
