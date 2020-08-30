package com.bus.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dao.BusDao;
import com.bus.dao.Entity.BusEntity;
import com.bus.model.BusDetails;

@Service
public class BusService {

	@Autowired
	BusDao busDao;
	
	//getAllBusDetails
	
	public Collection<BusDetails> getAllBus()
	{
		Collection<BusEntity> list = (Collection<BusEntity>) busDao.findAll();
		List<BusDetails> busDetailsList = new ArrayList<BusDetails>();
		for(BusEntity busEntity : list){
			
			BusDetails busDetails = new BusDetails();
			BeanUtils.copyProperties(busEntity,busDetails);
			busDetailsList.add(busDetails);
		}
		return busDetailsList;
	}
}
