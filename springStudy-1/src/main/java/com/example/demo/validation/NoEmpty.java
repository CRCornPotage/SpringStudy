package com.example.demo.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Target(ElementType.FIELD)
@Constraint(validatedBy = NoEmptyValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoEmpty {
	
	String message() default "空のリストは許可されていません";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}