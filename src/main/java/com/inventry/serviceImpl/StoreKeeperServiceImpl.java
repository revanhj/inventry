package com.inventry.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventry.model.StoreKeeper;
import com.inventry.repository.StoreKeeperRepository;
import com.inventry.service.StoreKeeperService;

@Service
public class StoreKeeperServiceImpl implements StoreKeeperService{

	
	@Autowired
	private StoreKeeperRepository  storeKeeperRepository;

	@Override
	public StoreKeeper StoreKeeperRegistretion(StoreKeeper storeKeeper) {
 		return storeKeeperRepository.save(storeKeeper);
	}
}
