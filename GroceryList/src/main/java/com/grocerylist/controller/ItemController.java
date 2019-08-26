package com.grocerylist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocerylist.models.GroceryItem;
import com.grocerylist.services.ItemService;

@RestController
@RequestMapping("grocery-items")

public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping
	public GroceryItem save(@RequestBody GroceryItem newItem) {
		return itemService.save(newItem);
	}
	

}
