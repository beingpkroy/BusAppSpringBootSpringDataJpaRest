package com.bus.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dao.OperatorDao;
import com.bus.dao.Entity.OperatorEntity;
import com.bus.model.OperatorDetails;
@Service
public class OperatorService {

	@Autowired
	OperatorDao operatorDao;

	public Collection<OperatorDetails> getAllOperatorDetails() {

		Collection<OperatorEntity> operator = (Collection<OperatorEntity>) operatorDao
				.findAll();
		List<OperatorDetails> operatorList = new ArrayList<OperatorDetails>();
		for (OperatorEntity operatorEntity : operator) {
			OperatorDetails operatorDetails = new OperatorDetails();
			BeanUtils.copyProperties(operatorEntity, operatorDetails);
			operatorList.add(operatorDetails);
		}

		return operatorList;

	}
}
