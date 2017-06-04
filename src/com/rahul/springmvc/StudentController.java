package com.rahul.springmvc;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//add class level request mapping
@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value(value="#{countryProperties}")
	private Properties countryOptions;
	
	private String[] favLanguages = new String[]{"Java","C#", "C++","Php","Python"};

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student",new Student());
		model.addAttribute("countryOptions", countryOptions);
		model.addAttribute("favLanguages",favLanguages);
		return "student-form";
	}
	
	//@ModelAttribute("student")Student student
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student student) {
		//System.out.println(student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
}
