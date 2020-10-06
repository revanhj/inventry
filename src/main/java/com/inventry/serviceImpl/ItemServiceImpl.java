package com.inventry.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventry.model.Item;
import com.inventry.repository.ItemRepository;
import com.inventry.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public Item addItem(Item item) {
		
		Date d=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yy");
		item.setDate(sf.format(d));
 		return itemRepository.save(item);
	}

	@Override
	public Optional<Item> getItem(int id) {
 		return itemRepository.findById(id);
	}

	@Override
	public List<Item> findAllitems() {
 		return itemRepository.findAll();
	}
	
 }
