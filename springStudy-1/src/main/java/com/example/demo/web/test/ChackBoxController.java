package com.example.demo.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ChackBoxController {
	
	@GetMapping
	public String index(Model model) {
		
		model.addAttribute("chackBoxControllerForm", new ChackBoxControllerForm().initItems());
		
		return "test/index";
		
	}
	
	@PostMapping
	public String confirm(
			@Validated ChackBoxControllerForm chackBoxControllerForm, 
			BindingResult result, Model model) {
		
//		if(chackBoxControllerForm.getSelectedItems().isEmpty()) {
//			
//			result.rejectValue("selectedItems", "", "1つ以上選択して下さい");
//			chackBoxControllerForm.initItems();
//			
//		}
		
		if(result.hasErrors()) {
			
			chackBoxControllerForm.initItems(); 
			return "test/index";
			
		}
		
		model.addAttribute("chackBoxControllerForm", chackBoxControllerForm.initItems());
		model.addAttribute("yourSelectedItems", chackBoxControllerForm.getSelectedItems());
		
		return "test/index";
	
	}
	
}
