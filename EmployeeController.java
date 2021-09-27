package com.codewithflex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import come.codewithflex.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;
	//display list of employees
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", employeeservice.getAllEmployees());
		return "index";
	}
}
