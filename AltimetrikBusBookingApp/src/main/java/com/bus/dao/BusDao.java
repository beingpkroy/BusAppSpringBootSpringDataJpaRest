package com.bus.dao;

import org.springframework.data.repository.CrudRepository;

import com.bus.dao.Entity.BusEntity;
import com.bus.model.BusDetails;

public interface BusDao extends CrudRepository<BusEntity, Integer>{

}
