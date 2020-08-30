package com.bus.dao.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operatordetails")
public class OperatorEntity {

	@Column(name="operatorname")
	private String operatorName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="operatorid")
	private int operatorId;

	public OperatorEntity() {
		super();
		
	}

	public OperatorEntity(String operatorName, int operatorId) {
		super();
		this.operatorName = operatorName;
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	@Override
	public String toString() {
		return "OperatorEntity [operatorName=" + operatorName + ", operatorId="
				+ operatorId + "]";
	}
	
	
	
}
