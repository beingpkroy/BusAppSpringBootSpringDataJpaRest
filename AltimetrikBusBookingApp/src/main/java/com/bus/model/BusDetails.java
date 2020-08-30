package com.bus.model;

import java.time.LocalDate;

public class BusDetails {

	private String busName;
	private int busNumber;
	
	
	public BusDetails() {
		super();
		
	}


	public BusDetails(String busName, int busNumber) {
		super();
		this.busName = busName;
		this.busNumber = busNumber;
	}


	public String getBusName() {
		return busName;
	}


	public void setBusName(String busName) {
		this.busName = busName;
	}


	public int getBusNumber() {
		return busNumber;
	}


	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busName == null) ? 0 : busName.hashCode());
		result = prime * result + busNumber;
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
		BusDetails other = (BusDetails) obj;
		if (busName == null) {
			if (other.busName != null)
				return false;
		} else if (!busName.equals(other.busName))
			return false;
		if (busNumber != other.busNumber)
			return false;
		return true;
	}
		
	
	
}
