package com.example.demo.web.test;

import java.io.Serializable;
import java.util.ArrayList;

import com.example.demo.validation.NoEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChackBoxControllerForm implements Serializable {
	
	private ArrayList<String> items;
	
	@NoEmpty(message = "1つ以上選択してください")
	private ArrayList<String> selectedItems;
	
	public ChackBoxControllerForm initItems() {
		
		items = new ArrayList<>();
		for(int i = 0; i < 10; i++) items.add("item_" + i);
		return this;
		
	}
	
	public String getItemsAsString() {
		
		return ChackBoxControllerForm.class.getDeclaredFields().toString();
		
	}
}
