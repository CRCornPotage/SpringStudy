package com.example.web.form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CreateEnqueteForm {
	
	private String enqueteName;
	
	private List<CreateQuestionForm> createQuestionForms = 
			new ArrayList<CreateQuestionForm>();
	
}
