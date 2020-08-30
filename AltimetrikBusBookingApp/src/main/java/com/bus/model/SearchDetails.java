package com.bus.model;

import java.time.LocalDate;
import java.util.Optional;

public class SearchDetails {

	private String sourceCity;
	private String destinationCity;
	private LocalDate travelDate;
	private Optional returnDate;
	private BusDetails busDetails;
	private OperatorDetails operatorDetails;
	
	public SearchDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchDetails(String sourceCity, String destinationCity,
			LocalDate travelDate, Optional returnDate, BusDetails busDetails,
			OperatorDetails operatorDetails) {
		super();
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
		this.busDetails = busDetails;
		this.operatorDetails = operatorDetails;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public Optional getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Optional returnDate) {
		this.returnDate = returnDate;
	}
	public BusDetails getBusDetails() {
		return busDetails;
	}
	public void setBusDetails(BusDetails busDetails) {
		this.busDetails = busDetails;
	}
	public OperatorDetails getOperatorDetails() {
		return operatorDetails;
	}
	public void setOperatorDetails(OperatorDetails operatorDetails) {
		this.operatorDetails = operatorDetails;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((busDetails == null) ? 0 : busDetails.hashCode());
		result = prime * result
				+ ((destinationCity == null) ? 0 : destinationCity.hashCode());
		result = prime * result
				+ ((operatorDetails == null) ? 0 : operatorDetails.hashCode());
		result = prime * result
				+ ((returnDate == null) ? 0 : returnDate.hashCode());
		result = prime * result
				+ ((sourceCity == null) ? 0 : sourceCity.hashCode());
		result = prime * result
				+ ((travelDate == null) ? 0 : travelDate.hashCode());
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
		SearchDetails other = (SearchDetails) obj;
		if (busDetails == null) {
			if (other.busDetails != null)
				return false;
		} else if (!busDetails.equals(other.busDetails))
			return false;
		if (destinationCity == null) {
			if (other.destinationCity != null)
				return false;
		} else if (!destinationCity.equals(other.destinationCity))
			return false;
		if (operatorDetails == null) {
			if (other.operatorDetails != null)
				return false;
		} else if (!operatorDetails.equals(other.operatorDetails))
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		if (sourceCity == null) {
			if (other.sourceCity != null)
				return false;
		} else if (!sourceCity.equals(other.sourceCity))
			return false;
		if (travelDate == null) {
			if (other.travelDate != null)
				return false;
		} else if (!travelDate.equals(other.travelDate))
			return false;
		return true;
	}
	
	
	
	
}
