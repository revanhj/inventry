package com.inventry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inventry.model.StoreKeeper;
import com.inventry.service.StoreKeeperService;

@RestController
@RequestMapping("storekeeper")
public class StoreKeeperController {

	
	@Autowired
	private StoreKeeperService storeKeeperService;
	
	
	@RequestMapping(value = "",method = RequestMethod.POST,produces = "application/json")
	public StoreKeeper StoreKeeperRegistretion(@RequestBody StoreKeeper storeKeeper) {
		return storeKeeperService.StoreKeeperRegistretion(storeKeeper);
	}
}
