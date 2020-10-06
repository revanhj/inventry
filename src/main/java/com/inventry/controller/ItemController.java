package com.inventry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inventry.model.Item;
import com.inventry.service.ItemService;

@RestController
@RequestMapping("item")
public class ItemController {

	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "",method = RequestMethod.POST,produces = "application/json")
	public Item addItem(@RequestBody Item item) {
		return itemService.addItem(item);
		
		
		
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = "application/json")
	public Optional<Item> getItem(@PathVariable int id) {
		return itemService.getItem(id);
		
	}
	
	@RequestMapping(value = "/all",method = RequestMethod.GET,produces = "application/json")
	public List<Item>  getAllItems(){
		return itemService.findAllitems();
		
	}
}
