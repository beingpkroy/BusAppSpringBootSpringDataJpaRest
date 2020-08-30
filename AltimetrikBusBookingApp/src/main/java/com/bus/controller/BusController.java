package com.bus.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.model.BusDetails;
import com.bus.service.BusService;

@RestController
public class BusController {

	@Autowired
	BusService busService;
	@GetMapping("/getBusDetails")
	
	ResponseEntity<Collection<BusDetails>> getBusDetails(){
		Collection<BusDetails> busDetails = busService.getAllBus();
		System.out.println(busDetails);
		return new ResponseEntity<Collection<BusDetails>>(busDetails,HttpStatus.OK);
	
		
	}
}
