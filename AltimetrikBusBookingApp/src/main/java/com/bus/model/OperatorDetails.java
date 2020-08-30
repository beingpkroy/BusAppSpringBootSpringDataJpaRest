package com.bus.model;

public class OperatorDetails {

	private String operatorName;
	private int operatorId;
	public OperatorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OperatorDetails(String operatorName, int operatorId) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + operatorId;
		result = prime * result
				+ ((operatorName == null) ? 0 : operatorName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperatorDetails other = (OperatorDetails) obj;
		if (operatorId != other.operatorId)
			return false;
		if (operatorName == null) {
			if (other.operatorName != null)
				return false;
		} else if (!operatorName.equals(other.operatorName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OperatorDetails [operatorName=" + operatorName
				+ ", operatorId=" + operatorId + "]";
	}
	
	
	
}
