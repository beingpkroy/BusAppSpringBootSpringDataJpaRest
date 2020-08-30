package com.bus.dao;

import org.springframework.data.repository.CrudRepository;

import com.bus.dao.Entity.OperatorEntity;

public interface OperatorDao extends  CrudRepository<OperatorEntity, Integer> {

}
