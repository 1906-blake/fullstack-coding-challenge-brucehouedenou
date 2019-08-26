package com.grocerylist.services;

import com.grocerylist.models.GroceryItem;

public class ItemService {

	public GroceryItem save(GroceryItem newItem) {
		
		return itemRepo.save(newItem);
	}

}
