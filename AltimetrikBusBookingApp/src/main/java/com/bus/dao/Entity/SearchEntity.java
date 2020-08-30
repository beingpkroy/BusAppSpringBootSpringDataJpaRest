package com.bus.dao.Entity;

import java.time.LocalDate;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bus.model.BusDetails;
import com.bus.model.OperatorDetails;

@Entity
@Table(name="seachbus")
public class SearchEntity {

	@Column(name="sourcecity")
	private String sourceCity;
	
	@Column(name="destinationcity")
	private String destinationCity;
	
	@Column(name="traveldate")
	private LocalDate travelDate;
	
	@Column(name="returndate")
	private Optional returnDate;
	
	@Column(name="busdetails")
	private BusDetails busDetails;
	private OperatorDetails operatorDetails;
	public SearchEntity() {
		super();
		
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
	public String toString() {
		return "SearchEntity [sourceCity=" + sourceCity + ", destinationCity="
				+ destinationCity + ", travelDate=" + travelDate
				+ ", returnDate=" + returnDate + ", busDetails=" + busDetails
				+ ", operatorDetails=" + operatorDetails + "]";
	}
	
	
}
