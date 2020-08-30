package com.bus.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.model.OperatorDetails;
import com.bus.service.OperatorService;

@RestController
public class OperatorController {

	@Autowired
	OperatorService operatorService;

	@GetMapping("/getAllOperatorDetails")
	ResponseEntity<Collection<OperatorDetails>> getAllOperatorDetails()
	{
		Collection<OperatorDetails> opDetails = operatorService.getAllOperatorDetails();
		System.out.println(opDetails);
		return new ResponseEntity<Collection<OperatorDetails>>(opDetails,HttpStatus.OK);
		
		
	}
}
