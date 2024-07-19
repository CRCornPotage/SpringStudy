package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domein.service.TestNestedObjectService;
import com.example.web.form.CreateEnqueteForm;

@Controller
@RequestMapping("/nested")
public class TestNestedObjectController {
	
	private final TestNestedObjectService testNestedObjectService;
	
	public TestNestedObjectController(
			TestNestedObjectService testNestedObjectService) {
		this.testNestedObjectService = testNestedObjectService;
	}

	@GetMapping
	public String index(Model model) {
		
		model.addAttribute(
				testNestedObjectService.initCreateSelectForm(
						new CreateEnqueteForm()));
		
		return "nested/index";
		
	}
	
}
