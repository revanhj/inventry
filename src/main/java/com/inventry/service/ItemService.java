package com.inventry.service;

import java.util.List;
import java.util.Optional;

import com.inventry.model.Item;

public interface ItemService {

	
	public Item addItem(Item item);
	public Optional<Item> getItem(int id);
	public List<Item> findAllitems();
}
