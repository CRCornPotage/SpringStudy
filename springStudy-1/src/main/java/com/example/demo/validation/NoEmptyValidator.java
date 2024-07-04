package com.example.demo.validation;

import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NoEmptyValidator implements ConstraintValidator<NoEmpty, List<?>>{

	@Override
	public boolean isValid(List<?> list, ConstraintValidatorContext context) {
		
		return list != null && !list.isEmpty();
		
	}

}
