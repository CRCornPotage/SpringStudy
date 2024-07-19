package com.example.domein.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.web.form.CreateEnqueteForm;
import com.example.web.form.CreateQuestionForm;
import com.example.web.form.CreateSelectForm;

@Service
public class TestNestedObjectServiceImpl implements TestNestedObjectService {

	@Override
	public CreateEnqueteForm initCreateSelectForm(CreateEnqueteForm createEnqueteForm) {
		
		List<CreateQuestionForm> createQuestionForms = new ArrayList<CreateQuestionForm>();
		List<CreateSelectForm> createSelectForms = new ArrayList<CreateSelectForm>();
		
		createSelectForms.add(new CreateSelectForm());
		createSelectForms.add(new CreateSelectForm());
		
		createQuestionForms.add(new CreateQuestionForm());
		createQuestionForms.add(new CreateQuestionForm());
		
		for(CreateQuestionForm createQuestionForm : createQuestionForms) {
			createQuestionForm.setCreateSelectForms(createSelectForms);
		}
		
		createEnqueteForm.setCreateQuestionForms(createQuestionForms);
		
		return createEnqueteForm;
		
	}

}
