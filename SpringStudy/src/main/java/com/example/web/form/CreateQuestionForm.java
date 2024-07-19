package com.example.web.form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CreateQuestionForm {
	
	private String questionName;
	
	private List<CreateSelectForm> createSelectForms = 
			new ArrayList<CreateSelectForm>();
	
}
